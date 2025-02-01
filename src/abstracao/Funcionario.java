package abstracao;

public class Funcionario {
    protected String nome;
    protected double  salario;
    protected String departamento;


    //Construtor
    public Funcionario (String nome, double salario, String departamento ){
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    //Metodos
    public double calcularSalario () {
        return salario;
    }

    public String obterBeneficios () {
        return "Plano de saúde e vale-refeição";
    }

    //getters e setters
    public String getNome() { //Mostrar nome
        return nome;
    }
    public void setNome(String nome) { //Alterar nome
        this.nome = nome;
    }

    public double getSalario() { //Mostrar salario
        return salario;
    }

    public void setSalario(double salario) { //Alterar salario
        this.salario = salario;
    }

    public String getDepartamento() { //Mostrar Departamento
        return departamento;
    }
    public void setDepartamento(String departamento) { //Alterar departamento
        this.departamento = departamento;
    }


}
