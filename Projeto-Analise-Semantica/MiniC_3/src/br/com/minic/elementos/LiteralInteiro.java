package br.com.minic.elementos;

public class LiteralInteiro implements IExpressao {

	// Atributo

	private int valor;

	// Construtor

	public LiteralInteiro(int valor) {

		this.setValor(valor);

	}

	// M�todos Acessores e Modificadores

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	// M�todo toString
	
	@Override

	public String toString() {

		return String.valueOf(this.getValor());

	}
	
	// M�todo Implementado

	public void setEntreParenteses(boolean isEntreParenteses) {
		
	}

}
