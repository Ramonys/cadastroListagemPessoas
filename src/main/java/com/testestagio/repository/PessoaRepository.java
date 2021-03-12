package com.testestagio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testestagio.entity.Pessoa;


public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
