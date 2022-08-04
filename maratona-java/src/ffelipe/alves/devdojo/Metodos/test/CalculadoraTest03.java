package ffelipe.alves.devdojo.Metodos.test;

import ffelipe.alves.devdojo.Metodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};

        calculadora.somaArray(numeros);
        //o var args nos permite passar por parametro um lista de array de uma forma mais simples
        calculadora.somaVarArgs(3,4,6,2,5,7,3,4,7,1,2,5,7,4,3);
    }
}
