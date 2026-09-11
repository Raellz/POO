package Aula0209;

public class AppBanco {
    public static void main(String[] args) {
        Cliente cli = new Cliente();
        cli.nome = "Jonh";
        cli.sobrenome = "Doe";
        cli.documento = "123";

        Conta1 cc = new Conta1();
        cc.numero = 12;
        cc.saldo = 2000;
        cc.limite = 1000;
        cc.titular = cli;

        Cliente cli1 = new Cliente();
        cli1.nome = "Fulano";
        cli1.sobrenome = "Beutrano";
        cli1.documento = "321";

        Conta1 cc1 = new Conta1();
        cc1.numero = 34;
        cc1.saldo = 5000;
        cc1.limite = 4000;
        cc1.titular = cli1;

        cc.infoConta1();

        cc1.infoConta1();
    }
}
