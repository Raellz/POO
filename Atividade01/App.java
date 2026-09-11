package Atividade01;

public class App {
    public static void main(String[] args) {
        UsuarioBiblioteca u = new UsuarioBiblioteca(
                "2026001",
                "Ana Silva",
                "ana@ufla.br",
                3);
        System.out.println(u);
        System.out.println("Pode emprestar? " + u.podeEmprestar());
        System.out.println("Emprestimo 1: " + u.registrarEmprestimo());
        System.out.println("Emprestimo 2: " + u.registrarEmprestimo());
        System.out.println("Emprestimo 3: " + u.registrarEmprestimo());
        System.out.println("Emprestimo 4: " + u.registrarEmprestimo());
        System.out.println(u);
        System.out.println("Devolucao 1: " + u.registrarDevolucao());
        System.out.println("Devolucao 2: " + u.registrarDevolucao());
        u.setNome("Ana Carolina Silva");
        u.setEmail("ana.carolina@ufla.br");
        System.out.println(u);
    }
}