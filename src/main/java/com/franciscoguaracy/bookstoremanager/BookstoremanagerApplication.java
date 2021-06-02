package com.franciscoguaracy.bookstoremanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // informa para o SPRINGBOOT que temos uma classe de partida (main) e esta anotação informa
                       // para o SpringBoot que aqui será a entrada de execução do nosso projeto.

public class BookstoremanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoremanagerApplication.class, args);
	}

}
