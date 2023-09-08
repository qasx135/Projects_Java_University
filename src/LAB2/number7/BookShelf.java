package LAB2.number7;

public class BookShelf {
    Book[] shelf;
    int size;

    public BookShelf(Book[] books, int size) {
        this.shelf = books;
        this.size = size;
    }

    public Book findEarliest() {
        int date = 1000000;
        Book nb = new Book("", "", 0, 0);
        for (Book book : shelf) {
            if (book.getDateOfPublished() < date) {
                date = book.getDateOfPublished();
                nb = book;
            }
        }
        return nb;
    }

    public Book findLatest() {
        int date = 0;
        Book nb = new Book("", "", 0, 0);
        for (Book book : shelf) {
            if (book.getDateOfPublished() > date) {
                date = book.getDateOfPublished();
                nb = book;
            }
        }
        return nb;
    }

    public void shelfSort() {
        Book tempBook = shelf[0];
        for (int i = 0; i < shelf.length; i++) {
            for (int j = 0; j < shelf.length -1- i; j ++) {
                if (shelf[j].getDateOfPublished() >= shelf[j + 1].getDateOfPublished()) {
                    tempBook = shelf[j];
                    shelf[j] = shelf[j + 1];
                    shelf[j + 1] = tempBook;
                }
            }
        }
    }
    public void show(){
        System.out.println("\nYour BOKSHELF:");
        for (int i = 0; i < size; i++){
            System.out.println(shelf[i].toString());
        }
        System.out.println("\n");
    }

}
