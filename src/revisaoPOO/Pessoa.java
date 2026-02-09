package revisaoPOO;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        validarDados(idade);

        this.nome = nome;
        this.idade = idade;
    }

    public String exibirDados(){
        return """
                Nome: %s
                Idade: %d
                """.formatted(getNome(), getIdade());
    }

    public void validarDados(int idade){
        if(idade <= 0){
            throw new IllegalArgumentException("Digite uma idade acima de 0.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        validarDados(idade);
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
