package br.com.comeialabs.banco.view;

import br.com.comeialabs.banco.entidade.Conta;
import br.com.comeialabs.banco.entidade.ContaPessoaJuridica;

public class LaunchConta {

	public static void main(String[] args) {
		ContaPessoaJuridica juridica = new ContaPessoaJuridica(2345);
		Conta conta = juridica;
		
	}

}
