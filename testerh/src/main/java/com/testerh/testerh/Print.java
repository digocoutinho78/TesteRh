package com.testerh.testerh;

import ch.qos.logback.core.net.SyslogOutputStream;

public class Print {

    public void print() { // Obs.: por erro o sout só funciona se estiver dentro de um metodo e nao na
                          // classe.

        // Dados do Funcionário e Folha pagamento:

        System.out.println("****************   DADOS FUNCIONÁRIO   ***************");
        System.out.println("______________________________________________________");
        System.out.println("MATRÍCULA: " + atend1.matricula); // pq null?
        System.out.println("NOME FUNCIONÁRIO: " + atend1.nome);
        System.out.println("SETOR: " + Setor.ATENDIMENTO);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("CPF: " + atend1.cpf);
        System.out.println("ENDEREÇO: " + atend1.endereco);
        System.out.println("FUNÇÃO: " + Funcao.ATENDENTE);
        System.out.println("DATA CONTRATO: " + atend1.getDataContrato()); // pq null?
        System.out.println("______________________________________________________");
        System.out.println("***************   FOLHA DE PAGAMENTO   ***************");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println(
                "        Salario ATENDENTE BRUTO: " + atend1.getSalarioAtendente() + " ->   ( ^_^)");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("********************   DESCONTOS   *******************");
        System.out.println("");
        System.out.println("           Valor ATENDENTE INSS: " + tributos.getInss());
        System.out.println("           Valor ATENDENTE FGTS: " + tributos.getFgtsFinal()); // desconto calculado de
                                                                                           // acordo com valor do
                                                                                           // salario.
        System.out.println("         Valor ATENDENTE FERIAS: " + tributos.getFerias());
        System.out.println("     Valor ATENDENTE 13 Salario: " + tributos.getDecimoTerSalario());
        System.out.println("");
        System.out.println("                TOTAL DESCONTOS: " + ((tributos.getFgts())
                + (tributos.getDecimoTerSalario() + tributos.getFerias() + tributos.getInss() + tributos.getFgts()))); // limitar
                                                                                                                       // decimais.
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println(
                "Valor ATENDENTE LÍQUIDO salário: " + tributos.salarioLiquido + " ->  (-_-)");
        System.out.println("______________________________________________________");

    }

}
