package Collection;

public class SORTED {
    public static void main(String[] args) {
        int sot[]={12,-43,32,-2,33,54,65};
        for (int i=0;i< sot.length;i++){
            for (int j = 0; j < sot.length-i-1; j++) {
                if (sot[j]>sot[j+1]){
                    int tem=sot[j];
                    sot[j]=sot[j+1];
                    sot[j+1]=tem;

                }

            }

        }
        for (int s=0;s<=sot.length;s++){
            System.out.println(sot[s] );
        }
    }
}
