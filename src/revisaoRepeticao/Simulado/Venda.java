package revisaoRepeticao.Simulado;

public class Venda {
    private double valorVenda;
    private int formaDePagamento;
    private int totalDeVendas = 0;
    private double valorTotalDasVendas = 0;
    private double somaDinheiro = 0;
    private double somaCredito = 0;
    private double somaDebito = 0;
    private double somaPix = 0;

    public Venda(double valorVenda){
        if(valorVenda < 0){
            throw new IllegalArgumentException("Digite um valor acima de 0.");
        }
        this.valorVenda = valorVenda;
    }

    public void escolhaDaFormaDePagamento(int escolha, double valorVenda){
        switch(escolha){
            case 1:
                somaDinheiro += valorVenda;
                System.out.println(String.format("Valor de R$%.2f computado em Dinheiro.", valorVenda));
                valorTotalDasVendas += valorVenda;
                totalDeVendas++;
                break;
            case 2:
                somaCredito += valorVenda;
                System.out.println(String.format("Valor de R$%.2f computado em Crédito.", valorVenda));
                valorTotalDasVendas += valorVenda;
                totalDeVendas++;
                break;
            case 3:
                somaDebito += valorVenda;
                System.out.println(String.format("Valor de R$%.2f computado em Débito", valorVenda));
                valorTotalDasVendas += valorVenda;
                totalDeVendas++;
                break;
            case 4:
                somaPix += valorVenda;
                System.out.println(String.format("Valor de R$%.2f computado em Pix", valorVenda));
                valorTotalDasVendas += valorVenda;
                totalDeVendas++;
                break;
        }
    }

    public void formaPagamento(){
        System.out.println("""
                1- Dinheiro
                2- Cartão de Crédito
                3- Cartão de Débito
                4- Pix
                0- Encerrar""");
    }

    public void emitirVenda(){
        System.out.println("""
                Veja suas estatísticas do dia:
                
                ***********************************
                
                Total de vendas: %d
                Valor total arrecadado: R$%.2f
                Total por forma de pagamento:
                Dinheiro: R$%.2f
                Cartão de crédito: R$%.2f
                Cartão de débito: R$%.2f
                Pix: R$%.2f
                
                ***********************************""".formatted(getTotalDeVendas(), getValorTotalDasVendas(), getSomaDinheiro(), getSomaCredito(), getSomaDebito(), getSomaPix()));
    }

    public int getTotalDeVendas() {
        return totalDeVendas;
    }

    public double getValorTotalDasVendas() {
        return valorTotalDasVendas;
    }

    public double getSomaDinheiro() {
        return somaDinheiro;
    }

    public double getSomaCredito() {
        return somaCredito;
    }

    public double getSomaDebito() {
        return somaDebito;
    }

    public double getSomaPix() {
        return somaPix;
    }
}
