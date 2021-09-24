package Interfaces;

public class publishingHouse {
    public static void main(String[] args) {
        Printable[] printables = new Printable[2];
        printables[0] = new book("i am a book");
        printables[1] = new magazine("i am a magazine");

        for (Printable printable : printables) {
            printable.print();

            System.out.println();
        }

    }
}
