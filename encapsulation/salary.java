package encapsulation;

public class salary {
        String name[];
        double salary[];
        String designation[];
        double increment[];

        salary(String[] Name, double[] Salary, String[] Designation,double[] Increment) {
                name = Name;
                salary = Salary;
                designation = Designation;
                increment = Increment;
        }








        void get_all_data(){
int size = name.length;
 double incrementamount[]=new double[size];

                 for (int i = 0; i < size ; i++) {
                     incrementamount[i]=(salary[i] * increment[i]) / 100;
                }

                System.out.println("Sn.no. | Name | Salary | Designation | increment | increment Salary");
                for (int i = 0; i < size; i++) {
                        System.out.println(i+1+" | "+name[i]+" | "+salary[i]+" | "+designation[i]+"|"+incrementamount[i]);
                }

        }

}

