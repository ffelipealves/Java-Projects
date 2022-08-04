package ffelipe.alves.devdojo.Metodos.dominio;

public class Pessoa {
    private String nome;
    //quando criamos um atributo private so quem podera ter acesso a ela
    //sera a sua propria classe, ninguem de fora da classe tem acesso a esse atributo privado
    private int idade;
    //com isso podemos criar um metodo publico para usar esses atributos privados

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
    //usamos o metodo set para atribuir valores aos nosso atributos privados
    public void setNome(String nome /**/){
        //usamos o this para atribuir valor ao nosso atributo privado
        //e esse valor vem da variavel nome que eh recebida no parametro do chamado
        // do metodo
        this.nome = nome;
    }
    public void setIdade(int idade){
        //utilizando o set podemos proteger nossos atributos de valores indesejaveis
        if(idade<0){
            System.out.println("Idade invaldia");
            return;
        }else {
            this.idade=idade;
        }

    }
    //Agora precisamos uma forma de pegar esses valores dos atributos privados
    //por isso utilizaremos o GET
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }

}
