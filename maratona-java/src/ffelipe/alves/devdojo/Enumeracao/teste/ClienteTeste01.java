package ffelipe.alves.devdojo.Enumeracao.teste;

import ffelipe.alves.devdojo.Enumeracao.dominio.Cliente;
import ffelipe.alves.devdojo.Enumeracao.dominio.TipoCliente;
import ffelipe.alves.devdojo.Enumeracao.dominio.TipoPagamento;

public class ClienteTeste01 {
    public static void main(String[] args) {
        //com uma classe enum conseguimos forçar a passagem de parametro para nossa criação de objetos
        Cliente cliente1 = new Cliente("Paulo", TipoCliente.PESSOA_JURIDICA,TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Menendez",TipoCliente.PESSOA_FISICA,TipoPagamento.DEBITO);
        Cliente cliente3 = new Cliente("Antrax",TipoCliente.PESSOA_JURIDICA,TipoPagamento.CREDITO);

        System.out.println(TipoPagamento.CREDITO.calcularDesconto(200));
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(200));

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);

        TipoCliente tipoCliente = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Juridica");
        System.out.println(tipoCliente);

    }
}
