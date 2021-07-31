package br.com.comeialabs.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
	
	@Id
	@Column(name = "customer_id")
	private Integer id;
	
	@OneToOne
	@JoinColumn(name = "customer_id")
	@MapsId
	private Customer customer;
	
	@Column(length = 20, nullable = false)
	private String zipcode;
	
	@Column(length = 200, nullable = false)
	private String location;
	
	@Column(length = 60, nullable = false)
	private String state;
	
	@Column(length = 100, nullable = false)
	private String city;
	
	@Column(length = 100, nullable = false)
	private String country;

}
