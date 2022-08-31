package ffelipe.alves.devdojo.Polimorfismo.test;

import ffelipe.alves.devdojo.Polimorfismo.repositorio.Repositorio;
import ffelipe.alves.devdojo.Polimorfismo.servico.RepositorioArquivos;
import ffelipe.alves.devdojo.Polimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivos();
        repositorio.salvar();
    }
}
