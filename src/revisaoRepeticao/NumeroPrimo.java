package revisaoRepeticao;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int num = sc.nextInt();
        System.out.println();

        System.out.println("Numeros primos de 1 a " + num + ": ");
        ehPrimo(num);
    }

    private static void ehPrimo(int num){
        if (num > 0){
            for(int i = 2; i <= num; i++) {
                boolean primo = true;
                for(int j = 2; j < i; j++) {
                    if(i % j == 0) {
                        primo = false;
                        break;
                    }
                }
                if(primo) {
                    System.out.print(i + " ");
                }
            }
        } else {
            throw new IllegalArgumentException("Digite um valor acima de 0.");
        }
    }
}