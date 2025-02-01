package heranca;

public class Caminhao extends Veiculo {

    private String capacidadeCarga;

    public Caminhao (String marca, String modelo, int ano, String capacidadeCarga) {

        super();
        this.capacidadeCarga = capacidadeCarga;
    }

    public void engatarReboque() {
        System.out.println("Engatando Reboque.");
    }

}
