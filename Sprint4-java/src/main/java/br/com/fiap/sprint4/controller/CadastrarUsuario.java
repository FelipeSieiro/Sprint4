package br.com.fiap.sprint4.controller;

import java.sql.SQLException;

import br.com.fiap.sprint4.model.bo.RepositorioDeUsuarios;
import br.com.fiap.sprint4.model.dao.GerenciadorUsuario;
import br.com.fiap.sprint4.model.vo.CPF;
import br.com.fiap.sprint4.model.vo.Usuario;


public class CadastrarUsuario extends GerenciadorUsuario {
    private RepositorioDeUsuarios repositorio;

    public CadastrarUsuario(RepositorioDeUsuarios repositorio) throws SQLException{
        this.repositorio = repositorio;
    }

    public void cadastrarUsuario(String nome, String dataNascimento, String endereco, String email, String telefone, String cpf) throws Exception {
        Usuario user = repositorio.buscarPorCPF(cpf);
        if (user != null) {
            throw new Exception("Usuário com CPF em questão já existe");
        }

        Usuario novoUser = new Usuario(nome, dataNascimento, endereco, email, telefone, cpf, new CPF(cpf), 1);

        this.repositorio.salvar(novoUser);
    }

   
}