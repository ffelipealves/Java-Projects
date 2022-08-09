package ffelipe.alves.devdojo.Sobrescrita.dominio;

public class Anime {

    private String nome;

    public Anime(String nome) {
        this.nome = nome;
    }

    //sobrescrevemos o metodo toString da classe Object
    //Object eh a superclasses de todas classes
    /*@Override
    public String toString(){
        return "Anime: "+this.nome;
    }*/
    //outra forma da propria ide
    @Override
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
