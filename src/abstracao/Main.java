package abstracao;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        
        Gerente gerente = new Gerente("Marcos", 5000, "TI",  1000);
        Engenheiro engenheiro = new Engenheiro("Marta", 4000, "Engenharia", "Sftware");

        System.out.println("\n");
        System.out.println("Salario do Gerente: " + gerente.calcularSalario());
        System.out.println("Salario do Engenheiro: " + engenheiro.calcularSalario());
    }

}
