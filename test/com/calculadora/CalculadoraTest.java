package com.calculadora;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: ialbuqu
 * Date: 5/22/13
 * Time: 4:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class CalculadoraTest {

    @Test
    public void testeSomaDoisEDois(){
        Calculadora calculadora = new Calculadora(2, 2);
        int total = calculadora.soma();
        assertEquals(total, 4);
    }

    @Test
    public void testeSomaInteiroNegativo(){
        Calculadora calculadora = new Calculadora(4, -5);
        int total = calculadora.soma();
        assertEquals(total, -1);
    }

    @Test
    public void testeConstrutor(){
        Calculadora calculadora = new Calculadora(2, 2);
        assertEquals(calculadora.a, 2);
    }

    @Test
    public void testeMultiplicacaoDoisNumeros(){
        Calculadora calculadora = new Calculadora(2, 3);
        int total = calculadora.multiplicacao();
        assertEquals(total, 6);

    }

    @Test
    public void testeMultiplicacaoPorZero(){
        Calculadora calculadora = new Calculadora(2, 0);
        int total = calculadora.multiplicacao();
        assertEquals(total, 0);
    }

    @Test
    public void testeDivisao(){
        Calculadora calculadora = new Calculadora(2, 2);
        int total = calculadora.divisao();
        assertEquals(total, 1);
    }

    @Test
    public void testeDivisaoPorNegativo(){
        Calculadora calculadora = new Calculadora(2, -1);
        int total = calculadora.divisao();
        assertEquals(total, -2);
    }

    @Test(expected=Exception.class)
    public void testeDivisaoPorZero(){
        Calculadora calculadora = new Calculadora(2, 0);
        calculadora.divisao();
    }
}
