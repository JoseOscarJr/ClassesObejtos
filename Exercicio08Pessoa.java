package classesOrientacao;

public class Exercicio08Pessoa {
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length() > 1)
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if(idade > 0)
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		if(altura > 0)
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		if(peso > 0)
		this.peso = peso;
	}
	public double crescer(double crescer) {
		this.altura = altura + crescer;
		return altura;
	}
	public double peso(double acrescentarPeso) {
		this.peso = peso + acrescentarPeso;
		return peso;
	}
	public int envelhecer(int anosAMais) {
		for (int i = 0; i < anosAMais; i++) {
			this.idade = idade +1;
			if(idade < 21) {
				crescer(0.005);
			}
		}
		return idade;
	}
}
