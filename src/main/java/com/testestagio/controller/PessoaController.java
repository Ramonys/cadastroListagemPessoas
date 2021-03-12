package com.testestagio.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.testestagio.entity.Pessoa;
import com.testestagio.repository.PessoaRepository;

@Controller
public class PessoaController {
	
	@Autowired
	PessoaRepository pessoaRep;
	
	
	@PostMapping("salvarpessoa")
	public ModelAndView salvar(@Valid Pessoa pessoa, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			ModelAndView mv = new ModelAndView("index");
			Iterable<Pessoa> pessoaslist = pessoaRep.findAll();
			Long numeroPessoas = pessoaRep.count();
			mv.addObject("npessoas",numeroPessoas);
			mv.addObject("pessoas", pessoaslist);
			List<String> msg = new ArrayList<String>();
			for (ObjectError objectError : bindingResult.getAllErrors()) {
				msg.add(objectError.getDefaultMessage());
			}
			mv.addObject("msg", msg);
			return mv;
		}	
		
		pessoaRep.save(pessoa);
		ModelAndView mv = new ModelAndView("/index");
		Iterable<Pessoa> pessoaslist = pessoaRep.findAll();
		Long numeroPessoas = pessoaRep.count();
		mv.addObject("npessoas",numeroPessoas);
		mv.addObject("pessoas", pessoaslist);
		return mv;
	}
	
	
	
}
