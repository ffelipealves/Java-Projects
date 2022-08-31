package ffelipe.alves.devdojo.Polimorfismo.servico;

import ffelipe.alves.devdojo.Polimorfismo.dominio.Computador;
import ffelipe.alves.devdojo.Polimorfismo.dominio.Produto;
import ffelipe.alves.devdojo.Polimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    /*
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatorio de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador: "+ computador.getNome());
        System.out.println("Valor: "+ computador.getValor());
        System.out.println("Imposto a ser pago "+ imposto);
    }
    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatorio de imposto do tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Computador: "+ tomate.getNome());
        System.out.println("Valor: "+ tomate.getValor());
        System.out.println("Imposto a ser pago "+ imposto);
    }*/

    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio Imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto :"+produto.getNome());
        System.out.println("Valor :"+produto.getValor());
        System.out.println("Imposto a ser pago :"+ imposto);
        if ( produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }

    }

}
