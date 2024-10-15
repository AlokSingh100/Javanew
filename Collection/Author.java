package Collection;

public class Author {
int id;
String name;
String City;
Book bks;

    public Author(int id, String name, String city, Book bks) {
        this.id = id;
        this.name = name;
        City = city;
        this.bks = bks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public Book getBks() {
        return bks;
    }

    public void setBks(Book bks) {
        this.bks = bks;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", City='" + City + '\'' +
                ", bks=" + bks +
                '}';
    }
}
