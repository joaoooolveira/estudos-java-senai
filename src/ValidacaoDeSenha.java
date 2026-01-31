import java.util.Scanner;

public class ValidacaoDeSenha {
    private static String senhaCorreta = "senai";
    private static int tentativas = 0;
    private static String senha;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        validarSenha(senha);
    }

    private static void validarSenha(String validar){
        while(tentativas < 3) {
            System.out.print("Digite a senha: ");
            senha = sc.next();
            if (senha.equals(senhaCorreta)) {
                System.out.println("Acesso permitido!");
                break;
            } else {
                System.out.println("Senha incorreta.\n");
                tentativas++;
            }
        }
        System.out.println("Você errou a senha 3 vezes. Tente novamente mais tarde.");
    }
}
