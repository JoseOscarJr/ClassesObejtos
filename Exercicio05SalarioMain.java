package classesOrientacao;

import java.util.Scanner;

public class Exercicio04SalarioMain {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Exercicio04Salario salario = new Exercicio04Salario();
		
		salario.setHoras(100);
		salario.setValorPorHora(10);
		System.out.println("Salario Bruto R$"+ salario.salarioBruto());
		System.out.println("INSS R$"+salario.pagoINSS());
		System.out.println("Sindicato R$"+salario.pagoSindicato());
		System.out.println("IR R$"+salario.pagoIR());
		System.out.println("Salario Liquido R$"+salario.salarioLiquido());
		ler.close();

	}

}
