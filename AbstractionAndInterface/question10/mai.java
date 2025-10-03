package AbstractionAndInterface.question10;

public class mai {
    public static void main(String[] args) {
        InkjetPrinter i = new InkjetPrinter();
        i.print();
        LaserPrinter l = new LaserPrinter();
        l.print();
    }
}
