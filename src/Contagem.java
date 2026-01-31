import java.util.Scanner;

public class Contagem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        if(num > 0) {
            System.out.println("Contagem de 1 a " + num);
            for (int i = 1; i <= num; i++) {
                System.out.print(i + " ");
            }

            System.out.print("\nNúmeros pares: ");
            for (int i = 1; i <= num; i++) {
                if(i % 2 == 0){
                    System.out.print(i + " ");
                }
            }

            System.out.print("\nNúmeros ímpares: ");
            for (int i = 1; i <= num; i++) {
                if(i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        }
        else {
            throw new IllegalArgumentException("Digite um valor acima de 0");
        }
    }
}
