package heranca;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("\nCARRO");
        Carro meuCarro = new Carro("Civic", "Sedan", 2025, 4);

        meuCarro.acelerar();
        meuCarro.frear();

        System.out.println("\nMOTO");
        Moto minhaMoto = new Moto("Yamaha", "Fazer mt09", 2025, false);

        minhaMoto.acelerar();
        minhaMoto.empinar();
        minhaMoto.frear();

        System.out.println("\nCAMINHAO");
        Caminhao meuCaminhao = new Caminhao("Mercedes-Bens", "Atego", 2024, "17 toneladas ");

        meuCaminhao.engatarReboque();
        meuCaminhao.acelerar();
        meuCaminhao.frear();

        
    }

}
