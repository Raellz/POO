package Aula0209;

public class App{
    int x; //atributo; se não iniciado recebe valor default 

    public void print(int ...vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(i + " = " + vetor[i]);
        }
    }

    public static void main(String[] args) {
        App objeto = new App();
        objeto.print(4,5,6,3,2,5,6,7,4);
        int x = 4; // variavel local
        int y = x+1;
        System.out.println(y);
    }
}
