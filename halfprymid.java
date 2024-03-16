package nestedloop;

public class halfprymid {
    public static void main(String[] args) {
        int t = 10;
        for (int i = 1; i <= t; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
