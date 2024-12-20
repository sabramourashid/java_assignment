public class Rational {
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        if (denominator == 0) throw new
IllegalArgumentException("denominator cant be zero.");
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();

    }

    private void reduce() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;

    }

    private int gcd(int a, int b) {
        return b == 0? a:gcd(b,a % b);
    }

    public Rational add(Rational other) {
        return new Rational(this.numerator * other.denominator + other.numerator * this.denominator,this.denominator* other.denominator);
    }

    public Rational subtract(Rational other) {
        return new Rational(this.numerator * other.denominator - other.numerator * this.denominator,this.denominator* other.denominator);

    }

    //@overide
    public String toString() {
        return numerator + "/" + denominator;
    }
    public static void main(String[] args) {
        Rational r1 = new Rational(1,2);
        Rational r2 = new Rational(1,3);

        System.out.println("sum: " + r1.add(r2));
        System.out.println("difference: " + r1.subtract(r2));
    }


}