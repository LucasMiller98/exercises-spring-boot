package model;

public class Produto {
	// private -> só quem tá dendro da classe que pode modifcar ou ler os valores dos atributos
	private String nome;
	private double valor;
	
	public Produto() {
		super();
	}
	
	public Produto(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
}
