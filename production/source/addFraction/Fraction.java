package addFraction;

public class Fraction {
    private int number;

    public Fraction(int number) {
        this.number = number;
    }

    public Fraction add(Fraction fraction) {
        return new Fraction(fraction.number);
    }

    @Override
    public String toString() {
        return "Fraction is " + number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        return number == ((Fraction) o).number;
    }
    @Override
    public int hashCode() {
        return number;
    }
}
