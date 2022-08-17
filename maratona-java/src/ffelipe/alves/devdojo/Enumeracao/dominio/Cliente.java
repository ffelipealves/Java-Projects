package ffelipe.alves.devdojo.Enumeracao.dominio;

public class Cliente {
    private String nome;
    private TipoCliente tipoCliente;

    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoClienteINT=" + tipoCliente.VALOR +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
//private String tipo;
//public static final String PESSOA_FISICA = "PESSOA_FISICA";
//public static final String PESSOA_JURIDICA = "PESSOA_JURIDICA";

    /*Maneira feia de forçar a passagem de parametro sem ENUM
    public Cliente(String nome, String tipo) {
        if(!tipo.equals(PESSOA_FISICA)&&!tipo.equals(PESSOA_JURIDICA)){
            return;
        }
        this.nome = nome;
        this.tipo = tipo;
    }*/