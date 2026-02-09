package revisaoPOO;

public class Main {
    public static void main(String[] args){
        Aluno aluno1 = new Aluno("Joao", 18, 1, "Desenvolvimento de Sistemas");
        Professor professor1 = new Professor("Iago", 28, "Desenvolvimento de Sistemas", 3000);

        System.out.println(aluno1.exibirDados() + "\n");
        System.out.println(professor1.exibirDados());
    }
}
