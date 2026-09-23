import java.util.LinkedList;

public class App {
    public static void main(String[] args)  {
        StatusExemplar status = StatusExemplar.BLOQUEADO;;
        System.out.println(status);
        // status = "PERDIDO EM MARTE";
        try {
            new Exemplar("123", "Teste");
        } catch (Exception e) {
            System.out.println("Voce deve digitar um codigo ou titulo");
        }
    

        Exemplar ex = new Exemplar("23", "A");
        Exemplar ex2 = new Exemplar("12", "B");

        LinkedList<Exemplar> lista = new LinkedList<Exemplar>();
        lista.add(ex);
        lista.add(ex2);
        
        ex.bloquear();
        
        System.out.println("Codigo\t|\tTitulo\t|\tStatus\t\t|\tDisponivel");
        for (int i = 0; i < lista.size(); i++) {
            Exemplar obj = lista.get(i);
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