
public class Book {

    private int number;
    private String title;
    private String author;
    private boolean rent;

    public Book() {

    }

    public Book(int number, String title, String author) {
        this.number = number;
        this.title = title;
        this.author = author;
        rent = false;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }

    public int getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isRent() {
        return rent;
    }

}
