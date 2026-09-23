package Aula2309;

public class MainAssociacao {
    public static void main(String[] args) {
        Usuario user = new Usuario("Jose", "321");
        Exemplar exem = new Exemplar("5555", "POO");

        Emprestimo emprestimo = new Emprestimo(user, exem);
        emprestimo.info();
    }
}
