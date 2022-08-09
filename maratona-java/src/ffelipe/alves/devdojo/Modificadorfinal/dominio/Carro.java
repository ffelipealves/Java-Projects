package ffelipe.alves.devdojo.Modificadorfinal.dominio;
//quando colocamos final em uma classe ela nao pode ter mais hereança
public final class Carro {
    private String nome;
    //final sao basicamente constantes
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    //quando colocamos um final num metodo ele metodo nao podera ser sobrecrito
    //por sua classes filhas
    public final void imprime(){
        System.out.println("OUOU");
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", COMPRADOR=" + COMPRADOR +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
