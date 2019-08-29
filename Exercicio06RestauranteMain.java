package classesOrientacao;

import java.util.Scanner;

public class Exercicio06RestauranteMain {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Exercicio06Restaurante restaurante = new Exercicio06Restaurante();
		while(restaurante.getCod() != 0) {
			System.out.println("\nEspecificação   cod    preço\n"+
					"Cachorro Quente 100 R$ 1,20\r\n" + 
					"Bauru Simples   101 R$ 1,30\r\n" + 
					"Bauru com ovo   102 R$ 1,50\r\n" + 
					"Hambúrguer      103 R$ 1,20\r\n" + 
					"Cheeseburguer   104 R$ 1,30\r\n" + 
					"Refrigerante    105 R$ 1,00\n"+
					"Sair            0   \n");
			System.out.println("Sua opção ");
			restaurante.setCod(ler.nextInt());
			System.out.println("Quantidade? ");
			restaurante.setQuantidade(ler.nextInt());
			
			System.out.println("Pedido parcial R$"+restaurante.pedido() );
		}
		System.out.println("Total: "+ restaurante.getTotal());
		ler.close();
	}

}
