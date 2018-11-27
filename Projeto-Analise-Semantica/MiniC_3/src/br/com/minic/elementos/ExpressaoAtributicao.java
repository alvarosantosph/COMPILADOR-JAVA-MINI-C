package br.com.minic.elementos;

public class ExpressaoAtributicao {

  // Atributos
	
  private Identificador identificador;
  private IExpressao expressao;
 
  
  // Construtor
  
  public ExpressaoAtributicao(Identificador identificador, IExpressao expressao) {
	
    this.setIdentificador( identificador );
    this.setExpressao( expressao );
    
  }

  
  // M�todos Acessores e Modificadores
  
  public Identificador getIdentificador() {
	
    return identificador;

  }

  public void setIdentificador(Identificador identificador) {
	
    this.identificador = identificador;

  }

  public IExpressao getExpressao() {
	
    return expressao;

  }

  public void setExpressao(IExpressao expressao) {
	
    this.expressao = expressao;

  }
  
  // M�todo toString
  
  @Override
	
  public String toString() {
	
    return this.getIdentificador() + " = " + this.getExpressao();
	
  }
  
}
