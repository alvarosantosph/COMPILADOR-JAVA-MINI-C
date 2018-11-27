package br.com.minic.elementos;

public class ExpRelAux implements IExpressao {
	
	// Atributo

	private IExpressao expRelAux;
	
	// Construtor
	
	public ExpRelAux(IExpressao expRelAux) {
		setExpRelAux(expRelAux);
	}
	
	// M�todos Acessores e Modificadores

	public IExpressao getExpRelAux() {
		return expRelAux;
	}

	public void setExpRelAux(IExpressao expRelAux) {
		this.expRelAux = expRelAux;
	}
	
	// M�todo toString
	
	public String toString() {
		StringBuilder toString = new StringBuilder();
		
		toString.append(this.getExpRelAux());
		
	    return toString.toString();
	}

	// M�todo Implementado
	
	public void setEntreParenteses(boolean isEntreParenteses) {
		
	}
}
