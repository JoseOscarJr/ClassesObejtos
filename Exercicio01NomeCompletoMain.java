package classesOrientacao;

import java.util.Scanner;

public class Exercicio01NomeCompletoMain {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Exercicio01NomeCompleto nome = new Exercicio01NomeCompleto();
		
		System.out.print("Informe seu nome: ");
		nome.setNome(ler.next());
		
		System.out.print("Informe seu sobrenome: ");
		nome.setNomeSobrenome(ler.next());
		
		System.out.println("Seu nome completo é: "+nome.jutandoNome());
		ler.close();
	}

}
