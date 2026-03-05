package Main.java;

public class Motor {
	String tipo;
	Motor(String tipo){
		this.tipo = tipo;
	}
	
	void ligar() {
		System.out.println("Você deu a partida no " + this.tipo);
	}
	
}
