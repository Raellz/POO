package Atividade01;
import java.util.Scanner;

public class AppTeste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Teste para receber valores do usuário
        // System.out.println("Digite a Matrícula: ");
        // String a = input.next();
        // System.out.println("Digite o nome: ");
        // String b = input.next();
        // System.out.println("Digite o email: ");
        // String c = input.next();
        // System.out.println("Digite o limite de empréstimos: ");
        // int d = input.nextInt();

        // Criação do Objeto
        UsuarioBiblioteca u = new UsuarioBiblioteca("12345", "John Doe", "john.doe@example.com", 5);

        // Teste dos metodos Get
        // System.out.println("Matricula: "+ u.getMatricula());
        // System.out.println("Nome: "+ u.getNome());
        // System.out.println("Email: "+ u.getEmail());
        // System.out.println("Emprestimos: "+ u.getEmprestimosAtivos());
        // System.out.println("Limite: " + u.getEmprestimosAtivos());

        // Teste dos metodos Set
        // u.setNome("Rafael");
        // u.setEmail("Rafael@");

        System.out.println(u);
    }
}