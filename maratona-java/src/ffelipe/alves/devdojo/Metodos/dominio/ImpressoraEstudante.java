package ffelipe.alves.devdojo.Metodos.dominio;

public class ImpressoraEstudante {
    //podemos passar variaveis de referencia por um metodo
    //aqui criamos uma classe que tem um metodo de imprimir os atributos
    //dos objetos da classe estudante
    //dessa forma sempre que quisermos imprimir os atributos de qualquer objeto estudantes
    //podemos chamar o metodo dessa classe para imprimir os atributos do objeto
    public void imprime(Estudante estudante){
        //diferente da passagem de parametro com variaveis primitivas
        //aqui eu consigo fazer alteraçoes nos atributos do meu objeto
        //portanto cuidado!
        //estudante.nome="MR.ROBOTO";
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
