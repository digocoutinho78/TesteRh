package com.testerh.testerh;

import com.testerh.testerh.Enum.Funcao;
import com.testerh.testerh.Enum.Setor;

public class  Atendente extends Funcionario{


    private int salarioAtendente;


    public Atendente(int id, String nome, String cpf, String endereco, String matricula, Funcao funcao, Setor setor,
            String dataContrato) {
        super(id, nome, cpf, endereco, matricula, funcao, setor, dataContrato);
        this.salarioAtendente = 1000; //valor de salario exclusivo do atendente privado
    
    }

    public int getSalarioAtendente() {
        return salarioAtendente;
    }

    public void setSalarioAtendente(int salarioAtendente) {
        this.salarioAtendente = salarioAtendente;
    }






    
    
}
