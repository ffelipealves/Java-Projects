package ffelipe.alves.devdojo.Inteface.test;

import ffelipe.alves.devdojo.Inteface.dominio.DataLoader;
import ffelipe.alves.devdojo.Inteface.dominio.DatabaseLoader;
import ffelipe.alves.devdojo.Inteface.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        databaseLoader.checkPermission();
        databaseLoader.remove();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
