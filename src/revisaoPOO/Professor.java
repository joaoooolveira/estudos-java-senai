package revisaoPOO;

public class Professor extends Pessoa{
    private String disciplina;
    private double salario;

    public Professor(String nome, int idade, String disciplina, double salario) {
        super(nome, idade);
        this.disciplina = disciplina;
        this.salario = salario;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + """
                Disciplina: %s
                Salario: %.2f""".formatted(disciplina, salario);
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        validarSalario(salario);
        this.salario = salario;
    }

    public void validarSalario(double salario){
        if(salario <= 0){
            throw new IllegalArgumentException("Digite um salario acima de 0");
        }
    }
}
