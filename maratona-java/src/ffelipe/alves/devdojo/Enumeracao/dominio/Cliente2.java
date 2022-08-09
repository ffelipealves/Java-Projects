package ffelipe.alves.devdojo.Enumeracao.dominio;

public class Cliente2 {

    public enum TipoPagamento{
        DEBITO,
        CREDITO,
    }

    private String nome;
    private TipoPagamento tipoPagamento;
    private TipoCliente tipoCliente;

    public Cliente2(String nome, TipoPagamento tipoPagamento, TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoPagamento = tipoPagamento;
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente2{" +
                "nome='" + nome + '\'' +
                ", tipoPagamento=" + tipoPagamento +
                ", tipoCliente=" + tipoCliente +
                '}';
    }
}
