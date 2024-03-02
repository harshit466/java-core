
class Book {
     String book_title;
     double book_price;

    public String getTitle() {
        return book_title;
    }

    public void setTitle(String title) {
         book_title = title;
    }

    public double getPrice() {
        return book_price;
    }

    public void setPrice(double price) {
        book_price = price;
    }
}
public class Main
{
	public static void main(String[] args) {
        String book_title = "Java Programming";
        double book_price = 350.00;
        Book book = createBooks(book_title, book_price);
        showBooks(book);
    }

    public static Book createBooks(String title, double price) {
        Book book = new Book();
        book.setTitle(title);
        book.setPrice(price);
        return book;
    }

    public static void showBooks(Book book) {
        System.out.println("Book Title: " + book.getTitle() + " and Price: " + book.getPrice());
    }
}
