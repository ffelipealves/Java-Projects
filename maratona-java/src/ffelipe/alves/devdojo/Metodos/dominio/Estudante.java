package ffelipe.alves.devdojo.Metodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    //aqui usaremos um metodo dentro da classe estudante para imprimir os atributos
    //dos nossos objetos estudantes, com isso nao precisamos criar outro classe so para
    //imprimir os atributos dos nossos objetos
    public void imprime(){
        //como estamos dentro da classe nao precisamos passar como parametro a variavel de referencia
        //pois aqui dentro ja temos acesso aos atributos da nossa classe
        //this vai usar o valor do atributo(interno da classe) naquele momento
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
        //Dessa forma usando o this, conseguimos chamar nosso objeto com e utilizar o metodo imprime para
        //imprimir seus proprios atributos
        //o this faz referencia ao contexto em que ele eh chamado, por exemplo
        //ao fazer estudando03.imprime(), o this ira pegar atributo nome do objeto estudante03
    }
}
