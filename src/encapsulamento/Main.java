package encapsulamento;

public class Main{
    public static void main (String []args) {

        ContaBancaria conta1 = new ContaBancaria(147852, "Marcos", 500.00);

        conta1.depositar(200.00);
        conta1.sacar(900.00);
        System.out.println("Saldo Atual: " + conta1.consultarSaldo());
    }
}
