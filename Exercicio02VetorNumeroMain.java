package classesOrientacao;

import java.util.Scanner;

public class Exercicio02VetorNumeroMain {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Exercicio02VetorNumero numero = new Exercicio02VetorNumero();

		do {
			System.out.print("informe primeiro numero: ");
			numero.setNumero1(ler.nextInt());
			System.out.print("informe segundo numero: ");
			numero.setNumero2(ler.nextInt());
			if(numero.flag()) {
				System.out.println("Segundo numero tem que ser maior!");
			}
				
		}while(numero.flag());
		System.out.println(numero.toString());
		ler.close();
	}

}
