package revisaoPOO.Produto;

public class Main {
    public static void main(String[] args){
        ProdutoFisico livro = new ProdutoFisico("Código Limpo", 100, 10);
        ProdutoDigital kindle = new ProdutoDigital("Código Limpo", 100, 10);

        System.out.println(kindle.exibirDados() + "\n");
        System.out.println(livro.exibirDados());
    }
}
