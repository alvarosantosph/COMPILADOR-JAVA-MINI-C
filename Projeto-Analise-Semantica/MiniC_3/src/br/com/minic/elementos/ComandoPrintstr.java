package br.com.minic.elementos;

public class ComandoPrintstr implements IComando {
	
	// Atributo
	
	IExpressao exp;
	
	// Construtor
	
	public ComandoPrintstr(IExpressao exp) {
		setExp(exp);
	}

	// M�todos Acessores e Modificadores
	
	public IExpressao getExp() {
		return exp;
	}

	public void setExp(IExpressao exp) {
		this.exp = exp;
	}

	// M�todo toString
	
	public String toString() {
		StringBuilder toString = new StringBuilder();
		
		toString.append("PrintSTR(" + this.getExp() + ");");
		
	    return toString.toString();		
	}

	// M�todo Implementado
	
	public void setEntreParenteses(boolean b) {
		
	}
}
