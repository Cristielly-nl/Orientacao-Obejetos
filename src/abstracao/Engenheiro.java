package abstracao;

public class Engenheiro extends Funcionario {
    private String areaAtuacao;

    public Engenheiro(String nome, double salario, String departamento, String areaAtuacao) {

        super(nome, salario, departamento);
        this.areaAtuacao = areaAtuacao;
        
    }

   

}
