package Collection;

public class genric <pik,gok>{
    pik sam;
    gok sap;

    public genric(pik sam,gok sap) {
        this.sam = sam;
        this.sap=sap;
    }

    public gok getSap() {
        return sap;
    }

    public void setSap(gok sap) {
        this.sap = sap;
    }

    public pik getSam() {
        return sam;
    }

    public void setSam(pik sam) {
        this.sam = sam;
    }

    @Override
    public String toString() {
        return "genric{" +
                "sam=" + sam +
                ", sap=" + sap +
                '}';
    }

    public static void main(String[] args) {
        genric<Integer,Double> aaa=new genric<Integer,Double>(100,100000.1452458);
        System.out.println( aaa.getSam());
        System.out.println(aaa.getSap());

        genric<String,Float> aa=new genric<String,Float>("Kalu",25425.545f);
        System.out.println(aa);
    }

}
