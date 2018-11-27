package br.com.minic.elementos;

public class ComandoAtribuicao implements IComando {
	
	// Atributos
	
	String tipo;
	Identificador identificador;
	IExpressao DeclaraOpt;
	
	// Construtor
	
	public ComandoAtribuicao(String tipo, Identificador identificador, IExpressao DeclaraOpt) {
		this.setTipo(tipo);
		this.setIdentificador(identificador);
		this.setDeclOpt(DeclaraOpt);
	}

	// M�todos Acessores e Modificadores
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Identificador getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Identificador identificador) {
		this.identificador = identificador;
	}

	public IExpressao getDeclOpt() {
		return DeclaraOpt;
	}

	public void setDeclOpt(IExpressao DeclaraOpt) {
		this.DeclaraOpt = DeclaraOpt;
	}
	
	// M�todo toString
	
	public String toString() {
		StringBuilder dclcmdtipatropt = new StringBuilder();
        String retorno;
        if (this.DeclaraOpt != null) {
            retorno = this.tipo + " " + this.identificador.toString() + " " + this.DeclaraOpt.toString() + ";";
        }
        else{
            retorno = this.tipo + " " + this.identificador.toString() + ";";
        }
        
        dclcmdtipatropt.append(retorno);
        return dclcmdtipatropt.toString();
    }
	
	// M�todo Implementado

	public void setEntreParenteses(boolean b) {	
		
	}

}
