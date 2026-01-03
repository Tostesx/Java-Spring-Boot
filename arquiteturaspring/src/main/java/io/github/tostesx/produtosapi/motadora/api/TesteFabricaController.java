package io.github.tostesx.produtosapi.motadora.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.tostesx.produtosapi.motadora.Carro;
import io.github.tostesx.produtosapi.motadora.CarroStatus;
import io.github.tostesx.produtosapi.motadora.Chave;
import io.github.tostesx.produtosapi.motadora.HondaHRV;
import io.github.tostesx.produtosapi.motadora.Motor;

@RestController
@RequestMapping("/carros")
public class TesteFabricaController {

	@Autowired
	private Motor motor;
	
	@PostMapping
	public CarroStatus ligarCarro(@RequestBody Chave chave) {
		var carro = new HondaHRV(motor);
		return carro.darIgnicao(chave);
	}
}
