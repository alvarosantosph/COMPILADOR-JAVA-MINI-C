package br.com.minic.elementos;

public class TipoMain {

	// Atributo

	private String tipo;

	// Construtor

	public TipoMain(String tipo) {

		this.setTipo(tipo);

	}

	// M�todos Acessores e Modificadores

	public String getTipo() {

		return tipo;

	}

	public void setTipo(String tipo) {

		this.tipo = tipo;

	}
	
	// M�todos Implementados

	@Override

	public String toString() {

		return this.getTipo();

	}

}
