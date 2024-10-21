package File_handle;

import java.io.File;
import java.io.FilenameFilter;

public class fontom {
    public static void main(String[] args) {
        File file=new File("src/File_handle");
        if (file.exists()) System.out.println("Its here");
        else System.out.println("no file");
        String filess[]=file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (toString().toLowerCase().endsWith(".java"))
                    return true ;
                else return false;
            }
        });


        for (String fxa:filess){
            System.out.println(fxa);
        }
    }
}
