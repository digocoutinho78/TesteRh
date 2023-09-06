package com.testerh.testerh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.testerh.testerh.Funcionario;
import com.testerh.testerh.Pessoa;
import com.testerh.testerh.Enum.Funcao;

@SpringBootApplication
public class TesterhApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesterhApplication.class, args);

		Funcionario func1 = new Funcionario(01, "Rodrigo Coutinho", "1234567921", "Rua dos bobos,00", "101010",
				Funcao.ATENDENTE) {

		};

	}

}
