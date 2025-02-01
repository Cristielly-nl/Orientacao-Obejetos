package polimorfismo;

public class Passaro implements Animal{

    @Override
    public void fazerBarulho() {
        System.out.println("Piu!");
    }

    @Override
    public void mover() {
        System.out.println("Voando!");
    }

}
