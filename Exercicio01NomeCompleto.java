package classesOrientacao;

public class Exercicio01NomeCompleto {
	private String nome;
	private String nomeSobrenome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length() > 1)
		this.nome = nome;
	}
	public String getNomeSobrenome() {
		return nomeSobrenome;
	}
	public void setNomeSobrenome(String nomeSobrenome) {
		this.nomeSobrenome = nomeSobrenome;
	}
	
	public String jutandoNome() {
		String nomeCom;
		nomeCom = nome +" "+ nomeSobrenome;
		return nomeCom;
	}
	
}
