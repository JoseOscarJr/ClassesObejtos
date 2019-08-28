package classesOrientacao;

public class Exercicio07QuadradoMain {

	public static void main(String[] args) {
		Exercicio07Quadrado lado = new Exercicio07Quadrado();
		
		lado.setLado(5);
		System.out.println("Lado ="+ lado.getLado());
		System.out.println("Area ="+ lado.area());

	}

}
