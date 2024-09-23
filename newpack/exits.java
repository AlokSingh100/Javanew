package nevac;

import java.io.File;

public class exits {
    public static void main(String[] args) {
        File file=new File("src/nevac/sat.txt");
        if(file.exists()){
            System.out.println("This file exit");
            System.out.println(file.getPath());
            System.out.println(file.getAbsoluteFile());

        }
        else System.out.println("Not exit");

    }
}
