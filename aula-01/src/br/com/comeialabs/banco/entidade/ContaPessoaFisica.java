package br.com.comeialabs.banco.entidade;

import java.util.Date;

public class ContaPessoaFisica extends Conta {

	private String nomeTitular;
	private String cpf;
	private Date dataAbertura;

	public ContaPessoaFisica(int numero) {
		super(numero);
	}

	public String getNomeTitular() {
		if (nomeTitular == null) {
			return "Titular não definido";
		}
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	@Override
	public double calcularTaxa() {
		return saldo * 0.15;
	}

	@Override
	public double getLimiteEspecial() {
		return saldo + saldo * 0.10;
	}

	public double calcularTaxa(double taxa) {
		return saldo * taxa;
	}

}
