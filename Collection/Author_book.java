package Collection;

import java.util.ArrayList;
import java.util.List;

public class Author_book {
    public static void main(String[] args) {
        List<Author> op= new ArrayList<Author>();
        op.add(new Author(1,"Alok","Mumbai",new Book(12,"Long lost",140)));
        op.add(new Author(2,"Nishant","Mumbai",new Book(14,"Art of War",500)));
        op.add(new Author(3,"nomp","Laknow",new Book(145,"System",478)));
        System.out.println(op);

    }


}
