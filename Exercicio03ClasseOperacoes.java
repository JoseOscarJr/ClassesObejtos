package classesOrientacao;

public class Exercicio03ClasseOperacoes {
	private double numero1;
	private double numero2;
	private String oper;
	
	public String getOper() {
		return oper;
	}

	public void setOper(String oper) {
		if(oper.equalsIgnoreCase("+") ||oper.equalsIgnoreCase("*") ||oper.equalsIgnoreCase("/") ||oper.equalsIgnoreCase("-")) {
			this.oper = oper;
		}else {
			oper = "ERRO";
			this.oper = oper;
		}
	}

	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}
	
	public double getNumero2() {
		return numero2;
	}

	public void setNumero2(double numero2) {
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
