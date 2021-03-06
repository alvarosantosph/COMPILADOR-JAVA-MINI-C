package br.com.minic.elementos;

public class ComandoWhile implements IComando {
	
	// Atributos
	
	IComando codWHILE;
	IExpressao expRelacional;
	
	// Construtor
	
	public ComandoWhile(IExpressao ExpRelacional, IComando codWHILE) {
		setExpRelacional(expRelacional);
		setCodWHILE(codWHILE);
	}
	
	// M�todos Acessores e Modificadores

	public IExpressao getExpRelacional() {
		return expRelacional;
	}

	public void setExpRelacional(IExpressao expRelacional) {
		this.expRelacional = expRelacional;
	}

	public IComando getCodWHILE() {
		return codWHILE;
	}

	public void setCodWHILE(IComando codWHILE) {
		this.codWHILE = codWHILE;
	}
	
	// M�todo toString
	
	public String toString() {
		StringBuilder toString = new StringBuilder();
		
		toString.append("while (" + this.getExpRelacional() + ") \n");
		toString.append("  " + this.getCodWHILE() + ";");
		
	    return toString.toString();		
	}
	
	// M�todo Implementado

	public void setEntreParenteses(boolean b) {
		
	}

}
