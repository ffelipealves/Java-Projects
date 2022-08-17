package ffelipe.alves.devdojo.Enumeracao.dominio;

//aqui criamos um tipo que aceita dois valores
public enum TipoCliente {
    //tipo especial aonde todos atributos q vamos criar serao constantes
    PESSOA_FISICA(1,"Pessoa Fisica"),
    PESSOA_JURIDICA(2,"Pessoa Juridica");

    public final int VALOR;
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio){
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
        for (TipoCliente tipoCliente : values()) {
            if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return null;
    }

}
