package ffelipe.alves.devdojo.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int , double, float, char, byte, short, long, boolean
        int numAlunos = 20;
        //forçando a variavel caber casting
        int idadeteste = (int)20000000000L;
        long numeroGrande = 200000;
        double salarioFelipe = 2000;
        float salarioFloat = 2500;
        byte idadeByte = 127;
        short idadeShort = 10;
        boolean veradeiro = true;
        boolean falso = false;
        char sexo = 'm';

        System.out.println("O numero de alunos eh "+numAlunos+" da classe 1");
        System.out.println(salarioFelipe);
        System.out.println(salarioFloat);
        System.out.println(veradeiro);
        System.out.println(idadeByte);

        String palavra = "Felipe";

        System.out.println(palavra);

    }
}
