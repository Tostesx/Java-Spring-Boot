package io.github.tostesx.produtosapi.motadora;

import java.awt.Color;

public class Carro {
	private String modelo;
	private Color cor;
	private Motor motor;
	private Montadora montadora;
	
	
	
	public Carro(String modelo, Color cor, Motor motor, Montadora montadora) {
		super();
		this.modelo = modelo;
		this.cor = cor;
		this.motor = motor;
		this.montadora = montadora;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Color getCor() {
		return cor;
	}
	public void setCor(Color cor) {
		this.cor = cor;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public Montadora getMontadora() {
		return montadora;
	}
	public void setMontadora(Montadora montadora) {
		this.montadora = montadora;
	}
	public CarroStatus darIgnicao(Chave chave) {
		if(chave.getMontadora() != this.montadora) {
			return new CarroStatus("Não é possível ligar o carro com esta chave!!");
		}
		
		return new CarroStatus("Carro ligado!! Rodando com o motor " + motor);
	}
	
}
