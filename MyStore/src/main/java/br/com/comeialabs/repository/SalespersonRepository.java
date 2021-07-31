package br.com.comeialabs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.comeialabs.domain.Salesperson;

public interface SalespersonRepository extends JpaRepository<Salesperson, Integer> {

}
