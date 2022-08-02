package ffelipe.alves.devdojo.Metodos.test;

import ffelipe.alves.devdojo.Metodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 32;
        int num2 = 43;

        calculadora.alteraDoisNumeros(num1,num2);
        //Nao eh possivel alterar uma variavel passando ela como parametro
        //para um metodo, ja que a variavel que o metodo usa ela uma variavel local dele
        //dessa forma passamos apenas uma copia da nossa variavel
        System.out.println("Fora do metodo");
        System.out.println(num1);
        System.out.println(num2);

    }
}
