package revisaoPOO.Produto;

public class ProdutoDigital extends Produto{
    private int percentualDesconto;

    public ProdutoDigital(String nome, double preco, int percentualDesconto) {
        super(nome, preco);
        validarDesconto(percentualDesconto);

        this.percentualDesconto = percentualDesconto;
    }

    public void validarDesconto(int percentualDesconto){
        if(percentualDesconto <= 0 || percentualDesconto > 100){
            throw new IllegalArgumentException("Adicione um valor de desconto valido.");
        }
    }

    public double calcularDesconto(){
        return getPreco() * percentualDesconto / 100;
    }

    @Override
    public double calcularPrecoFinal() {
        return super.calcularPrecoFinal() - calcularDesconto();
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + """
                Tipo do produto: Digital
                Preco: %.2f
                """.formatted(calcularPrecoFinal());
    }

    public void setPercentualDesconto(int percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }
}
