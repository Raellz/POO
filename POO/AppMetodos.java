package POO;
public class AppMetodos {
    public static void main(String[] args) {
        Conta cc = new Conta(102, "Alan Turning");
        cc.saldo = 1000;
        cc.limite = 2000;

        cc.info();
        cc.depositar(345);
        cc.info();
        cc.depositar(235);
        cc.info();
        cc.sacar(1000);
        cc.info();
        cc.sacar(580);
        cc.info();
        cc.sacar(580);
        cc.info();
        cc.sacar(580);
        cc.info();
        cc.sacar(840);
        cc.info();
        cc.sacar(50);
        cc.info();
    }
}
