package ffelipe.alves.devdojo.Sobrecargametodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    public Anime(){

    }

    //ao inves de criamos 3 setters para nossos atributos podemos criar um metodo
    // que vai inicializar todos os valores dos atributos pra gente
    public void init(String nome, String tipo,int episodios){
        this.nome=nome;
        this.tipo=tipo;
        this.episodios=episodios;
    }
    //aqui temos o que o java chama de sobrecarga de metodos
    //temos dois metodos com o msm nome porem eles tem quantidade ou tipo de parametros diferentes
    public void init(String nome, String tipo,int episodios,String genero){
        //podemos economizar codigo chamando o nosso outro init
        /*
        this.nome=nome;
        this.tipo=tipo;
        this.episodios=episodios;*/
        init(nome,tipo,episodios);
        this.genero=genero;
    }


    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }



    public void setNome(String nome){
        this.nome=nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
