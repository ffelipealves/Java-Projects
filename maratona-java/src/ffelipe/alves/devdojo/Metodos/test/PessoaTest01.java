package ffelipe.alves.devdojo.Metodos.test;

import ffelipe.alves.devdojo.Metodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        //usaremos o set para setar valores para nossos atributos privados
        pessoa.setNome("Felipe");
        pessoa.setIdade(20);
        //pessoa.setIdade(-23); ira gerar um erro
        pessoa.imprime();
        //agr para usarmos nosso atributo vamos precisar de um metodo GET
        //podemos agr utilizar o atributo nome no nosso codigo
        System.out.println("Seu nome eh "+pessoa.getNome());
        System.out.println("Some sua idade em 7, depois diminua sua idade em 7\nEssa eh sua idade: "+pessoa.getIdade());
    }
}
