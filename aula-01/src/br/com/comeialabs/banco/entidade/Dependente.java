package br.com.comeialabs.banco.entidade;

public class Dependente extends Pessoa {

	private Cliente cliente;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
