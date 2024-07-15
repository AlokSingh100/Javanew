package loop_nested;

public class loop {
    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {

            for (int j = 0; j <= 3; j++) {
                int a=0;
                  a++;
                if (j%2==0 ){


                    System.out.print(" ");
                }
                else {
                    System.out.println(j);

                }
            }
            System.out.println( );
        }
    }
}
