package br.com.minic.elementos;

public class DeclaracaoIdentificador {
	
	// Atributos
	
	private Identificador id;
	private IExpressao expressao;
	
	// Construtor
	
	public DeclaracaoIdentificador (Identificador id, IExpressao expressao) {
		setId(id);
		setExpressao(expressao);
	}
	
	// M�todos Acessores e Modificadores

	public Identificador getId() {
		return id;
	}

	public void setId(Identificador id) {
		this.id = id;
	}

	public IExpressao getExpressao() {
		return expressao;
	}

	public void setExpressao(IExpressao expressao) {
		this.expressao = expressao;
	}
	
	// M�todo toString
	
	public String toString() {
		StringBuilder toString = new StringBuilder();
		
		toString.append(this.getId());
		toString.append(this.getExpressao());
		
	    return toString.toString();		
	}
}