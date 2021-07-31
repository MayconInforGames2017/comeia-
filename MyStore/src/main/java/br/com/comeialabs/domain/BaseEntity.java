package br.com.comeialabs.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Setter
@Getter
public abstract class BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Integer id;

}
