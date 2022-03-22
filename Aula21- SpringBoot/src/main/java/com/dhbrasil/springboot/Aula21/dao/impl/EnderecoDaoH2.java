package com.dhbrasil.springboot.Aula21.dao.impl;

import com.dhbrasil.springboot.Aula21.dao.IDao;
import com.dhbrasil.springboot.Aula21.dao.config.ConfiguracaoJDBC;
import com.dhbrasil.springboot.Aula21.model.Endereco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EnderecoDaoH2 implements IDao<Endereco> {
    private ConfiguracaoJDBC configuracaoJDBC;

        public EnderecoDaoH2() {
            this.configuracaoJDBC = new ConfiguracaoJDBC();
        }

    @Override
    public Endereco salvar(Endereco endereco) {
        Connection conexao = configuracaoJDBC.conectarComBancoDeDados();
        PreparedStatement pstmt = null;

        String query = String.format("INSERT INTO enderecos " +
                        "(rua ,numero, cidade, bairro,estado) " +
                        "VALUES ('%s','%s','%s','%s','%s')",
                endereco.getRua(),
                endereco.getNumero(),
                endereco.getBairro(),
                endereco.getCidade(),
                endereco.getEstado());

        try {
            pstmt = conexao.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            pstmt.executeUpdate();
            ResultSet keys = pstmt.getGeneratedKeys();
            if (keys.next())
                endereco.setId(keys.getInt(1));
            pstmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return endereco;
    }

    @Override
    public Optional<Endereco> buscar(Integer id) {
        return Optional.empty();
    }

    @Override
    public void excluir(Integer id) {

    }

    @Override
    public List<Endereco> buscarTodos() {
        Connection conexao = configuracaoJDBC.conectarComBancoDeDados();
        PreparedStatement pstmt = null;
        String query = "SELECT * FROM enderecos";
        List<Endereco> enderecos = new ArrayList<>();
        try {
            pstmt = conexao.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                enderecos.add(criarObjetoenderecos(rs));
            }
            pstmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return enderecos;
    }

    private Endereco criarObjetoenderecos(ResultSet rs) throws SQLException {
            return new Endereco(
                    rs.getInt("id"),
                    rs.getString("rua"),
                    rs.getString("numero"),
                    rs.getString("bairro"),
                    rs.getString("cidade"),
                    rs.getString("estado")
            );

    }

    @Override
    public Endereco atualizar(Endereco endereco) {
        return null;
    }
}
