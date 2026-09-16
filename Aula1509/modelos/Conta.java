package Aula1509.modelos;

public class Conta {
    // Atributo da classe
    private static int totalContas;
    //Constante
    public static final String AGENCIA = "345-4";

    private int numero;
    private double saldo;
    private double limite;


    // Construtor
    public Conta(double saldo, double limite){
        this.numero = ++totalContas;
        this.saldo = saldo;
        this.limite = limite;
    }

    //Metodo
    public boolean depositar(double valor){
        if (valor <= 0){
            return false;
        }
        this.saldo += valor;
        return true;
    }

    public boolean sacar(double valor){
        if (valor <= this.saldo + this.limite){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public String extrato(){
        String saida = "----- EXTRATO -----\n" +
                "Saldo: " + this.saldo + "\n" +
                "Limite: " + this.limite + "\n" +
                "------------------- \n" +
                "Disponível: R$" + (this.saldo + this.limite);
        return saida;
    }

    public static int getTotalContas() {
        return totalContas;
    }

    @Override
    public String toString() {
        return "Conta [numero=" + numero + ", saldo=" + saldo + ", limite=" + limite + "]";
    }

    
}
