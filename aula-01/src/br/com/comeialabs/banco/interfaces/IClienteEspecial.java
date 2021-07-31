package br.com.comeialabs.banco.interfaces;

public interface IClienteEspecial {
	
	public void setBeneficiosBonus(String []beneficios);
	
	public default String[] getBeneficiosBonus() {
		String[] beneficios = new String[1];
		beneficios[0] = "Previdência particular";
		return beneficios;
	}

}
