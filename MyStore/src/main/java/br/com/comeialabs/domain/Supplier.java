package br.com.comeialabs.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.comeialabs.enumeration.SupplierType;

@Entity
@Table(name = "supplier")
public class Supplier extends BaseEntity {
	
	@Column(length = 60, nullable = false)
	private String name;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 20, nullable = false)
	private SupplierType type;

	@OneToMany(mappedBy = "supplier", fetch = FetchType.LAZY)
	private List<Product> products;

}
