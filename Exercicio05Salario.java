package classesOrientacao;

public class Exercicio04Salario {
	private double horas;
	private double valorPorHora;
	
	public double getHoras() {
		return horas;
	}
	public void setHoras(double horas) {
		if(horas > 0)
		this.horas = horas;
	}
	public double getValorPorHora() {
		return valorPorHora;
	}
	public void setValorPorHora(double valorPorHora) {
		if(valorPorHora > 0)
		this.valorPorHora = valorPorHora;
	}
	
	public double salarioBruto(){
		return horas*valorPorHora;
	}
	public double pagoINSS() {
		return (salarioBruto() * 0.08);
	}
	public double pagoSindicato() {
		return (salarioBruto() * 0.05);
	}
	public double pagoIR() {
		return (salarioBruto() * 0.11);
	}
	public double salarioLiquido() {
		return (salarioBruto()-(pagoINSS()+pagoIR()+pagoSindicato()));
	}
	
	
}
