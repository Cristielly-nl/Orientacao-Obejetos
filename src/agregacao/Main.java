package agregacao;

public class Main {
    public static void main(String[] args) {
        
        Pedido pedido = new Pedido(125);


        ItemPedido item1 = new ItemPedido("Caderno", 10.0, 3);

        ItemPedido item2 = new ItemPedido("Caneta", 2.5, 5);
        
        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);

        System.out.println("Valor total do pedido: " + pedido.calcularTotal());
    }

}
