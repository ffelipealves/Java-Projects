package ffelipe.alves.devdojo.Modificadoresestatico.test;

import ffelipe.alves.devdojo.Modificadoresestatico.dominio.Carro;

public class CarroTest01 {

    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW",200);
        Carro carro2 = new Carro("Mercedes",275);
        Carro carro3 = new Carro("Porsche",310);

        //Nosso atributo velocidadelimite nao pertenci mais a uma instancia da classe
        // e sim a todos objetos nela instanciados, veja q se mudarmos o atributo do carro1
        //sera alterado tambem para todos os outros objetos
        //carro1.setVelocidadeLimite(200);
        Carro.setVelocidadeLimite(280);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();

    }
}
