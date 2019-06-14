package com.cperbony.demomvc.service;

import com.cperbony.demomvc.domain.Departamento;

import java.util.List;

public interface DepartamentoService {

    void salvar(Departamento departamento);

    void editar(Departamento departamento);

    void excluir(long id);

    Departamento buscarPorId(Long id);

    List<Departamento> buscarTodos();
}
