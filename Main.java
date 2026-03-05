package Main.java;

public class Main {

	public static void main(String[] args) {

		Carro carro1 = new Carro("Preto", "Jetta", 2023, "2.0 TSI turbo");
		carro1.ligar_carro();
		carro1.buzinar();
		Carro carro2 = new Carro("Bordô", "Maverick V8 Clássico", 1976, "V8");
		carro2.ligar_carro();
		carro2.buzinar();
	
		Trator trator2 = new Trator("Amarelo", "Caterpillar D6T XL", 2013, "Motor Cat C9", "Tração esteirada", "Terraplanagem");
		trator2.ligar_carro();
		trator2.buzinar();
		Trator trator1 = new Trator("Azul", "New Holland 7630", 2020, "Motor Genesis 110cv", "Tração 4x4", "Agricultura");
		trator1.ligar_carro();
		trator1.buzinar();
	
	}
	
}
