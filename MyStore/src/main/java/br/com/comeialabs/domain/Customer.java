package br.com.comeialabs.domain;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer extends BaseEntity {

	@Column(name = "registration_code", length = 20)
	private String registrationCode;
	
	@Column(length = 60, nullable = false)
	private String name;
	
	@Column(nullable = false)
	private LocalDate birthdate;
	
	@ElementCollection
	@CollectionTable(name = "customer_phone")
	@Column(name = "phone")
	private List<String> phones;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
}
