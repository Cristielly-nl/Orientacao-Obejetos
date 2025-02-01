package heranca;

public abstract class Veiculo {
    
    protected String marca;
    protected String modelo;
    protected int ano;

    public void Veiculo (String marca, String modelo, int ano ) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void acelerar () {
        System.out.println("O veiculo está acelerando.");
    }
 
    public void frear () {
        System.out.println("O veiculo está freiando.");
    }
}
