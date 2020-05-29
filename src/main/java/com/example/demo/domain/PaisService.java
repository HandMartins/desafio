package com.example.demo.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PaisService {

	@Autowired
	private PaisRepository rep;

	public Iterable<Pais> getPais(){
		return rep.findAll();
	}

	public Optional<Pais> getPaisById(Long id) {
		return rep.findById(id);
	}


	public Iterable<Pais> getPaisByCapital(String capital) {
		return rep.findByCapital(capital);
	}


	public Pais save(Pais pais) {
		return rep.save(pais);
	}

	//criando em memoria a lista dos paises
	public List<Pais> getPaisFake(){
		List<Pais> pais = new ArrayList<>();
		
		pais.add(new Pais(1L,"ARGENTINA"));
		pais.add(new Pais(2L,"BOLIVIA"));
		pais.add(new Pais(3L,"BRASIL"));
		pais.add(new Pais(4L,"CHILE"));
		pais.add(new Pais(5L,"COLOMBIA"));
		
		return pais;
	}


}
