package heranca;

public class Moto extends Veiculo {
    private boolean temBau;

    public Moto (String marca, String modelo, int ano, boolean temBau) {

        super();
        this.temBau = temBau;
    }

    public void empinar () {
        System.out.println("Empinando a moto.");
    }

}
