package classesOrientacao;

import java.util.Arrays;

public class Exercicio02VetorNumero {
	private int numero1;
	private int numero2;
	
	public int getNumero1() {
		return numero1;
	}
	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	public int getNumero2() {
		return numero2;
	}
	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	
	public boolean flag() {
		boolean flag;
		if(numero1 >= numero2)
			flag = true;
		else
			flag = false;
		
		return flag;
	}
	
	public int[] retornadoVetorNumero() {
		int[] vet = new int[(numero2-numero1)-1];
		int cont = numero1;
			for (int i = 0; i < vet.length; i++) {
				cont = cont+1;
				vet[i] = cont;
			
			}
		return vet;
		
	}
	@Override
	public String toString() {
		return  Arrays.toString(retornadoVetorNumero()) ;
	}
	
	
}
