package classesOrientacao;

public class Exercicio03ClasseOperacoes {
	private int numero1;
	private int numero2;
	private String oper;
	
	public String getOper() {
		return oper;
	}

	public void setOper(String oper) {
		if(oper != "+" ||oper != "*" ||oper != "/" ||oper != "-")
		this.oper = oper;
	}

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

	public double operacoes() {
		switch (oper) {
		case "+":
			return (numero1 + numero2);
		case "-":
			return (numero1 - numero2);
		case "*":
			return (numero1 * numero2);
		case "/":
			return (numero1 / numero2);
		default:
			break;
		}
		return 0;

	}

}
