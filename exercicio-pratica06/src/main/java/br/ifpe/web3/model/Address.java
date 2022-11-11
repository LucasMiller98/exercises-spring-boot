package br.ifpe.web3.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	@Column(name = "Endereço")
	private String Address;
	
	@Column(name = "N°")
	private int homeNumber;
	
	@Column(name = "Complemento")
	private String complement;
	
	@Column(name = "Bairro")
	private Neighborhood neighborhood;
	
	@Column(name = "Cidade")
	private AthleteCity city;
	
	@Column(name = "Estado")
	private AthleteState state;
}
