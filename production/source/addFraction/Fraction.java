package addFraction;

public class Fraction {
    private int number;
    private int nominator;
    private int denominator;

    public Fraction(int number) {
        this.number = number;
        this.denominator = 1;
    }

    public Fraction(int nominator, int denominator) {
        this.nominator = nominator;
        this.denominator = denominator;
    }

    public Fraction plus(Fraction fraction) {
        if (fraction.denominator != 1) {
            return new Fraction(fraction.nominator, fraction.denominator);
        }
        else if (denominator != 1) {
            return new Fraction(nominator, denominator);
        }
        else {
            return new Fraction(fraction.number + number);
        }
    }

    @Override
    public String toString() {
        if (denominator != 1) {
            return nominator + " / " + denominator;
        }
        else {
            return "" + number;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        if(denominator != 1)
        {
            return nominator == ((Fraction) o).nominator && denominator == ((Fraction) o).denominator;
        }
        else
        {
            return number == ((Fraction) o).number;
        }
    }

    @Override
    public int hashCode() {
        return number;
    }
}
