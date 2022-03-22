package com.dhbrasil.springboot.Aula21.dao.impl;

import com.dhbrasil.springboot.Aula21.dao.IDao;
import com.dhbrasil.springboot.Aula21.dao.config.ConfiguracaoJDBC;
import com.dhbrasil.springboot.Aula21.model.Dentista;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DentistaDaoH2 implements IDao<Dentista> {
    private ConfiguracaoJDBC configuracaoJDBC;

    public DentistaDaoH2() {
        this.configuracaoJDBC = new ConfiguracaoJDBC();
    }


    @Override
    public Dentista salvar(Dentista dentista) {
        Connection conexao = configuracaoJDBC.conectarComBancoDeDados();
        PreparedStatement pstmt = null;

        String query = String.format("INSERT INTO dentistas " +
                        "(nome ,email, numMatricula, atendeConvenio) " +
                        "VALUES ('%s','%s','%s','%s')",
                dentista.getNome(),
                dentista.getEmail(),
                dentista.getNumMatricula(),
                dentista.getAtendeConvenio());

        try {
            pstmt = conexao.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            pstmt.executeUpdate();
            ResultSet keys = pstmt.getGeneratedKeys();
            if (keys.next())
                dentista.setId(keys.getInt(1));
            pstmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dentista;
    }

    @Override
    public Optional<Dentista> buscar(Integer id) {
        return Optional.empty();
    }

    @Override
    public void excluir(Integer id) {
        Connection conexao = configuracaoJDBC.conectarComBancoDeDados();
        Statement stmt = null;
        String query = String.format("DELETE FROM dentistas WHERE id = '%s'", id);
        try {
            stmt = conexao.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Dentista> buscarTodos() {
        Connection conexao = configuracaoJDBC.conectarComBancoDeDados();
        PreparedStatement pstmt = null;
        String query = "SELECT * FROM dentistas";
        List<Dentista> dentistas = new ArrayList<>();
        try {
            pstmt = conexao.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                dentistas.add(criarObjetoDentista(rs));
            }
            pstmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dentistas;
    }

    private Dentista criarObjetoDentista(ResultSet rs) throws SQLException {
        return new Dentista(
                rs.getInt("id"),
                rs.getString("nome"),
                rs.getString("email"),
                rs.getInt("numMatricula"),
                rs.getInt("atendeConvenio")
        );
    }

    @Override
    public Dentista atualizar(Dentista dentista) {
        return null;
    }
}
