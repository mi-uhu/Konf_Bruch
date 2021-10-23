public class Bruch {
    private int numerator; // Zähler
    private int denominator; // Nenner

    public Bruch(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double toDecimal() {
        return ( (double)numerator ) / denominator;
    }

    public String print() {
        return numerator + " / " + denominator;
    }

    public Bruch multiplicate(Bruch b2) {
        return new Bruch( numerator * b2.getNumerator(), denominator * b2.getDenominator() );
    }

    public Bruch multiplicate(Bruch b2,  Bruch b3) {
        return new Bruch( numerator * b2.getNumerator() * b3.getNumerator(), denominator * b2.getDenominator() * b3.getDenominator() );

    }
}
