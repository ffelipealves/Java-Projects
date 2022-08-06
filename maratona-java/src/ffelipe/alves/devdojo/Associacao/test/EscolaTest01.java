package ffelipe.alves.devdojo.Associacao.test;

import ffelipe.alves.devdojo.Associacao.dominio.Escola;
import ffelipe.alves.devdojo.Associacao.dominio.Professor;

public class EscolaTest01{
    public static void main(String[] args) {
        Professor professor1 = new Professor("Roberto");
        Professor professor2 = new Professor("Marconi");
        Professor[] professores = {professor1,professor2};
        Escola escola = new Escola("Paulo VI",professores);

        escola.imprime();
    }
}
