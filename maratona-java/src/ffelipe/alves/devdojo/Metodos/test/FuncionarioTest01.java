package ffelipe.alves.devdojo.Metodos.test;

import ffelipe.alves.devdojo.Metodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Chicao");
        funcionario.setIdade(46);
        funcionario.setSalario(new double[]{1200,1500,1850});

        funcionario.imprimeDados();

        System.out.println("Media Salarial: "+funcionario.mediaSalarial());
    }
}
