package classesOrientacao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio08PessoaMain {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		Exercicio08Pessoa pessoa = new Exercicio08Pessoa();
		
		pessoa.setAltura(1.50);
		pessoa.setIdade(18);
		pessoa.setNome("José");
		pessoa.setPeso(80);
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.crescer(0.20));
		System.out.println(pessoa.peso(12));
		System.out.println(pessoa.envelhecer(5));
		System.out.println(df.format(pessoa.getAltura()));
		ler.close();
	}

}
