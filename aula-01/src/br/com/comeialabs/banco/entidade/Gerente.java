package br.com.comeialabs.banco.entidade;

import br.com.comeialabs.banco.interfaces.IEntidadeLogin;

public class Gerente extends Pessoa implements IEntidadeLogin {

	private String matricula;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public void autenticar(String login, String senha) {
		
	}

}
