package ffelipe.alves.devdojo.Enumeracao.teste;

import ffelipe.alves.devdojo.Enumeracao.dominio.Cliente;
import ffelipe.alves.devdojo.Enumeracao.dominio.Cliente2;
import ffelipe.alves.devdojo.Enumeracao.dominio.TipoCliente;

public class ClienteTeste01 {
    public static void main(String[] args) {
        //com uma classe enum conseguimos forçar a passagem de parametro para nossa criação de objetos
        Cliente cliente1 = new Cliente("Paulo", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Menendez",TipoCliente.PESSOA_JURIDICA);
        Cliente2 cliente3 = new Cliente2("Antrax", Cliente2.TipoPagamento.CREDITO,TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);


    }
}
