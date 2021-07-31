package br.com.comeialabs.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sale_product")
@IdClass(SaleProductOId.class)
public class SaleProduct {
	
	@Id
	@ManyToOne
	@JoinColumn(name = "sale_id", nullable = false)
	private Sale sale;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "product_id", nullable = false)
	private Product product;
	
	@Column(nullable = false)
	private BigDecimal price;
	
	@Column(nullable = false)
	private Double amount;

}
