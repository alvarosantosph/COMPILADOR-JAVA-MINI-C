package br.com.minic.elementos;

public class LiteralPontoFlutuante implements IExpressao {

	// Atributo

	private double valor;

	// Construtor

	public LiteralPontoFlutuante(double valor) {

		this.setValor(valor);

	}

	// M�todos Acessores e Modificadores

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
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
