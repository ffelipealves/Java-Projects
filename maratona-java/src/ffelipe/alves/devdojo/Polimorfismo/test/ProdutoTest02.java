package ffelipe.alves.devdojo.Polimorfismo.test;

import ffelipe.alves.devdojo.Polimorfismo.dominio.Computador;
import ffelipe.alves.devdojo.Polimorfismo.dominio.Produto;
import ffelipe.alves.devdojo.Polimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Nitro 5", 5000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

        Produto produto2 = new Tomate("Tomate Japones", 15);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
