package ffelipe.alves.devdojo.Associacao.test;

import java.util.Scanner;

public class LeituraTecladoTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String dado = entrada.nextLine();
        System.out.println(dado);
        System.out.println("Agora digite seu nome");
        String nome = entrada.nextLine();
        System.out.println("seu nome eh "+nome);
    }
}
