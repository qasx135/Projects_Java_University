package LAB2.number7;

public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book("Jame", "Ocean", 1923, 2123),
                b2 = new Book("Jamy", "Sun", 1922, 2069),
                b3 = new Book("Jamt", "Sky", 1678, 1999),
                b4 = new Book("Jamr", "River", 1638, 2004),
                b5 = new Book("Jami", "Dirt", 1111, 2012),
                b6 = new Book("Jamw", "Cloud", 2222, 2434),
                b7 = new Book("Jamq", "Pillow", 1924, 2234);
        Book[] sh = {b1, b2, b3, b4, b5, b6, b7};
        BookShelf n_shelf = new BookShelf(sh, 7);
        n_shelf.show();
        System.out.println("The earliest book by published: " + n_shelf.findEarliest());
        System.out.print("The latest book by published: " + n_shelf.findLatest());
        System.out.println("""
                \n
                |----------------|
                |Sorted bookshelf|
                |----------------|""");
        n_shelf.shelfSort();
        n_shelf.show();

    }
}
