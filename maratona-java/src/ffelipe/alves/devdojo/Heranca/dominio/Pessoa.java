package ffelipe.alves.devdojo.Heranca.dominio;

public class Pessoa {
    //utilizando o modificador de acesso protected
    //todas subclasses de Pessoa terao acesso aos seus atributos como se fossem publicos
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco de inicializacao estatico de pessoa");
    }
    {
        System.out.println("Dentro do bloco inicializacao de pessoa 1");
    }
    {
        System.out.println("Dentro do bloco inicializacao de pessoa 2");
    }

    //para criamos um construtor de uma classe que tenha herança
    //precisamos utilizar o super na nossa subclasse
    public Pessoa(String nome){
        this.nome=nome;
        System.out.println("Dentro do construtor Pessoa");

    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getCep()+" "+this.endereco.getRua());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
