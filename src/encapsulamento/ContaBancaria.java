package encapsulamento;
public class ContaBancaria {

    private int numConta;
    private String titular;
    private double saldo;


    public ContaBancaria (int numConta, String titular, double saldo) {
        this.numConta = numConta;
        this.titular = titular;
        this.saldo = saldo;
    }
   
    public void sacar (double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("SALDO INSUFICIENTE!");
        }

    }

    public void depositar (double valor) {
        saldo += valor;
    }

    public double consultarSaldo () {
        return saldo;
    }


    

}
