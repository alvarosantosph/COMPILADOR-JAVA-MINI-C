package br.com.minic.elementos;

public class ComandoExpAtr implements IComando {
	
	// Atributos
	
	IExpressao identificador;
	IExpressao expAtr;
	
	// Construtor
	
	public ComandoExpAtr(IExpressao identificador, IExpressao expAtr) {
		setIdentificador(identificador);
		setExpAtr(expAtr);
	}
	
	// M�todos Acessores e Modificadores

	public IExpressao getIdentificador() {
		return identificador;
	}

	public void setIdentificador(IExpressao identificador) {
		this.identificador = identificador;
	}
	
	public IExpressao getExpAtr() {
		return expAtr;
	}

	public void setExpAtr(IExpressao expAtr) {
		this.expAtr = expAtr;
	}
	
	// M�todo toString

	public String toString() {
		StringBuilder toString = new StringBuilder();
		
		toString.append(this.getIdentificador());
		toString.append(this.getExpAtr());
		toString.append(";");
		
		return toString.toString();
	}
	
	// M�todo Implementado

	public void setEntreParenteses(boolean b) {
		
	}

}
