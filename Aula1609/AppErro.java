public class AppErro {
    public static void main(String[] args) {
        Exemplar ex = new Exemplar("123", "Teste");
        ex.emprestar();
        ex.devolver();
        ex.devolver();
        ex.bloquear();
    }
}
