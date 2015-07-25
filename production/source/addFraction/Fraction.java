package addFraction;

public class Fraction {
    private int nominator;
    private int denominator;

    public Fraction(int number) {
        this(number, 1);
    }

    public Fraction(int nominator, int denominator) {
        int gcd = new GreatestCommonDivisor().calculate(nominator, denominator);
        this.nominator = nominator / gcd;
        this.denominator = denominator / gcd;
    }

    public Fraction plus(Fraction fraction) {
        return new Fraction(
                fraction.nominator * denominator + nominator * fraction.denominator,
                fraction.denominator * denominator);
    }

    @Override
    public String toString() {
            return nominator + " / " + denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        return nominator == ((Fraction) o).nominator && denominator == ((Fraction) o).denominator;
    }

    @Override
    public int hashCode() {
        return 31 * nominator + denominator;
    }
}
