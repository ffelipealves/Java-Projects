package ffelipe.alves.devdojo.Heranca.test;

import ffelipe.alves.devdojo.Heranca.dominio.Endereco;
import ffelipe.alves.devdojo.Heranca.dominio.Funcionario;
import ffelipe.alves.devdojo.Heranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("5049-382");
        endereco.setRua("Rua Luis Sandro");

        Pessoa pessoa = new Pessoa("Mateus do gas");
        pessoa.setNome("Caboclo");
        pessoa.setCpf("82273649182");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        System.out.println("---------------");
        Funcionario funcionario = new Funcionario("Fulanilson",3999);
        //funcionario.setNome("Joaoclides");
        funcionario.setCpf("29938472632");
        funcionario.setEndereco(endereco);
        //funcionario.setSalario(2300);
        funcionario.imprime();

    }
}
