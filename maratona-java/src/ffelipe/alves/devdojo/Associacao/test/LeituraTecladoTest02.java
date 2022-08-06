package ffelipe.alves.devdojo.Associacao.test;

import java.util.Scanner;

public class LeituraTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Respondedor de perguntas");
        System.out.println("Digite sua pergunta e responderei sim ou nao");
        String pergunta = input.nextLine();
        if(pergunta.charAt(0)==' '){
            System.out.println("SIM");
        }else {
            System.out.println("NAO");
        }

    }
}
