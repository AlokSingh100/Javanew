package hastree;

import java.util.*;

class same{

    int rollno;
    String name;
    int fees;


    public same(int rollno, String name, int fees) {
        this.rollno = rollno;
        this.name = name;
        this.fees = fees;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "same{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", fees=" + fees +
                '}';
    }
}
public class treeset {
    public static void main(String[] args) {
        HashMap<Integer,same> sop=new HashMap<Integer,same>();
        sop.put(10,new same(1,"alok",100));
    }
}
