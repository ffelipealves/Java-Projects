package ffelipe.alves.devdojo.Metodos.test;

import ffelipe.alves.devdojo.Metodos.dominio.Estudante;
import ffelipe.alves.devdojo.Metodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        Estudante estudante03 = new Estudante();
        //criamos uma nova impressora para imprimir os atributos do nossos objetos estudate
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();
        //vamos criar um novo estudante e imprimir seus atributos com o metodo imprime
        Estudante estudante04 = new Estudante();

        estudante01.nome = "Joao";
        estudante01.idade = 15;
        estudante01.sexo = 'm';

        estudante02.nome = "Maria";
        estudante02.idade = 17;
        estudante02.sexo = 'f';

        estudante03.nome = "Pedro";
        estudante03.idade = 14;
        estudante03.sexo = 'm';

        //jeito antigo
        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);
        System.out.println("-------------");
        //jeito passando parametros para uma outra classe
        impressoraEstudante.imprime(estudante02);
        System.out.println("-------------");
        impressoraEstudante.imprime(estudante03);
        //jeito usando o metodo dentro da propria classe
        System.out.println("--------------------");
        estudante03.nome = "Lara";
        estudante03.idade = 10;
        estudante03.sexo = 'f';
        //com isso usamos um metodo da propria classe estudante
        estudante03.imprime();

    }
}
