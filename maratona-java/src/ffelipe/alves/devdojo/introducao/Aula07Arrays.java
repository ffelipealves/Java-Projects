package ffelipe.alves.devdojo.introducao;

public class Aula07Arrays {
    public static void main(String[] args) {
        //Arrays aqui sao objetos
        int[] idades = new int[3];
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 31;
        System.out.println(idades[2]);

        String[] nomes = new String[3];
        nomes[0] = "Felipe";
        nomes[1] = "Goku";
        nomes[2] = "Jotalhao";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        //usando o foreach
        int[] numeros = new int[]{1,2,3};

        for (int num : numeros) {
            System.out.println(num);
        }
    }
}
