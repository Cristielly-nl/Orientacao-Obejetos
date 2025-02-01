package heranca;

public class Carro extends Veiculo{
    private int numeroPortas;

    public Carro (String marca, String modelo, int ano, int numeroPortas){

        super();
        this.numeroPortas = numeroPortas;
    }

    public void abrirTetoSolar () {
        System.out.println("Abrindo teto solar!");
    }




}
