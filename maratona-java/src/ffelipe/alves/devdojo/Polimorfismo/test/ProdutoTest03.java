package ffelipe.alves.devdojo.Polimorfismo.test;

import ffelipe.alves.devdojo.Polimorfismo.dominio.Computador;
import ffelipe.alves.devdojo.Polimorfismo.dominio.Produto;
import ffelipe.alves.devdojo.Polimorfismo.dominio.Tomate;
import ffelipe.alves.devdojo.Polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ideapad Gaming", 4000);

        Tomate tomate = new Tomate("Tomate Seco", 5);
        tomate.setDataValidade("13/09/2023");

        CalculadoraImposto.calcularImposto(tomate);
    }
}
