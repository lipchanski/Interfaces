package Interfaces;

public class book extends Paper implements Printable {
    public book(String book) {
    }

    @Override
    public void print() {
    }

    public static void PrintBooks(Printable[] printables) {
        for (Printable b: printables){
            if (b instanceof book)
                b.print();
            book.PrintBooks("only books is here");
        }

    }

    private static void PrintBooks(String only_books_is_here) {
    }
}
