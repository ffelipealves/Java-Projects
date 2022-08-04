package ffelipe.alves.devdojo.Metodos.test;

import ffelipe.alves.devdojo.Metodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome="Chicao";
        funcionario.idade=46;
        funcionario.salario[0]=1500;
        funcionario.salario[1]=1800;
        funcionario.salario[2]=1450;

        funcionario.imprimeDados();

        System.out.println("Media Salarial: "+funcionario.mediaSalarial());
    }
}
