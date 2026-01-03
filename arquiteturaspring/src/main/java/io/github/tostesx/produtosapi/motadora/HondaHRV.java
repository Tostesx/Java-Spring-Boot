package io.github.tostesx.produtosapi.motadora;

import java.awt.Color;

import org.springframework.stereotype.Component;

@Component
public class HondaHRV extends Carro{

	public HondaHRV(Motor motor) {
		super("HRV", Color.BLACK, motor, Montadora.HONDA);
	}

	



}
