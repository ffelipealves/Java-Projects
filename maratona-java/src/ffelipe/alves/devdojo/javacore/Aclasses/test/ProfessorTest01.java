package ffelipe.alves.devdojo.javacore.Aclasses.test;

import ffelipe.alves.devdojo.javacore.Aclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor();

        professor1.idade = 30;
        professor1.nome= "Robertim";
        professor1.sexo= 'M';

        System.out.println("Professor: "+professor1.nome+" \nIdade: "+professor1.idade+" \nSexo: "+professor1.sexo);
    }
}
