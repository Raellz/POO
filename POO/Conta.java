package POO;

import java.time.format.TextStyle;

public class Conta {
    // Atributos
    double numero;
    String titular;
    double saldo;
    double limite;

    //Construtor
    public Conta(int numero){
        this.numero = numero;
    }

    public Conta(int num, String tit){
        numero = num;
        titular = tit;
    }

    public Conta(){
        
    }

    /**
     * Exibe Informações da conta
    */
    public void info(){
        System.out.println("Numero: " + numero);
        System.out.println("Titlar: " + titular);
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);
    }

    /** 
     *  Metodo para deposito
    */
    public void depositar(double valor){
        if (valor > 0){
            this.saldo = this.saldo + valor;
        }
    }

    /** 
     * Metodo para saque
     * @category Valor na conta
    */
    public void sacar(double valor){
        if ((valor > 0) && (valor <= this.saldo + this.limite)){
            this.saldo = this.saldo - valor;
            System.out.println("Saque realizado com sucesso!");
        } else if (valor <= 0){
            System.out.println("Valor do Saque Inválido");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}