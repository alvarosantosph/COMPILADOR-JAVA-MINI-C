package br.com.minic.elementos;

public class Identificador implements IExpressao {

	// Atributos

	private String nome;

	// Construtor

	public Identificador(String nome) {

		this.setNome(nome);

	}

	// M�todos Acessores e Modificadores

	public String getNome() {

		return nome;

	}

	public void setNome(String nome) {

		this.nome = nome;

	}

	// M�todo toString
	
	@Override

	public String toString() {

		return this.getNome();

	}

	// M�todo Implementado
	
	public void setEntreParenteses(boolean isEntreParenteses) {

	}

}
