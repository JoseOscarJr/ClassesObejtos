package classesOrientacao;

public class Exercicio07Quadrado {
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		if(lado > 0)
		this.lado = lado;
	}
	
	public double area() {
		return getLado() * getLado();
	}

}
