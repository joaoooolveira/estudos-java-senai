package revisaoPOO.Produto;

public class ProdutoFisico extends Produto{
    private double valorFrete;

    public ProdutoFisico(String nome, double preco, double valorFrete) {
        super(nome, preco);
        validarFrete(valorFrete);

        this.valorFrete = valorFrete;
    }

    public void validarFrete(double valorFrete) {
        if(valorFrete <= 0){
            throw new IllegalArgumentException("Adicione o valor do frete");
        }
    }

    @Override
    public double calcularPrecoFinal() {
        return super.calcularPrecoFinal() + valorFrete;
    }

    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }
}
