package PrimeirasAulas;
import java.util.Scanner;

public class MiniCalculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Coloque o primeiro número:");
        double num1 = input.nextDouble();

        System.out.println("Escolha a operação (+, -, *, /):");
        String operacao = input.next();

        System.out.println("Coloque o segundo número:");
        double num2 = input.nextDouble();


        double resultado = 0;
        if (operacao.equals("+")){
            resultado = num1 + num2;
        }else if (operacao.equals("-")){
            resultado = num1 + num2;
        }else if (operacao.equals("*")){
            resultado = num1 * num2;
        }else if (operacao.equals("/")){
            resultado = num1 / num2;
        }else{
            System.out.println("Operação Inválida");
        }
        System.out.println("Resutado = " + resultado);
    }
    
}