package com.testerh.testerh;

import com.testerh.testerh.Enum.Funcao;
import com.testerh.testerh.Enum.Setor;

public class Diretor extends Funcionario {


    private int salarioDiretor;



    public Diretor(int id, String nome, String cpf, String endereco, String matricula, Funcao funcao, Setor setor,
            String dataContrato) {
        super(id, nome, cpf, endereco, matricula, funcao, setor, dataContrato);
        this.salarioDiretor = 2000; // valor de salario exclusivo do diretor 
    }

        public int getSalarioDiretor() {
        return salarioDiretor;
    }

    public void setSalarioDiretor(int salarioDiretor) {
        this.salarioDiretor = salarioDiretor;
    }
    
}
