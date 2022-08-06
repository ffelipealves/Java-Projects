package ffelipe.alves.devdojo.Associacao.exercicio;

public class Aluno {
    //ATRIBUTOS
    private String nome;
    private int idade;
    private Seminario seminario;

    //CONSTRUTOR
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //METODOS
    public void imprime(){
        System.out.print("O(A) Aluno(a) "+this.nome);
        if(seminario==null){
            System.out.println(" Nao esta em nenhuma seminario");
        }else {
            System.out.println(" Esta participando do seminario: "+seminario.getTitulo());
        }
        System.out.println("------------------");

    }

    //getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario){
        this.seminario=seminario;
    }
}
