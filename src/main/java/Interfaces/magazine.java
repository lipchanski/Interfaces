package Interfaces;

public class magazine extends Paper implements Printable {
    public magazine(String magazine) {
    }

    @Override
    public void print() {
    }

    public static void PrintMagazines(Printable[] printables) {
        for (Printable p: printables) {
            if (p instanceof magazine)
                p.print();
            magazine.PrintMagazines("only magazines is here");
        }
    }

    private static void PrintMagazines(String only_magazines_is_here) {
    }
}

