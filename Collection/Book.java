package Collection;

public class Book {
int Id;
String Name;
int noPage;

    public Book(int id, String name, int noPage) {
        Id = id;
        Name = name;
        this.noPage = noPage;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getNoPage() {
        return noPage;
    }

    public void setNoPage(int noPage) {
        this.noPage = noPage;
    }
}
