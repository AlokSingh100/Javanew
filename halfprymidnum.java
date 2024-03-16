package nestedloop;

public class halfprymidnum {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10 - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
