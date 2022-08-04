package ffelipe.alves.devdojo.Metodos.dominio;

public class Calculadora {
    //metodos sao basicamentes funçoes da nossa classe
    //podemos chama-las no código para executar alguma ação
    //nessa caso temos metodos sem retorno void
    public void soma(int x, int y){
        System.out.println(x+y);
    };
    //podemos passar parametros para esses metodos tbm
    public void subtrai(int x, int y){
        System.out.println(x-y);
    }

    public void multiplica(int x,int y){
        System.out.println(x*y);
    }
    //utilizando um metodo com retorno
    public double divide(double x, double y){
        if(y==0){
            System.out.println("Nao existe divisao por 0");
            return 0;
        }
        return x/y;

    }
    public void alteraDoisNumeros(int num1,int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do metodo");
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
    }

    public void somaArray(int[] numeros){
        int soma=0;
        for (int aux: numeros) {
            soma+=aux;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int ... numeros){
        int soma=0;
        for (int aux: numeros) {
            soma+=aux;
        }
        System.out.println(soma);
    }

}
