package Main.java;

public class Main {

	public static void main(String[] args) {
Professor professor1 = new Professor("Carlos", 4000.57);
		Professor professor2 = new Professor("João", 5000.00);
		Professor professor3 = new Professor("Ana", 7522.87);
		
		Professor[] professores1 = {professor1, professor2, professor3};
		
		Escola livraria1 = new Escola("Escola Estadual Nova Brasilia", 1995, professores1);
		livraria1.mostraInfo();
		
		
		Cliente cliente = new Cliente();
        ServicoEmail servico = new ServicoEmail();

        cliente.fazerPedido(servico);
    }
  
}
