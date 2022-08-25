package ffelipe.alves.devdojo.Classesabstratas.dominio;

public class Dev extends Funcionario{
    public Dev(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        this.salario = salario + salario*0.2;
    }

    @Override
    public String toString() {
        return "Dev{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
