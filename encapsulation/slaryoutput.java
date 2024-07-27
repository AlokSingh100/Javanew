package encapsulation;

public class slaryoutput {

    public static void main(String[] args) {

       String name1[] = {"joy","nishant","alok","omji"};
       double salary1[] = {45000,78000,90000,125000};
       String designation1[] = {"ios","HR","Tech","CA"};
       double incremrnt1[]={5,3,50,2};


        salary emp1 = new salary(name1,salary1,designation1,incremrnt1);
        emp1.get_all_data();
    }
}

