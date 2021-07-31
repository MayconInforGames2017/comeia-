package br.com.comeialabs.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.com.comeialabs.enumeration.PaymentType;

@Embeddable
public class Payment {

	@Enumerated(EnumType.STRING)
	@Column(name = "payment_type", nullable = false)
	private PaymentType type;
	
	@Column(nullable = false)
	private int installments;
	
}
