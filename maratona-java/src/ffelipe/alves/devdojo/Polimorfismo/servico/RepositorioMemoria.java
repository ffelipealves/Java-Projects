package ffelipe.alves.devdojo.Polimorfismo.servico;

import ffelipe.alves.devdojo.Polimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memoria");
    }
}
