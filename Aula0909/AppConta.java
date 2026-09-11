package Aula0909;

public class AppConta {
    public static void main(String[] args) {
        Conta cc = new Conta(500);
        cc.depositar(200);
        System.out.println(cc.extrato());

    }
}
