package ffelipe.alves.devdojo.Inteface.dominio;

//Eh um contrato de implementacao
public interface DataLoader {
    //todos metodos das interface sao abstract e public
    int MAX_DATA_SIZE = 10;
    void load();
    default void checkPermission(){
        System.out.println("Fazendo a checagem de permissoes");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize");
    }
}
