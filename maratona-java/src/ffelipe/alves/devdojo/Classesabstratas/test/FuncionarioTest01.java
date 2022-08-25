package ffelipe.alves.devdojo.Classesabstratas.test;

import ffelipe.alves.devdojo.Classesabstratas.dominio.Dev;
import ffelipe.alves.devdojo.Classesabstratas.dominio.Funcionario;
import ffelipe.alves.devdojo.Classesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Luis",5500);
        System.out.println(gerente);

        Dev dev = new Dev("Felipe",3500);
        System.out.println(dev);
        gerente.imprime();
    }
}
