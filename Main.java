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


		Professor professor1 = new Professor("José", 8978.00);
		Professor professor2 = new Professor("Daniel", 9900.00);
		Professor professor3 = new Professor("Paulo", 5220.00);
		
		Professor[] professores1 = {professor1, professor2, professor3};
		
		Escola livraria1 = new Escola("Escola Estadual Dr Caetano Munhoz Rocha", 1927, professores1);
		livraria1.mostraInfo();
		
		
		Cliente cliente = new Cliente();
        ServicoEmail servico = new ServicoEmail();

        cliente.fazerPedido(servico);
	
	}
	
}
