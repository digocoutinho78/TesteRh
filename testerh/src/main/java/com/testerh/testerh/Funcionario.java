package com.testerh.testerh;

import java.util.function.Supplier;

import com.testerh.testerh.Enum.Funcao;

public abstract class Funcionario extends Pessoa {

    public Funcionario(int id, String nome, String cpf, String endereco, String matricula, Funcao funcao) {
        super(id, nome, cpf, endereco);
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.matricula = matricula;
        this.funcao = funcao;

    }

    String matricula;
    Funcao funcao;

}
