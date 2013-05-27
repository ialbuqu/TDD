package com.calculadora;

/**
 * Created with IntelliJ IDEA.
 * User: ialbuqu
 * Date: 5/22/13
 * Time: 4:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class Calculadora{
    public int a;
    public int b;

    public Calculadora(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int soma (){
        return a + b;
    }

    public int multiplicacao (){
        return a * b;
    }

    public int divisao (){
        return a/b;
    }
}
