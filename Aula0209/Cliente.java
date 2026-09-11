package Aula0209;

public class Cliente {
    String nome;
    String sobrenome;
    String documento;

    public void infoCliente(){
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Documento: " + documento);
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", sobrenome=" + sobrenome + ", documento=" + documento + "]";
    }

    

    
}
