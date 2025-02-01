package abstracao;

public class Gerente extends Funcionario{
    private double bonus;

    public Gerente(String nome, double salario, String departamento, double bonus) {
        super(nome, salario, departamento);
        this.bonus = bonus;
    }

    public double calcularSalario() {
        return salario + bonus;
    }

}
