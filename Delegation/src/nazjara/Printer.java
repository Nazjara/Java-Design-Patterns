package nazjara;

class Printer { //the "delegator"
    RealPrinter rp = new RealPrinter();

    void print() {
        rp.print();
    }
}
