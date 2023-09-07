package com.testerh.testerh;

import com.testerh.testerh.Enum.Funcao;

public abstract class Funcionario extends Pessoa {
    
    public Funcionario(int id, String nome, String cpf, String endereco, String matricula, Funcao funcao, String dataContrato) {
        super(id, nome, cpf, endereco);
        
    }
    String matricula;
    Funcao funcao;
    String dataContrato;
    

}
