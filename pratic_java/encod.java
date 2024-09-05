package encoding;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Scanner;

public class encod {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name");
        String Name=scanner.nextLine();
        String code= Base64.getEncoder().encodeToString(Name.getBytes(StandardCharsets.UTF_8));
        System.out.println("Origenal "+ Name);
        System.out.println("Coded "+ code);
        byte[] decode=Base64.getDecoder().decode(code.getBytes());
        String node=new String(decode);
        System.out.println(decode);

    }
}
