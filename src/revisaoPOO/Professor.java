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
}
