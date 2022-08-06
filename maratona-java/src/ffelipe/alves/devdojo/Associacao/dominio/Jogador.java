package ffelipe.alves.devdojo.Associacao.dominio;

public class Jogador {
    private String nome;
    //jogador so pode ter 1 time
    private Time time;

    public Jogador(String nome){
        this.nome=nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void imprime(){
        System.out.println(this.nome);
        if(time!=null){
            System.out.println(time.getNome());
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
