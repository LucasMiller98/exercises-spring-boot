package br.ifpe.web3.model;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "ATLETA")
public class Athlete {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Numero_inscricao")
	private Long registrationNumber;
	
	@Column(name = "Data_de_inscricao", nullable = false)
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate registrationDate;
	
	@Column(name = "Data_de_nascimento", nullable = false)
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate bornDate;
	
	@Column(name = "nome", nullable = false)
	private String name;
	
	@Column(name = "Endereco", nullable = false)
	private String address;
	
	@Column(name = "Numero", nullable = false)
	private Integer homeNumber;
	
	@Column(name = "Complemento", nullable = false)
	private String complement;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "Bairro", nullable = false)
	private Neighborhood neighborhood;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "Cidade", nullable = false)
	private AthleteCity city;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "Estado", nullable = false)
	private AthleteState state;
	
	@Column(name = "Telefone", nullable = false)
	private String phone;
	
	@Column(name = "Email", nullable = false)
	private String email;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "Tipo_Sanguíneo", nullable = false)
	private BloodType bloodType;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "Convenio", nullable = false)
	private HealthInsurance healthInsurance;
	
	@Column(name = "Equipe", nullable = false)
	private String team;
	
	@Column(name = "Categoria")
	@Enumerated(EnumType.STRING)
	private Category category;
	
	@Column(name = "Genero")
	@Enumerated(EnumType.STRING)
	private CategoryGender gender;
	
	public Athlete() {
		
	}
	
	public Athlete(LocalDate registrationDate, LocalDate bornDate, String name, String address, String phone, String email, BloodType bloodType, HealthInsurance healthInsurance, String team, Integer homeNumber, String complement, Neighborhood neighborhood, AthleteCity city, AthleteState state, Category category) {
		this.registrationDate = registrationDate;
		this.bornDate = bornDate;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.bloodType = bloodType;
		this.healthInsurance = healthInsurance;
		this.team = team;
		this.city = city;
		this.complement = complement;
		this.homeNumber = homeNumber;
		this.neighborhood = neighborhood;
		this.state = state;
		this.category = category;
	}

	public Long getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(Long registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public LocalDate getBornDate() {
		return bornDate;
	}

	public void setBornDate(LocalDate bornDate) {
		this.bornDate = bornDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getHomeNumber() {
		return homeNumber;
	}

	public void setHomeNumber(Integer homeNumber) {
		this.homeNumber = homeNumber;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public Neighborhood getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(Neighborhood neighborhood) {
		this.neighborhood = neighborhood;
	}

	public AthleteCity getCity() {
		return city;
	}

	public void setCity(AthleteCity city) {
		this.city = city;
	}

	public AthleteState getState() {
		return state;
	}

	public void setState(AthleteState state) {
		this.state = state;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BloodType getBloodType() {
		return bloodType;
	}

	public void setBloodType(BloodType bloodType) {
		this.bloodType = bloodType;
	}

	public HealthInsurance getHealthInsurance() {
		return healthInsurance;
	}

	public void setHealthInsurance(HealthInsurance healthInsurance) {
		this.healthInsurance = healthInsurance;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
	public Category getCategory() {
		return category;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}
	
//	static int handleCalcAge() {
//		
//	}
}
