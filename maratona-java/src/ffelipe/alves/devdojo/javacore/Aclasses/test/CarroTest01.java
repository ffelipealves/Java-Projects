package ffelipe.alves.devdojo.javacore.Aclasses.test;

import ffelipe.alves.devdojo.javacore.Aclasses.dominio.Carro;

public class CarroTest01 {

    public static void main(String[] args) {
        Carro carroPopular = new Carro();
        Carro carroPopular2 = new Carro();

        carroPopular.nome="Chevrolet";
        carroPopular.modelo="Onix";
        carroPopular.ano=2018;

        carroPopular2.nome="Fiat";
        carroPopular2.modelo="Argo";
        carroPopular2.ano=2020;

        System.out.println(carroPopular.nome);
        System.out.println(carroPopular.modelo);
        System.out.println(carroPopular.ano);
        System.out.println("-----------");
        System.out.println(carroPopular2.nome);
        System.out.println(carroPopular2.modelo);
        System.out.println(carroPopular2.ano);

        //Mudando a referencia da variavel
        carroPopular = carroPopular2;

        System.out.println(carroPopular.nome);
        System.out.println(carroPopular.modelo);
        System.out.println(carroPopular.ano);
    }




}
