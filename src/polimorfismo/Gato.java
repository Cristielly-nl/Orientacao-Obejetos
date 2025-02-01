package polimorfismo;

public class Gato implements Animal {

    @Override
    public void fazerBarulho() {
        System.out.println("Miau!");
    }

    @Override
    public void mover() {
       System.out.println("Andando Silenciosamente!");
    }

}
