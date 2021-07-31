package br.com.comeialabs.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "salesperson")
@Setter
@Getter
@ToString
public class Salesperson extends BaseEntity {
	
	@Column(length = 60, nullable = false)
	@NotBlank(message = "Informe o nome do vendedor")
	@Size(max = 60, min = 2, message = "O nome deve ter no máximo {max} 60 caracteres e no mínimo {min} 2 caracteres")
	private String name;

}
