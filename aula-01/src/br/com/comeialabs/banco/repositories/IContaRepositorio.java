package br.com.comeialabs.banco.repositories;

import br.com.comeialabs.banco.entidade.Conta;

public interface IContaRepositorio {

	public void salvar(Conta conta);
	public void atualizar(Conta conta);
	public void excluir(Conta conta);
	public Conta buscarContaPorNumero(int numero);
}
