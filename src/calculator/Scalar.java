package calculator;

public class Scalar extends Var {
    double b;

    @Override
    public String toString() {
        return Double.toString(b);
    }

    public Scalar(double b) {
        this.b = b;

    }

    public Scalar(String b) {
        this.b = Double.parseDouble(b);
    }

    public Scalar(Scalar b) {
        this.b = b.b;
    }
}
