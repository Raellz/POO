import java.util.Scanner;

public class AtividadeP1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Nota 1º Prova: ");
        double n1 = input.nextDouble();

        System.out.printf("Nota 2º Prova: ");
        double n2 = input.nextDouble();
        
        System.out.printf("Nota 3º Prova: ");
        double n3 = input.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        if(media >= 7){
            System.out.println("Aprovado");
        } else {
            double ProvaFinal = 10 - media;
            System.out.printf("Precisa tirar %.2f na prova final", ProvaFinal);
        }
    }
}