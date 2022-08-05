package ffelipe.alves.devdojo.Metodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario = new double[3];
    private double media=0;

    public void imprimeDados(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salario != null){
            for (double index : this.salario){
                System.out.println("salarios :"+index);
            }
        }else {
            System.out.println("ERRO: SALARIO NULO");
        }

    }

    public double mediaSalarial(){
        if (salario != null){
            for (double index:salario){
                media+=index;
            }
            media=media/salario.length;

            return media;
        }
        return 0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public double getMedia() {
        return media;
    }
}
