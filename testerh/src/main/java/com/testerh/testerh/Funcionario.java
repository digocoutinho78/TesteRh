package com.testerh.testerh;

import java.util.function.Supplier;

import com.testerh.testerh.Enum.FaixaSalario;
import com.testerh.testerh.Enum.Funcao;

public abstract class Funcionario extends Pessoa {

    public Funcionario(int id, String nome, String cpf, String endereco, String matricula, Funcao funcao,
            FaixaSalario faixaSalario) {
        super(id, nome, cpf, endereco);
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.matricula = matricula;
        this.funcao = funcao;
        this.faixaSalario = faixaSalario;

    }

    String matricula;
    Funcao funcao;
    FaixaSalario faixaSalario;

}
