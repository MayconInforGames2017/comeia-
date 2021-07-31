package br.com.comeialabs.banco.entidade;

import java.util.Date;

import br.com.comeialabs.banco.interfaces.IContaAuditavel;

public class ContaPessoaJuridica extends Conta implements IContaAuditavel {

	private String cnpj;
	private String razaoSocial;
	private Date dataAberturaEmpresa;

	public ContaPessoaJuridica(int numero) {
		super(numero);
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public Date getDataAberturaEmpresa() {
		return dataAberturaEmpresa;
	}

	public void setDataAberturaEmpresa(Date dataAberturaEmpresa) {
		this.dataAberturaEmpresa = dataAberturaEmpresa;
	}

	@Override
	public double getLimiteEspecial() {
		return saldo;
	}

	@Override
	public void exibirDados() {
		System.out.println(super.toString() + " : " + razaoSocial);
	}

}
