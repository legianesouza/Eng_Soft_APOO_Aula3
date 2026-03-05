package Main.java;

//exemplo de dependencia.
public class Cliente {

    public void fazerPedido(ServicoEmail servico) {
        System.out.println("Pedido realizado com sucesso.");
        servico.enviarEmail("Seu pedido foi confirmado e já está em preparo!");
    }

}
