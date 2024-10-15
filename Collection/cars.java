package Collection;

public class cars {
    String name;
    int average;
    int Miles;
    double price;

    public cars(String name, int average, int miles, double price) {
        this.name = name;
        this.average = average;
        Miles = miles;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public int getMiles() {
        return Miles;
    }

    public void setMiles(int miles) {
        Miles = miles;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "cars{" +
                "name='" + name + '\'' +
                ", average=" + average +
                ", Miles=" + Miles +
                ", price=" + price +
                '}';
    }
}
