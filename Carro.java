package Main.java;

public class Carro {
	String cor;
	String nome;
	int ano;
	Motor motor;
	
	Carro(String cor, String nome, int ano, String motorTipo){
		this.cor = cor;
		this.nome = nome;
		this.motor = new Motor(motorTipo);
	}
	
	void ligar_carro() {
		this.motor.ligar();
		System.out.println("Você colocou o " + this.nome + " " + this.cor +" em funcionamento.");
	}
	
	void buzinar() {
		System.out.println("biii, biiiip");
	}
	
}
