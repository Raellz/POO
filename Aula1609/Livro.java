import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String isbn;
    private String titulo;

    //Estrutura de dados
    private List<Exemplar> exemplares = new ArrayList<Exemplar>();

    public Livro(String isbn, String titulo) {
        if (isbn == null || isbn.isBlank()){
            throw new IllegalArgumentException("ISBN deve ser preenchido.");
        }

        if (titulo == null || titulo.isBlank()){
            throw new IllegalArgumentException("Titulo deve ser preenchido.");
        }

        this.isbn = isbn;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getIsbn() {
        return isbn;
    }

    public int getQuantidadeExemplares(){
        return exemplares.size();
    }

    public void adicionarExemplar(Exemplar exemplar) {
        if (exemplar == null) {
            throw new IllegalArgumentException("Exemplar nao pode ser nulo.");
        }
        if (isCodigoExemplarRepetido(exemplar.getCodigo())) {
            throw new IllegalArgumentException("Codigo do exemplar ja existe.");
        }
        exemplares.add(exemplar);
    }

    private boolean isCodigoExemplarRepetido(String codigo) {
        for (Exemplar exemplar : exemplares) {
            if (exemplar.getCodigo().equals(codigo)) {
                return true;
            }
        }
        return false;
    }

    public List<Exemplar> getExemplares() {
        return List.copyOf(exemplares);
    }

    public void relatorioExemplares() {
        System.out.println("---------------------------");
        System.out.println("TITULO: " + titulo);
        System.out.println("ISBN: " + isbn);
        System.out.println("Codigo\t|\tTitulo\t\t|\tStatus\t\t|\tDisponivel");
        for (int i = 0; i < exemplares.size(); i++) {
            Exemplar obj = exemplares.get(i);
            System.out.print(obj.getCodigo());
            System.out.print("\t|\t");
            System.out.print(obj.getTitulo());
            System.out.print("\t|\t");
            System.out.print(obj.getStatus());
            System.out.print("\t|\t");
            System.out.println(obj.isDisponivel()); // pra quebrar linha
        }
    }
}
