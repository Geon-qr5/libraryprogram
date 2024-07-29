import java.util.ArrayList;

public class Book {

    private int number;
    private String title;
    private String author;
    private boolean rent;

    public Book (){
        
    }

    public Book (int number, String title, String author, boolean rent){
        this.number = number;
        this.title = title;
        this.author = author;
        rent = false;
    }

    ArrayList booklist = new ArrayList<Book>();
}
