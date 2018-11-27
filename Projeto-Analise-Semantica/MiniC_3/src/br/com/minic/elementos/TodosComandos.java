package br.com.minic.elementos;

import java.util.List;

public class TodosComandos implements IComando {

	// Atributo

	private List<IComando> Comandos;

	// M�todos Acessores e Modificadores

	public List<IComando> getComandos() {
		return Comandos;
	}

	public void setComandos(List<IComando> comandos) {
		Comandos = comandos;
	}

	public TodosComandos(List<IComando> comandos) {
		this.Comandos = comandos;
	}

	// M�todo toString

	public String toString() {

		StringBuilder todoscomandos = new StringBuilder();

		todoscomandos.append(" if (");
		todoscomandos.append(this.getComandos());

		return todoscomandos.toString();

	}

	// M�todo Implementado
	
	public void setEntreParenteses(boolean isEntreParenteses) {

	}

}
