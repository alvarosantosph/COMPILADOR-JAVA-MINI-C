package br.com.minic.elementos;

import java.util.ArrayList;

public class Funcao implements IExpressao{
	
	// Atributos
	
	private Identificador id;
    private ArrayList<IExpressao> ParametrosOptions;
    private boolean isEntreParenteses;
    
    // Construtor
    
    public Funcao(Identificador id,ArrayList<IExpressao> ParametrosOptions){
        this.id = id;
        this.ParametrosOptions = ParametrosOptions;
        
    }
    
	// M�todos Acessores e Modificadores

    public Identificador getId() {
        return id;
    }

    public void setId(Identificador id) {
        this.id = id;
    }

    public ArrayList<IExpressao> getParametrosOptions() {
        return ParametrosOptions;
    }

    public void setParametrosOptions(ArrayList<IExpressao> ParametrosOptions) {
        this.ParametrosOptions = ParametrosOptions;
    }
    
    public boolean isIsEntreParenteses() {
        return isEntreParenteses;
    }
    
    // M�todo Implementado
    
    public void setEntreParenteses(boolean isEntreParenteses) {
        this.isEntreParenteses = isEntreParenteses;
    }
    
    // M�todo toString
    @Override
    public String toString() {
        StringBuilder Funcao = new StringBuilder();
        String retorno = this.id + "(" + this.ParametrosOptions + ")";
        Funcao.append(retorno);
        return Funcao.toString();
    }




}
