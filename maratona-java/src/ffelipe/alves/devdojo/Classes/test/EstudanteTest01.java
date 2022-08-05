package ffelipe.alves.devdojo.Classes.test;

import ffelipe.alves.devdojo.Classes.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        //tipo    var referencia    novo objeto
        Estudante estudante01 = new Estudante();
        //estudante01 referencia um espaço de memoria qu vai estar armazenado um objeto estudante
        //esse tendo dentro dele outros espaços para seus atributos

        //conseguimos acessar os atributos com a variavel de referencia + o nome do atributo
        estudante01.idade=12;
        estudante01.nome="Felipe";
        estudante01.sexo='m';
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);
        System.out.println(estudante01.nome);
    }
}
