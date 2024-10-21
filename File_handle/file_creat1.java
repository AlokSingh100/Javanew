package File_handle;

import java.io.File;
import java.io.IOException;

public class file_creat1 {
    public static void main(String[] args) throws IOException {
        File fk=new File("notam.txt");
        if (fk.createNewFile()){
            System.out.println("new file");
        }
        else System.out.println("No file");
        System.out.println(fk.exists());
        System.out.println(fk.getAbsoluteFile());
        System.out.println(fk.getParent());
        System.out.println(fk.getName());
        System.out.println(fk.getPath());
        File sk=new File("C:\\Users\\PC-5.DESKTOP-6CJ2MA9\\Desktop\\alokjavaa");
        String filesa[]=fk.list();
        System.out.println("All user");

        for (String fs:filesa){
            System.out.println(fs);
        }
    }
}
