package ffelipe.alves.devdojo.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //basicos
        int num1=10;
        double num2=20;
        double num3 = num1*num2;
        double num4 = (double)num1/num2;

        System.out.println(num2+num1);
        System.out.println(num3);
        System.out.println(num4);

        //resto
        int resto = 20%30;
        System.out.println(resto);

        //<> >= <= == !=
        boolean isFelipeDumb = 1>0;
        System.out.println(isFelipeDumb);
        boolean is3IgualA2 = 3==2;
        System.out.println(is3IgualA2);
        boolean is3Diferente3 = 3!=3;
        System.out.println(is3Diferente3);

        // && || !
        if (isFelipeDumb || is3Diferente3){
            System.out.println("Usei um operador logico");
        }

        //atribuition , += -= %= *= msm coisa so que com menos codigo
        int salario = 1000;
        salario+=1000;
        System.out.println(salario);

    }
}
