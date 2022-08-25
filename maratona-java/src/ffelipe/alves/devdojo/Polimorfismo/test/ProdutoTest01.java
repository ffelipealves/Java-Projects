package ffelipe.alves.devdojo.Polimorfismo.test;

import ffelipe.alves.devdojo.Polimorfismo.dominio.Computador;
import ffelipe.alves.devdojo.Polimorfismo.dominio.Televisao;
import ffelipe.alves.devdojo.Polimorfismo.dominio.Tomate;
import ffelipe.alves.devdojo.Polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Alienware 11", 15000);
        Tomate tomate = new Tomate("Tomate nanico", 10);
        Televisao tv = new Televisao("Samsung 75\" 8k",9500);

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------------------");
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("---------------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
