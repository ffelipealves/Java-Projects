package ffelipe.alves.devdojo.Metodos.test;

import ffelipe.alves.devdojo.Metodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.soma(4,6);
        calculadora.subtrai(87,45);
        calculadora.multiplica(232,4);
        System.out.println(calculadora.divide(23,0));
        System.out.println("Finalizando Calculadora");
    }
}
