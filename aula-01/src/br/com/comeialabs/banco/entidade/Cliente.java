package br.com.comeialabs.banco.entidade;

import java.util.Date;
import java.util.List;

import br.com.comeialabs.banco.interfaces.IClienteEspecial;
import br.com.comeialabs.banco.interfaces.IEntidadeLogin;

public class Cliente extends Pessoa implements IEntidadeLogin, IClienteEspecial {

	private Date dataCadastro;
	private List<Conta> contas;
	private String senha;

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	@Override
	public void autenticar(String login, String senha) {
		if (getCpf().equals(login) && this.senha.equals(senha));
	}

	@Override
	public void setBeneficiosBonus(String[] beneficios) {
		// TODO Auto-generated method stub

	}

}
