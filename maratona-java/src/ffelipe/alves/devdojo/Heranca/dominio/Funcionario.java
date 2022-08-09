package ffelipe.alves.devdojo.Heranca.dominio;

//quando falamos de herança, dizemos que uma classe eh uma extensao da outra
//quando essa classe tem atributos da classe que vai ser herdada contudo tem atributos a mais
public class Funcionario extends Pessoa {
    //quando dizemos que UmaClasse extends OutraClasse significa dizer que UmaClasse vai ter
    //todos atributos e metodos de OutraClasse
    private double salario;

    //para criamos um construtor de uma subclase precisamos utilizar o super
    //para chamar o construtor base da Classe mae
    static {
        System.out.println("Dentro do bloco de inicializacao estatico de funcionario");
    }
    {
        System.out.println("Dentro do bloco inicializacao de funcionario 1");
    }
    {
        System.out.println("Dentro do bloco inicializacao de funcionario 2");
    }
    public Funcionario(String nome,double salario){
        super(nome);
        this.salario=salario;
        System.out.println("Dentro do ocnstrutor FUncionario");
    }



    //podemos sobescrever metodos da classe mae utilizando super e o mesmo nome de metodo
    public void imprime(){
        //podemos executar todos comandos do imprime() da classe mae e depois executar
        //as instruçoes desse metodo sobescrito
        super.imprime();
        System.out.println(this.salario);

    }

    public void relatoriaPagamento(){
        System.out.println("Eu "+this.nome+" recebi o salario de: R$"+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
