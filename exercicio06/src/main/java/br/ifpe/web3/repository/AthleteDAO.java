package br.ifpe.web3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ifpe.web3.model.Athlete;

@Repository
public interface AthleteDAO extends JpaRepository<Athlete, Long> {
	
}