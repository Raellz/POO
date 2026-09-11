package Aula0909;

public class Conta {
    private double saldo;
    private double limite;

    // Construtor
    public Conta(double limite){
        if (limite < 0) {
            limite = 0;
        }
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
}
