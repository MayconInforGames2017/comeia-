package br.com.comeialabs.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "sale")
public class Sale extends BaseEntity {
	
	@Column(nullable = false)
	private LocalDateTime date;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "customer_id", nullable = false)
	private Customer customer;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "salesperson_id", nullable = false)
	private Salesperson salesperson;

	@Embedded
	private Payment payment;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "sale")
	private List<SaleProduct> products;
	
	
}
