package model;

public class TesteProduto {

	public static void main(String[] args) {
		Produto prod = new Produto("Biscoito recheado", 2.50);
		System.out.println("O produto " + prod.getNome() + " custa R$" + prod.getValor() + " reais.");
	}

}
