package revisaoPOO;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public Aluno(String nome, int idade, int matricula, String curso) {
        super(nome, idade);
        this.matricula = matricula;
        this.curso = curso;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + """
                Matricula: %d
                Curso: %s""".formatted(matricula, curso);
    }
}
