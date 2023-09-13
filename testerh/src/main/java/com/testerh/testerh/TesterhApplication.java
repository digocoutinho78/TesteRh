package com.testerh.testerh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.codec.AbstractEncoder;

import com.testerh.testerh.Funcionario;
import com.testerh.testerh.Pessoa;
import com.testerh.testerh.Enum.Funcao;
import com.testerh.testerh.Enum.Setor;
import com.testerh.testerh.Atendente;
import com.testerh.testerh.Diretor;
import com.testerh.testerh.Tributos;
import com.testerh.testerh.Print;

@SpringBootApplication
public class TesterhApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesterhApplication.class, args);

		Atendente atend1 = new Atendente(01, "Rodrigo Coutinho", "12345678921", "Rua dos bobos, 01", "5050",
				Funcao.ATENDENTE, Setor.ATENDIMENTO, "10/05/2023");
		atend1.setSalarioAtendente(atend1.getSalarioAtendente()); // aqui está sendo confirmado que o valor de salario é
																	// o que consta dentro da variavel Atendente. Este
																	// valor não pode ser setado no momento da criação
																	// do atend1.

		// // Dados do Funcionário e Folha pagamento:
		// System.out.println("**************** DADOS FUNCIONÁRIO ***************");
		// System.out.println("______________________________________________________");
		// System.out.println("MATRÍCULA: " + atend1.matricula); // pq null?
		// System.out.println("NOME FUNCIONÁRIO: " + atend1.nome);
		// System.out.println("SETOR: " + Setor.ATENDIMENTO);
		// System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		// System.out.println("CPF: " + atend1.cpf);
		// System.out.println("ENDEREÇO: " + atend1.endereco);
		// System.out.println("FUNÇÃO: " + Funcao.ATENDENTE);
		// System.out.println("DATA CONTRATO: " + atend1.getDataContrato()); // pq null?
		// System.out.println("______________________________________________________");
		// System.out.println("*************** FOLHA DE PAGAMENTO ***************");
		// System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		// System.out.println(
		// " Salario ATENDENTE BRUTO: " + atend1.getSalarioAtendente() + " -> ( ^_^)");
		// System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		// System.out.println("******************** DESCONTOS *******************");
		// System.out.println("");
		// System.out.println(" Valor ATENDENTE INSS: " + tributos.getInss());
		// System.out.println(" Valor ATENDENTE FGTS: " + tributos.getFgtsFinal()); //
		// desconto calculado de
		// // acordo com valor do
		// // salario.
		// System.out.println(" Valor ATENDENTE FERIAS: " + tributos.getFerias());
		// System.out.println(" Valor ATENDENTE 13 Salario: " +
		// tributos.getDecimoTerSalario());
		// System.out.println("");
		// System.out.println(" TOTAL DESCONTOS: " + ((tributos.getFgts())
		// + (tributos.getDecimoTerSalario() + tributos.getFerias() + tributos.getInss()
		// + tributos.getFgts()))); // limitar
		// // decimais.
		// System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		// System.out.println(
		// "Valor ATENDENTE LÍQUIDO salário: " + tributos.salarioLiquido + " -> (-_-)");
		// System.out.println("______________________________________________________");

		// }

	}
}
