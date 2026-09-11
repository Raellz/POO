package Aula0909;

public class ClasseA {
    int atributoPadrao;
    public int atributoPublico;
    protected int atributoProtegido;
    private int atributoPrivado;

    // metodo de acesso
    public void modificaAtributos(){
        this.atributoPublico = 5;
        this.atributoPadrao = 6;
        this.atributoProtegido = 7;
        this.atributoPrivado = 8;
    }

    public String toString(){
        return "atributoPublico: " + atributoPublico + "\n" +
               "atributoPadrao: " + atributoPadrao + "\n" +
               "atributoProtegido: " + atributoProtegido + "\n" +
               "atributoPrivado: " + atributoPrivado;
    }
}
