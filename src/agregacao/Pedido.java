package agregacao;

import java.util.ArrayList;
import java.util.List;


public class Pedido {
    private int numeroPedido;
    private List<ItemPedido> itens = new ArrayList<>();


    //Construtor
    public Pedido(int numeroPedido){
        this.numeroPedido = numeroPedido;
    }


    //Getters e Setters
     public int getNumeroPedido() {
         return numeroPedido;
     }
     public void setNumeroPedido(int numeroPedido) {
         this.numeroPedido = numeroPedido;
     }


     //Metodos
     public void adicionarItem(ItemPedido item) {
        itens.add(item);
     }

     public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens ) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
     }



}
