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



@SpringBootApplication
public class TesterhApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesterhApplication.class, args);

		Atendente atend1 = new Atendente(01, "Rodrigo Coutinho", "12345678921", "Rua dos bobos, 01", "5050", Funcao.ATENDENTE, Setor.ATENDIMENTO, "15/10/23");
		atend1.setSalarioAtendente(atend1.getSalarioAtendente());  // aqui está sendo confirmado que o valor de salario é o que consta dentro da variavel Atendente. Este valor não pode ser setado no momento da criação do atend1.

		
		
		Tributos tributos = new Tributos() ;
		//tributos.setFgts(tributos.getFgts());
		
		System.out.println("______________________________________________");
		System.out.println("Salario ATENDENTE BRUTO: " + atend1.getSalarioAtendente() + "         \u30FD(\u00B4\u25BD`)/");
		System.out.println("______________________________________________");
		System.out.println("************DESCONTOS************");
		System.out.println("   Valor ATENDENTE INSS: " + atend1.getSalarioAtendente() * tributos.getInss());
		System.out.println("             Valor FGTS: " + atend1.getSalarioAtendente() * tributos.getFgts());
		System.out.println("       Valor 13 Salario: " + atend1.getSalarioAtendente() / tributos.getDecimoTerSalario());
		System.out.println("______________________________________________");
		System.out.println("   Valor LÍQUIDO salário: " + tributos.salarioLiquido + "       \u00AF\\_(\u30C4)_/\u00AF");
		System.out.println("______________________________________________");

	}
	

}
