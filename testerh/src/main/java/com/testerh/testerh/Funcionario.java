package com.testerh.testerh;

import java.util.function.Supplier;

import com.testerh.testerh.Enum.Funcao;

public abstract class Funcionario extends Pessoa {

    public Funcionario(int id, String nome, String cpf, String endereco) {
        super(id, nome, cpf, endereco);

    }

    String matricula;
    Funcao funcao;

}
