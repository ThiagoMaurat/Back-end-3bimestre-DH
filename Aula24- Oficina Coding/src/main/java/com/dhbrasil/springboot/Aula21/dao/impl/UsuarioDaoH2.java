package com.dhbrasil.springboot.Aula21.dao.impl;

import com.dhbrasil.springboot.Aula21.dao.IDao;
import com.dhbrasil.springboot.Aula21.dao.config.ConfiguracaoJDBC;
import com.dhbrasil.springboot.Aula21.model.Usuario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UsuarioDaoH2 implements IDao<Usuario> {
    private ConfiguracaoJDBC configuracaoJDBC;

    public UsuarioDaoH2() {
        this.configuracaoJDBC = new ConfiguracaoJDBC();
    }

    @Override
    public Usuario salvar(Usuario usuario) {
        Connection conexao = configuracaoJDBC.conectarComBancoDeDados();
        PreparedStatement pstmt = null;

        String query = String.format("INSERT INTO usuarios " +
                        "(nome ,email,senha , acesso) " +
                        "VALUES ('%s','%s','%s','%d')",
                usuario.getNome(),
                usuario.getEmail(),
                usuario.getSenha(),
                usuario.getAcesso());

        try {
            pstmt = conexao.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            pstmt.executeUpdate();
            ResultSet keys = pstmt.getGeneratedKeys();
            if (keys.next())
                usuario.setId(keys.getInt(1));
            pstmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuario;
    }

    @Override
    public Optional<Usuario> buscar(Integer id) {
        return Optional.empty();
    }

    @Override
    public void excluir(Integer id) {
        Connection conexao = configuracaoJDBC.conectarComBancoDeDados();
        Statement stmt = null;
        String query = String.format("DELETE FROM usuarios WHERE id = '%s'", id);
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
    public List<Usuario> buscarTodos() {
        Connection conexao = configuracaoJDBC.conectarComBancoDeDados();
        PreparedStatement pstmt = null;
        String query = "SELECT * FROM usuarios";
        List<Usuario> usuarios = new ArrayList<>();
        try {
            pstmt = conexao.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                usuarios.add(criarObjetoenderecos(rs));
            }
            pstmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    private Usuario criarObjetoenderecos(ResultSet rs) throws SQLException {
        return new Usuario(
                rs.getInt("id"),
                rs.getString("nome"),
                rs.getString("email"),
                rs.getString("senha"),
                rs.getInt("acesso")
        );

    }

    @Override
    public Usuario atualizar(Usuario usuario) {
        return null;
    }
}
