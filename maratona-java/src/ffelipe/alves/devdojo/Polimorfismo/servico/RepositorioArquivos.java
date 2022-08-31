package ffelipe.alves.devdojo.Polimorfismo.servico;

import ffelipe.alves.devdojo.Polimorfismo.repositorio.Repositorio;

public class RepositorioArquivos implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
