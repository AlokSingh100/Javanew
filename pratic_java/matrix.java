package nevac;

public class Nacit {



    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,2,5},{5,3,7}};
        int[][] array1 = {{5,6,7},{5,7,3},{9,5,2}};
        int[][] array4 = new int[array.length][array.length];



        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array1[i][j]+" ");
            }
            System.out.println();
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array4[i][j]=0;
                 for (int k = 0; k < array.length; k++) {


                     array4[i][j] += array[i][k] * array1[k][j];

                 }

            }
        }
            
        System.out.println();

        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array4[i][j]+" ");
            }
            System.out.println();
        }



    }
    }
