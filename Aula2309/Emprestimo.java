package Aula2309;
import java.time.LocalDate;


public class Emprestimo {
    private Exemplar exemplar;
    private Usuario usuario;
    private LocalDate dataEmprestimo;

    public Emprestimo(Exemplar exemplar, Usuario usuario) {
        this.exemplar = exemplar;
        this.usuario = usuario;
    }

    public Emprestimo(Usuario usuario, Exemplar exemplar){
        this.exemplar = exemplar;
        this.usuario = usuario;
        dataEmprestimo = LocalDate.now();
    }

    public void info(){
        System.out.println("-=-=-=-=-=-=-=-=-=");
        System.out.println("Exemplar: ");
        System.out.println("Codigo: " + exemplar.getCodigo());
        System.out.println("Titulo: " + exemplar.getTitulo());
        System.out.println("Usuario: ");
        System.out.println("Matricula: " + usuario.getMatricula());
        System.out.println("Nome: " + usuario.getNome());

    }
}
