package ffelipe.alves.devdojo.Classesabstratas.dominio;

//Quando criamos uma classe abstrata ela servira como template para outras
public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    @Override
    public void imprime() {
        System.out.println("Imprimindor");
    }

    //podemos forçar todas classes filhas fornecerem a implementacao de um metodo
    //deixando esse metodo como abstrato(da mesma forma sera um template para os metodos
    // das classes filhas)
    public abstract void calculaBonus();
}
