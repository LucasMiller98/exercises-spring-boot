package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Instrument {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer code; 
	private InstrumentType instrumentType;
	private String instrumentColor;
	private String instrumentOwner;
	private String problemType;
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public InstrumentType getInstrumentType() {
		return instrumentType;
	}
	public void setInstrumentType(InstrumentType instrumentType) {
		this.instrumentType = instrumentType;			
	}
	public String getInstrumentColor() {
		return instrumentColor;
	}
	public void setInstrumentColor(String instrumentColor) {
		this.instrumentColor = instrumentColor;
	}
	public String getInstrumentOwner() {
		return instrumentOwner;
	}
	public void setInstrumentOwner(String instrumentOwner) {
		this.instrumentOwner = instrumentOwner;
	}
	public String getProblemType() {
		return problemType;
	}
	
	public void setProblemType(String problemType) {
		this.problemType = problemType;
	}
}
