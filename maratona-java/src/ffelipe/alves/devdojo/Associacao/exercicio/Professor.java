package ffelipe.alves.devdojo.Associacao.exercicio;

public class Professor {
    //Atributos
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    //Construtor
    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    //METODOS
    public void imprime(){
        if(seminarios==null){
            System.out.println("Prof sem seminarios");
            return;
        }else{
            System.out.println("O(A) professor(a) "+this.nome+" especialista em: "+this.especialidade+". Ministra os seguintes seminarios:");
            for (Seminario seminario:seminarios){
                System.out.println(seminario.getTitulo());
            }
        }
        System.out.println("------------------");

    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
