package Aula1509;

import Aula1509.modelos.Conta;

public class App {
    public static void main(String[] args) {
        Conta cc1 = new Conta(1000, 200);
        Conta cc2 = new Conta(2000, 300);
        Conta cc3 = new Conta(3000, 400);
        System.out.println(cc1);
        System.out.println(cc2);
        System.out.println(cc3);

        System.out.println(Conta.getTotalContas());
    }

}
