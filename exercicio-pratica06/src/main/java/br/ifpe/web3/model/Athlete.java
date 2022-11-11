package br.ifpe.web3.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "TBATLETA")
public class Athlete {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Transient
	private Integer code;
	
	@Transient // não vai salvar o "age" no banco
	private int age;
	
	@Column(name = "N° de Inscrição", nullable = false)
	private Integer registrationNumber;
	
	@Column(name = "Data de inscrição", nullable = false)
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate registrationDate;
	
	@Column(name = "Data de nascimento", nullable = false)
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate bornDate;
	
	@Column(name = "nome", nullable = false)
	private String name;
	
	@Column(name = "Endereço", nullable = false)
	private Address address;
	
	@Column(name = "Telefone", nullable = false)
	private String phone;
	
	@Column(name = "E-mail", nullable = false)
	private String email;
	
	@Column(name = "Tipo Sanguíneo", nullable = false)
	private BloodType bloodType;
	
	@Column(name = "Convênio", nullable = false)
	private HealthInsurance healthInsurance;
	
	@Column(name = "Equipe", nullable = false)
	private String team;
	
	public Integer getCode() {
		return code;
	}
	
	public void setCode(Integer code) {
		this.code = code;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public Integer getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(Integer registrationNumber) {
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
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
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
}
