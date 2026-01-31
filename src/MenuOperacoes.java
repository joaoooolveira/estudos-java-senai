import java.util.Scanner;

public class MenuOperacoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println(menuOperacoes());

            System.out.print("Selecione uma opção: ");
            int escolha = sc.nextInt();

            if(escolha == 0){
                System.out.println("Fechando programa...");
                break;
            }

            validarCalculo(escolha);

            System.out.print("Digite o primeiro número: ");
            int num1 = sc.nextInt();

            System.out.print("Digite o segundo número: ");
            int num2 = sc.nextInt();

            calculo(escolha, num1, num2);
            System.out.println();
        }
    }

    private static String menuOperacoes(){
        return """
               ***********************
               1- Somar
               2- Subtrair
               3- Multiplicar
               4- Dividir
               0- Sair
               ***********************\n""";
    }

    private static void calculo(int escolha, int num1, int num2){
        switch (escolha) {
            case 1:
                int soma = num1 + num2;
                System.out.printf("Soma de %d + %d = %d%n", num1, num2, soma);
                break;
            case 2:
                int sub = num1 - num2;
                System.out.printf("Subtração de %d - %d = %d%n", num1, num2, sub);
                break;
            case 3:
                int mult = num1 * num2;
                System.out.printf("Multiplicação de %d * %d = %d%n", num1, num2, mult);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Não é possível dividir por zero.");
                    return;
                }
                double div = (double) num1 / num2;
                System.out.printf("Divisão de %d / %d = %.2f%n", num1, num2, div);
                break;
        }
    }

    private static void validarCalculo(int escolha){
        if(escolha < 0 || escolha > 4){
                throw new IllegalArgumentException("Digite um número que esteja no menu.");
        }
    }
}
