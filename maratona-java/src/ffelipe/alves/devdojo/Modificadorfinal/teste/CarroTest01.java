package ffelipe.alves.devdojo.Modificadorfinal.teste;

import ffelipe.alves.devdojo.Modificadorfinal.dominio.Carro;
import ffelipe.alves.devdojo.Modificadorfinal.dominio.Comprador;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(carro.VELOCIDADE_LIMITE);
        carro.COMPRADOR.setNome("Bobs");
        System.out.println(carro.COMPRADOR);

    }
}
