package atividade.atividadeapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AtividadeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtividadeApiApplication.class, args);
	}

	@GetMapping(value = "/aluno")
	public Aluno getAluno(){
		Aluno josueli = new Aluno();
		josueli.nome="Josueli";
		josueli.sobrenome="Barbosa";
		return josueli;
	}
}