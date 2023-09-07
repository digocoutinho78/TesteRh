package com.testerh.testerh;

import com.testerh.testerh.Enum.Funcao;
import com.testerh.testerh.Enum.Setor;

public abstract class Funcionario extends Pessoa {
    
    public Funcionario(int id, String nome, String cpf, String endereco, String matricula, Funcao funcao, Setor setor, String dataContrato) {
        super(id, nome, cpf, endereco);
        
    }
    String matricula;
    Funcao funcao;
    String dataContrato;
    Setor setor;
    

}
