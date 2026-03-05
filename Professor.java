package Main.java;

public class Professor {
	String nome;
	double salario;
	
	public Professor(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	String mostraInfo() {
		return this.nome + ": R$" + this.salario;
	}
}
