import java.util.Scanner;

public class AtividadeP2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int EscolhaMenu;

        do{
            System.out.printf("+=+= Menu de Opções +=+=\n");
            System.out.printf("1 - Somar\n");
            System.out.printf("2 - Subtrair\n");
            System.out.printf("3 - Multiplicar\n");
            System.out.printf("4 - Dividir\n");
            System.out.printf("5 - Aperte 00 para SAIR\n");
            System.out.printf("Escolha uma opção: ");
            EscolhaMenu = input.nextInt();

            System.out.printf("Coloque o primeiro número: ");
            double num1 = input.nextDouble();

            System.out.printf("Coloque o segundo número: ");
            double num2 = input.nextDouble();

            double resultado = 0;

            if (EscolhaMenu == 1) {
                resultado = num1 + num2;
                System.out.printf("Resultado da soma: %.2f\n", resultado);
            } else if (EscolhaMenu == 2) {
                resultado = num1 - num2;
                System.out.printf("Resultado da subtração: %.2f\n", resultado);
            } else if (EscolhaMenu == 3) {
                resultado = num1 * num2;
                System.out.printf("Resultado da multiplicação: %.2f\n", resultado);
            } else if (EscolhaMenu == 4) {
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.printf("Resultado da divisão: %.2f\n", resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
            }else {
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }

          
        } while (EscolhaMenu != 00);
       }
        
}
