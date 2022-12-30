public class Printer <Loquesea>{

    Loquesea printThis;

    public Printer(Loquesea printThis) {
        this.printThis = printThis;
    }

    public void print() {
        System.out.println(printThis);
    }
}
