package ffelipe.alves.devdojo.Construtores.dominio;

public class Anime {

    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    //com o construtor conseguimos atribuir valores aos metodos na hora da criação do objeto
    //aqui temos o nosso construtor da classe anime
    //basicamente ele serve para definir algumas regras na criação de um objeto
    // por exemplo para criarmos um objeto anime precisamos obrigatoriamente de um nome
    public Anime(String nome, String tipo, int episodios, String genero){
        this();
        this.nome=nome;
        this.tipo=tipo;
        this.episodios=episodios;
        this.genero=genero;

    }

    //tambem podemos utilizar sobrecarga de construtores
    public Anime(){
        System.out.println("Dentro do ocnstrutor sem argumentos");
    }
    public Anime(String nome, String tipo, int episodios, String genero,String estudio){
        //usamos o this() dentro dos contrutores para chamar outros construtores
        //contudo precisamos passar quais parametros aquele construtor recebe para que o java
        //consiga ir para o construtor certo
        this(nome,tipo,episodios,genero);
        this.estudio=estudio;

    }
    //CONSTRUTORES NAO TEM TIPO
    // XXX public "void" Anime(){} XXX
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }

}
