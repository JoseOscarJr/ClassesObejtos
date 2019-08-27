package classesOrientacao;

import java.util.Scanner;

public class Exercicio03ClasseOperacoesMain {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Exercicio03ClasseOperacoes operacao = new Exercicio03ClasseOperacoes();
		
		System.out.print("informe o primeiro numero: ");
		operacao.setNumero1(ler.nextInt());
		System.out.print("Informe a operação: ");
		operacao.setOper(ler.next());
		System.out.print("Informe o segundo numero: ");
		operacao.setNumero2(ler.nextInt());
		System.out.println(operacao.getNumero1()+operacao.getOper()+operacao.getNumero2()+"="+ operacao.operacoes());
		ler.close();
	}

}
