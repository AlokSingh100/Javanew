package newpack;

public class cap extends nap {
    int d,s;

    cap(int d,int s,int a,int b){
        super.a=a;
        super.b=b;
        this.d=d;
        this.s=s;
    }
    void pap(){
        System.out.println(d);
        System.out.println(s);
    }

    public static void main(String[] args) {
        cap aa=new cap(10,14,12,65);
        aa.pap();
        aa.a();
    }
}
