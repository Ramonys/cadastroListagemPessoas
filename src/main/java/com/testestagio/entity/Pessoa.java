package com.testestagio.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false, length = 40)
	@NotEmpty(message="Campo nome está vazio")
	private String nome; 
	
	@Column(nullable = false)
	@NotNull(message="Campo idade está vazio")
	private Integer idade;
	
	@Column(nullable = false, length = 9)
	@NotEmpty(message="Campo Cep está vazio")
	private String cep;
	
	@Column(nullable = false, length = 60)
	@NotEmpty(message="Campo rua está vazio")
	private String rua;
	
	@Column(nullable = false, length = 30)
	@NotEmpty(message="Campo bairro está vazio")
	private String bairro;
	
}
