package POO;
public class AppPOO {
    public static void main(String[] args) {
        Conta cc1 = new Conta(54);
        Conta cc2 = new Conta(89, "Joao");
        
        System.out.println("-+-+ cc1 +-+-");
        cc1.info();

        System.out.println("-+-+ cc2 +-+-");
        cc2.info();

        cc1.numero = 54;
        cc1.titular = "Rafael";
        cc1.saldo = 1000.40;
        cc1.limite = 2000;

        cc2.numero = 53;
        cc2.titular = "Maria";
        cc2.saldo = 3452.40;
        cc2.limite = 5000;

        System.out.println("-+-+ cc1 +-+-");
        cc1.info();

        System.out.println("-+-+ cc2 +-+-");
        cc2.info();
    }
}
