package ffelipe.alves.devdojo.introducao;

public class Aula05Condicionais {
    public static void main(String[] args) {
        //SE
        if (5 < 86) {
            System.out.println("5 eh menor que 86");
        } else {
            System.out.println("ta errado");
        }
        //enquanto
        int contador = 0;
        while (contador < 5) {
            System.out.println("Contando no while: " + contador);
            contador++;
        }
        //do while
        do {
            contador+=80;
            System.out.println(contador);
        }while (contador<500);
        //switch
        char sexo = 'm';
        switch (sexo) {
            case 'm':
                System.out.printf("Vc eh homem");
                break;
            case 'f':
                System.out.println("Vc eh mulher");
                break;
        }
        //for
        for (int i=0;i<=100;i+=2){
            System.out.println("nosso contador eh "+i);
        }
        //continue e break
        int contTeste =0;
        while(true){
            ++contTeste;

            if(contTeste>50){
                break;
            }
            if(contTeste%2==0){
                System.out.println("par: "+contTeste);
                continue;
            }
            System.out.println("impar: "+contTeste);
        }
        System.out.println("paramos o while");
    }
}
