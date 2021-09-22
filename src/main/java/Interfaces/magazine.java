package Interfaces;

public class magazine implements Printable {
    @Override
    public void print() {
        System.out.println("I am a magazine");
    }

    public static void PrintMagazines(Printable[] printables) {
        for (Printable p: printables) {
            if (p instanceof magazine)
                p.print();
            System.out.println("Only magazines here");
        }
    }
}

