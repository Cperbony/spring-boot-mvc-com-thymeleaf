package com.cperbony.demomvc.service;

import com.cperbony.demomvc.domain.Funcionario;

import java.util.List;

public interface FuncionarioService {

    void salvar(Funcionario funcionario);

    void editar(Funcionario funcionario);

    void excluir(long id);

    Funcionario buscarPorId(Long id);

    List<Funcionario> buscarTodos();
}

