package io.github.tostesx.produtosapi.motadora;

public class Chave {
	private Montadora montadora;
	private String tipoChave;
	
	
	public Montadora getMontadora() {
		return montadora;
	}
	public void setMontadora(Montadora montadora) {
		this.montadora = montadora;
	}
	public String getTipoChave() {
		return tipoChave;
	}
	public void setTipoChave(String tipoChave) {
		this.tipoChave = tipoChave;
	}
}