package ffelipe.alves.devdojo.Polimorfismo.dominio;

public class Computador extends Produto{
    public static final double IMPOSTO_PC = 0.22;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Computador");
        return this.valor*IMPOSTO_PC;
    }
}
