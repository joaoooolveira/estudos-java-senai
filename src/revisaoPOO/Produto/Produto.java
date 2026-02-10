package revisaoPOO.Produto;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        validarDados(nome, preco);
        this.nome = nome;
        this.preco = preco;
    }

    public double calcularPrecoFinal(){
        return getPreco();
    }

    public String exibirDados(){
        return """
                Nome: %s
                """.formatted(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        validarDados(nome, preco);
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        validarDados(nome, preco);
        this.preco = preco;
    }

    public void validarDados(String nome, double preco){
        if(nome.isBlank()){
            throw new IllegalArgumentException("Coloque o nome do produto.");
        }
        if(preco <= 0){
            throw new IllegalArgumentException("Digite o preco do produto.");
        }
    }
}
