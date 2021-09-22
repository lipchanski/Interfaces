package Interfaces;

public class publishingHouse {
    public static void main(String[] args) {
        Printable[] printables = new Printable[2];
        printables[0] = new book();
        printables[1] = new magazine();

        for (Printable printable : printables) {
            printable.print();
        }

    }
}
