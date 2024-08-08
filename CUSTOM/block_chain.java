package CUSTOM;

public class block_chain {
    int[] sku;
    int[] quantity;
    int[] price;
    String[] pname;
    block_chain(int[] sku,String[] pname,int[] quantity,int[] price){
        this.sku=sku;
        this.quantity=quantity;
        this.price=price;
        this.pname=pname;
    }
    void print(){
        int dbs= sku.length;
        for (int i = 0; i < dbs; i++) {
            System.out.println("Your SKU is ="+sku[i]);
            System.out.println("Your Product name is "+pname[i]);
            System.out.println("Your Quantity is" + quantity[i]);
            System.out.println("Price of Single Product is "+ price[i]);
            System.out.println();
        }
    }



}
