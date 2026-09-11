package Aula0909;

public class ClasseB {
    public void modificarAtributoB(){
        ClasseA obj = new ClasseA();
        obj.modificaAtributos();
        obj.atributoPublico = -9;
        obj.atributoPadrao = -10;
        obj.atributoProtegido = -11;

        System.out.println(obj.toString());
    }

    public static void main(String[] args) {
        ClasseB cb = new ClasseB();
        cb.modificarAtributoB();
    }
}
