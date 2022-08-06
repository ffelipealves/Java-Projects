package ffelipe.alves.devdojo.Modificadoresestatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    //Podemos usar o modificar static para fazer com que o valor do atributo fique intrinsico a nossa classe
    //atributos staticos sao inicializados junto com a classe
    // eh bom usar metodos staticos quando ele nao acessam nenhum atributo dos objetos instanciados
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Maxima: " + this.velocidadeMaxima);
        //como a velocidade limite agr faz parte da classe carro nao faz sentido utilizarmos this(que faz referencia aos objetos instanciados)
        //agr devemos passar como referencia a propria classe em que esse atributo eh padrao
        System.out.println("Velocidade Limite: " + Carro.velocidadeLimite);
    }
    //nao podemos usar o this em um metodo statico ja que podemos chamar esse metodo sem ter um objeto
    //para o this referenciar entao utilizamos a referencia da propria classe
    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite=velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }


}
