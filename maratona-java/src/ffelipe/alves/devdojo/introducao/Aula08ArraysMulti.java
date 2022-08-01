package ffelipe.alves.devdojo.introducao;

public class Aula08ArraysMulti {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];
        dias[0][0] = 23;
        dias[0][1] = 43;
        dias[0][2] = 20;
        dias[1][0] = 3;
        dias[1][1] = 87;
        dias[1][2] = 12;
        //...basicamente matrizes

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                //System.out.println("dias["+i+"]: "+dias[i].length);
                System.out.println(dias[i][j]);
            }
        }
        //usando o foreach
        for (int[] x : dias) {
            for (int y : x) {
                System.out.println(y);
            }
        }

        //outra maneira de inicializar matriz
        int[][] arrayInt = new int[3][];

        arrayInt[0]=new int[]{1,2};
        arrayInt[1]=new int[]{3,4,5,6};
        arrayInt[2]=new int[]{7,8,9,10,11,12};

        for(int[] arrayBase: arrayInt){
            System.out.println("\n------");
            for (int num:arrayBase){
                System.out.print(num+"  ");
            }
        }

        int[][] arrayInt2 = {{3,2},{2,4,5,6},{8,4,1,2,9,2}};

    }
}
