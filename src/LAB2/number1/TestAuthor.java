package LAB2.number1;

public class TestAuthor {
    public static void main(String[] args) {
        System.out.println("""
                ------
                Task with an author
                ------""");
        String info;
        Author author = new Author("James", "jame123@email.jp", 'M');
        info = author.toString();
        System.out.println(info);
        author.setEmail("new_john123@gmail.ru");
        info = author.toString();
        System.out.println(info);
    }
}
