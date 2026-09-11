package Aula0209;

public class Conta1 {
    int numero;
    double saldo, limite;
    Cliente titular;

    public void infoConta1(){
        System.out.println("Numero: " + numero);
        System.out.print("Titlar: \n");
        titular.infoCliente();
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);
    }
}
