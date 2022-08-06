package ffelipe.alves.devdojo.Associacao.exercicio;

public class Local {
    //Atributos
    private String endereco;
    private Seminario seminario;

    //Construtor
    public Local(String endereco) {
        this.endereco = endereco;
    }
    //METODOS
    public void imprime(){
        if (seminario==null){
            System.out.println("Local sem seminarios");
            return;
        }else {
            System.out.println("No "+this.endereco+" ocorrera o seminario: "+seminario.getTitulo());
        }
        System.out.println("------------------");

    }

    //getters e setters
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
