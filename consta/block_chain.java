package consta;


import java.util.Scanner;

public class block_chain {
    int[] sku;
    int[] quantity;
    int[] price;
    String[] pname;
    int aa;
    block_chain(int[] sku,String[] pname,int[] quantity,int[] price,int aa){
        this.sku=sku;
        this.quantity=quantity;
        this.price=price;
        this.pname=pname;
        this.aa=aa;
    }
    void print(){
        int dbs= sku.length;
        for (int i = 0; i < aa; i++) {
            System.out.println();
            System.out.println("Your SKU is ="+sku[i]);
            System.out.println("Your Product name is "+pname[i]);
            System.out.println("Your Quantity is" + quantity[i]);
            System.out.println("Price of Single Product is "+ price[i]);
            System.out.println();
        }
    }
    void search(){
        int a=0,b=0;
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter Product Item Form SKU No ");
        a=scanner.nextInt();
        for (int i = 0; i < sku.length; i++) {
            if (sku[i]==a){
                b=i;
                break;
            }
        }
            System.out.println("Your Product name is "+pname[b]);
            System.out.println("Your Quantity is" + quantity[b]);
            System.out.println("Price of Single Product is "+ price[b]);

    }



}