package revisaoRepeticao;

import java.util.Scanner;

public class ClassificacaoDeNumeros {
    private static int numeroPositivo = 0;
    private static int numeroNegativo= 0;
    private static int numeroPar = -1;
    private static int numeroImpar = 0;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 1;

        System.out.println("Digite números inteiros (assim que quiser parar o programa, digite 0)\n");

        while(num != 0){
            System.out.print("Digite um número: ");
            num = sc.nextInt();
            validarNumero(num);
        }

        contagem();
    }
    private static void contagem(){
        System.out.println("""
                Números positivos: %d
                Números negativos: %d
                Números pares: %d
                Números ímpares: %d""".formatted(numeroPositivo, numeroNegativo, numeroPar, numeroImpar));
    }

    private static void validarNumero(int num){
        if(num > 0){
            numeroPositivo++;
        } if(num < 0){
            numeroNegativo++;
        } if (num % 2 == 0){
            numeroPar++;
        } if (num % 2 != 0){
            numeroImpar++;
        }
    }
}
