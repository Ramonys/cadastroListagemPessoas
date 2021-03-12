package com.testestagio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.testestagio.*"})
@EnableJpaRepositories(basePackages = {"com.testestagio.repository"})
public class TesteEstagioApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteEstagioApplication.class, args);
	}

}
