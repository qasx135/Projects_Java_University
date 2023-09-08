package LAB2.number7;

public class Book {
    private String author;
    private String name;
    private int dateOfCreation;
    private int dateOfPublished;

    public Book(String author, String name, int dateOfCreation, int dateOfPublished) {
        this.author = author;
        this.name = name;
        this.dateOfCreation = dateOfCreation;
        this.dateOfPublished = dateOfPublished;
    }

    public String getAuthor() {
        return author;
    }

    public int getDateOfPublished() {
        return dateOfPublished;
    }

    public void setDateOfPublished(int dateOfPublished) {
        this.dateOfPublished = dateOfPublished;
    }

    public String getName() {
        return name;
    }

    public int getDateOfCreation() {
        return dateOfCreation;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfCreation(int dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", dateOfCreation=" + dateOfCreation +
                ", publication=" + dateOfPublished +
                '}';
    }
}
