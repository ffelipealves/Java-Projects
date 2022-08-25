package ffelipe.alves.devdojo.Polimorfismo.dominio;

public class Televisao extends Produto{
    public static final double IMPOSTO_TV= 0.18;
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da Televisao");
        return this.valor*IMPOSTO_TV;
    }

}
