package com.testerh.testerh;

import java.time.LocalDateTime;
import java.util.List;

import com.testerh.testerh.Enum.Funcao;
import com.testerh.testerh.Enum.Setor;

public abstract class Funcionario extends Pessoa {

    public Funcionario(int id, String nome, String cpf, String endereco, String matricula, Funcao funcao, Setor setor,
            String dataContrato) {
        super(id, nome, cpf, endereco); // herdado de Pessoa

    }

    String matricula;
    Funcao funcao;
    LocalDateTime dataContrato;
    Setor setor;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }

    public LocalDateTime getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(LocalDateTime dataContrato) {
        this.dataContrato = dataContrato;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

}
