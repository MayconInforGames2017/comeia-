package br.com.comeialabs.banco.entidade;

public abstract class Conta {

	private static int quantidadeContas = 0;
	protected int numero;
	protected double saldo;

	public Conta(int numero) {
		this.numero = numero;
		quantidadeContas++;
	}

	boolean sacar(double valor) {
		if (valor > saldo) {
			return false;
		}
		saldo -= valor;
		return true;
	}
	
	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
		}
	}
	
	void imprimirSaldo() {
		System.out.println(saldo);
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public static int getQuantidadeContas() {
		return quantidadeContas;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public double calcularTaxa() {
		return saldo * 0.15;
	}
	
	public abstract double getLimiteEspecial();
	
	public String toString() {
		return "{Número: " + getNumero() + ", Saldo R$: " + getSaldo() + "}";
	}

}
