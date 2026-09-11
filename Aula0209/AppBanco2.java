package Aula0209;

public class AppBanco2 {
    public static void main(String[] args) {
        Cliente cli = new Cliente();
        cli.nome = "Jonh";
        cli.sobrenome = "Doe";
        cli.documento = "123";

        System.out.println(cli);
        System.out.println(cli.toString());
        
    }
}
