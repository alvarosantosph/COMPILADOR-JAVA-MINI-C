package br.com.minic.elementos;

public class LiteralString implements IExpressao {

	// Atributo

	private String valor;

	// Construtor

	public LiteralString(String valor) {

		this.setValor(valor);

	}

	// M�todos Acessores e Modificadores

	public String getValor() {

		return valor;

	}

	public void setValor(String valor) {

		this.valor = valor;

	}
	
	// M�todo toString

	@Override

	public String toString() {

		return this.getValor();

	}

	// M�todo Implementado
	
	public void setEntreParenteses(boolean isEntreParenteses) {
		
	}

}
