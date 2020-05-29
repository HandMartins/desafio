package com.example.demo.api;
import com.example.demo.domain.Pais;
import com.example.demo.domain.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/pais")
public class PaisController {

	@Autowired
	private PaisService service;
	
	@GetMapping()
	public Iterable<Pais> get() {
		return service.getPais();
	}


	@GetMapping("/id")
	public Optional<Pais> get(@PathVariable("id") Long id) {
		return service.getPaisById(id);
	}

	@GetMapping("/capital/{capital}")
	public Iterable<Pais> getPaisByCapital(@PathVariable("capital") String capital) {
		return service.getPaisByCapital(capital);
	}

	//parametros: nome, extensao, capital e moeda(tudo String)
	@PostMapping
	public String post(@RequestBody Pais pais){
		Pais p = service.save(pais);
		return "Pais salvo com sucesso: " + p.getId() + " " + p.getNome();
	}
}
