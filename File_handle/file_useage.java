package File_handle;



import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.exit;

public class file_useage  {
    public static void main(String[] args)throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Directory ");
        String dir,subdir="",sub="",read,rite=" ",spt=" ";
        dir=scanner.next();
        String nedir=dir+":\\";
        File file=new File(nedir);
        File file1[]=file.listFiles();
        for (File ob:file1){
            System.out.println(ob);
        }
        while (true) {

            System.out.println("Select any one Option ");
            System.out.println("1.Sub Subdirectory");
            System.out.println("2.File ");
            System.out.println("3.Exit");
            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Enter the Sub-Directory Name");

                    while (true) {
                        subdir = scanner.next();
                        sub = sub + "\\" + subdir;
                        break;
                    }

                    File file2 = new File(nedir, sub);
                    System.out.println(file2.getAbsolutePath());
                    File file3[] = file2.listFiles();
                    for (File ob : file3) {
                        if (ob.isDirectory())
                            System.out.println("dir:-" + ob);

                        else System.out.println("\t\t\t\t\t File:-" + ob);
                    }
                    break;
                case 2:
                    System.out.println("Select any one option ");
                    System.out.println("1.File Open");
                    System.out.println("2. File Change");
                    int b = scanner.nextInt();
                    System.out.println("Enter The File Name");
                    read = scanner.next();
                    switch (b) {
                        case 1:

                            try {
                                Reader reader = new FileReader(nedir + "" + sub + "\\" + read);
                                int rread = reader.read();
                                while (rread >= 0) {
                                    System.out.print((char) rread);
                                    rread = reader.read();
                                }

                            } catch (Exception e) {
                                System.out.println(e);
                            }
                            System.out.println();
                            break;
                        case 2:
                            System.out.println("Write Below It  ");
                            System.out.println("Presss Exit ");


                            Writer writer = new FileWriter(nedir + "" + sub + "\\" + read);
                            while (true) {
                                rite = scanner.next();
                                if (rite.equals("exit")){
                                    break;
                                }
                                spt = spt + rite + "\n";

                            }
                            writer.write(spt.getBytes());
                            writer.close();

                    }
                    System.out.println();
                    break;



            case 3:
                exit(0);

        }
            }
        }
    }
