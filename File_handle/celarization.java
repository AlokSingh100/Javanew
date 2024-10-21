package File_handle;

import java.io.*;

class stud implements Serializable {
    int id;
    String stund;

    public stud(int id, String stund) {
        this.id = id;
        this.stund = stund;
    }
    stud(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStund() {
        return stund;
    }

    public void setStund(String stund) {
        this.stund = stund;
    }
}

public class celarization {
    public static  void main(String[] args) throws IOException,ClassNotFoundException {
        stud ob=new stud();
        ob.id=1;
        ob.stund="sdf";
        stud dfcds;
        try {
            FileOutputStream folrout=new FileOutputStream("src/File_handle/myfile.txt");
            ObjectOutputStream outputStream=new ObjectOutputStream(folrout);
            outputStream.writeObject(ob);
            outputStream.close();
            folrout.close();
            System.out.println("Object Serialized");

FileInputStream fileInputStream=new FileInputStream("C:\\Users\\PC-5.DESKTOP-6CJ2MA9\\Desktop\\alokjavaa\\untitled\\src\\File_handle\\myfile.txt");
            ObjectInputStream in=new ObjectInputStream(fileInputStream);
            dfcds=(stud) in.readObject();

            System.out.println(dfcds.getStund());
            in.close();
            fileInputStream.close();


        }catch (Exception e){
            System.out.println(e);
        }
    }
}
