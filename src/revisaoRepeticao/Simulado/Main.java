package revisaoRepeticao.Simulado;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendas do dia\nAssim que encerrar digite 0 no valor e na forma de pagamento.");

        double venda = 0;

        Venda vendas = new Venda(venda);

        while (true){
            System.out.println();
            System.out.print("Digite o valor da venda: ");
            venda = sc.nextInt();

            vendas.formaPagamento();
            int escolha = sc.nextInt();

            if (escolha == 0){
                System.out.println("Finalizando programa...");
                break;
            }

            vendas.escolhaDaFormaDePagamento(escolha, venda);
        }

        vendas.emitirVenda();
    }
}
