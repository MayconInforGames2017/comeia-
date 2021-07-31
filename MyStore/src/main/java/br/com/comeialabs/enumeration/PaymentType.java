package br.com.comeialabs.enumeration;

public enum PaymentType {

	CREDIT_CARD("Cartão Crédito"),
	BANK_BILLE("Boleto");
	
	private String displayName;
	
	private PaymentType(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	
}
