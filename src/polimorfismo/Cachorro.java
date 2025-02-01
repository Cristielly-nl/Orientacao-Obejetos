package polimorfismo;

public class Cachorro implements Animal {

    @Override
    public void fazerBarulho() {
        System.out.println("Au Au !");
    }

    @Override
    public void mover() {
        System.out.println("Correndo!");
    }

}
