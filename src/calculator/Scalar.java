package calculator;

public class Scalar extends Variable {
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

    @Override
    public Variable slogenie(Variable other) {
        if (other instanceof Scalar)
        {
          Scalar chislo = (Scalar) other;
          double result=chislo.b + this.b;
          return new Scalar (result);
        }
        return other.slogenie(this);
    }

    @Override
    public Variable vichitanie(Variable other) {
        if (other instanceof Scalar)
        {
            Scalar chislo = (Scalar) other;
            double result=this.b-chislo.b;
            return new Scalar (result);
        }
        return super.vichitanie(other);
    }

    @Override
    public Variable umnogenie(Variable other) {
        if (other instanceof Scalar)
        {
            Scalar chislo = (Scalar) other;
            double result=chislo.b * this.b;
            return new Scalar (result);
        }
        return super.umnogenie(other);
    }

    @Override
    public Variable delenie(Variable other) {
        if (other instanceof Scalar)
        {
            Scalar chislo = (Scalar) other;
            double result=this.b/chislo.b;
            return new Scalar (result);
        }
        return super.delenie(other);
    }
}

