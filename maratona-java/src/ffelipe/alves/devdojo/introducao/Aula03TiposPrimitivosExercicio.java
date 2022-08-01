package ffelipe.alves.devdojo.introducao;

/*
*  Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
*
* Eu <nome>, morando no <endereço> confirmo que recebi o salario:<salario>, na data <data>
* */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Felipe";
        String endereco = "Rua Jose Alves 78";
        double salario = 2500;
        String data = "13/03/2022";
        String relatorio = "Eu "+nome+" ,morando na "+endereco+" confirmo que recebi o salario: "+salario+" , na data"+data;
        System.out.println(relatorio);
    }

}
