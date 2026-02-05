package revisaoRepeticao;

import java.util.Scanner;

public class Fibonacci {
    private static int num1 = 0;
    private static int num2 = 1;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int num = sc.nextInt();

        calculoFibonacci(num);
    }

    private static void calculoFibonacci(int num){
        if(num < 0){
            throw new IllegalArgumentException("Digite um numero maior que 0.");
        }
        while (num1 < num){
            System.out.println(num1);
            int soma = num1 + num2;
            num1 = num2;
            num2 = soma;
        }
    }
}
