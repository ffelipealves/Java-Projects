package ffelipe.alves.devdojo.Inteface.dominio;

public class FileLoader implements DataLoader, DataRemover{
    //private -> default -> protected -> public
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de arquivo");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando arquivos");
    }
}
