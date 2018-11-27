package br.com.minic.elementos;

public class DeclIdOpt implements IExpressao {
	
	// Atributos
	
	private Identificador identificador;
	private IExpressao declidopt;
    
	// Construtor
	
    public DeclIdOpt(Identificador identificador, IExpressao declidopt) {
    	setIdentificador(identificador);
	}

	// M�todos Acessores e Modificadores
    
	public Identificador getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Identificador identificador) {
		this.identificador = identificador;
	}
    
    public IExpressao getDeclidopt() {
		return declidopt;
	}

	public void setDeclidopt(IExpressao declidopt) {
		this.declidopt = declidopt;
	}

	// M�todo toString
	
	public String toString() {
		StringBuilder toString = new StringBuilder();
		
		toString.append("," + this.getIdentificador());
		toString.append("," + this.getDeclidopt());
		
	    return toString.toString();    	
    }

	// M�todo Implementado
	
	public void setEntreParenteses(boolean isEntreParenteses) {
		
	}
}