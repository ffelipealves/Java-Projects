package ffelipe.alves.devdojo.Metodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario = new double[3];

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
            double media =0;
            for (double index:salario){
                media+=index;
            }
            media=media/salario.length;

            return media;
        }
        return 0;
    }

}
