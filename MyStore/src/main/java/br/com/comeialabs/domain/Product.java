package br.com.comeialabs.domain;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product extends BaseEntity {

	@Column(length = 100, nullable = false)
	private String description;

	@Column(nullable = false)
	private BigDecimal price;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "supplier_id", nullable = false)
	private Supplier supplier;

	@ManyToMany
	@JoinTable(name = "product_category", 
		joinColumns = @JoinColumn(referencedColumnName = "id", name = "product_id"),
		inverseJoinColumns = @JoinColumn(referencedColumnName = "id", name = "category_id"))
	private List<Category> categories;
	
}
