package classesOrientacao;

public class Exercicio06Restaurante {
	private int cod = 1;
	private int quantidade;
	private double total ;
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	public double pedido() {
		double dog = 1.20;
		double bauruS = 1.30;
		double bauruCOvo = 1.50;
		double Hambur = 1.20;
		double Cheeseburguer = 1.30;
		double Refrigerante = 1.00;
		
		switch (cod) {
		case 100:
			total += quantidade * dog;
			return quantidade * dog;
			
		case 101:
			total += quantidade * bauruS;
			return quantidade * bauruS;

		case 102:
			total += quantidade * bauruCOvo;
			return quantidade * bauruCOvo;

		case 103:
			total += quantidade * Hambur;
			return quantidade * Hambur;

		case 104:
			total += quantidade * Cheeseburguer;
			return quantidade * Cheeseburguer;

		case 105:
			total += quantidade * Refrigerante;
			return quantidade * Refrigerante;

		default:
			break;
		}
		return 0;
		
	}
}
