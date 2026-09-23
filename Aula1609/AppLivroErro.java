import java.util.List;

public class AppLivroErro {
    public static void main(String[] args) {
        Livro liv = new Livro("1234-4321", "Livro Teste");
        Exemplar ex1 = new Exemplar("283", liv.getTitulo());
        Exemplar ex2 = new Exemplar("275", liv.getTitulo());
        liv.adicionarExemplar(ex1);
        liv.adicionarExemplar(ex2);
        liv.relatorioExemplares();
        System.out.println("Quebrando o Encapsulamento");
        List<Exemplar> lista = liv.getExemplares();
        lista.clear();
        Exemplar exEstranho = new Exemplar("000", "GNVJfh");
        lista.add(exEstranho);
        liv.relatorioExemplares();
    }
}
