package calculator;

public class Vector extends Variable {
    double[] mas;

    public Vector(double[] mas) {
        this.mas = mas;
    }

    public Vector(Vector mas) {
        this.mas = mas.mas;
    }

    public Vector(String mas) {
        mas = mas.replaceAll("[}{]", "");
        String[] mas1 = mas.split(",\\s*");
        double[] mas2 = new double[mas1.length];
        for (int i = 0; i < mas2.length; i++) {
            mas2[i] = Double.parseDouble(mas1[i]);
        }
        this.mas = mas2;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        String razdelitel = "";
        for (int i = 0; i < this.mas.length; i++) {
            stringBuilder.append(razdelitel).append(this.mas[i]);
            razdelitel = ", ";
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    @Override
    public Variable slogenie(Variable other) {
        if (other instanceof Vector) {
            Vector vector = (Vector) other;
            double[] result = new double[this.mas.length];
            for (int i = 0; i < this.mas.length; i++) {

                result[i] = this.mas[i] + vector.mas[i];

            }
            return new Vector(result);

        }
        if (other instanceof Scalar) {
            Scalar scalar = (Scalar) other;
            double[] result = new double[this.mas.length];
            for (int i = 0; i < this.mas.length; i++) {

                result[i] = this.mas[i] + scalar.b;

            }
            return new Vector(result);
        }
        return other.slogenie(this);
    }

    @Override
    public Variable vichitanie(Variable other) {
        if (other instanceof Vector) {
            Vector vector = (Vector) other;
            double[] result = new double[this.mas.length];
            for (int i = 0; i < this.mas.length; i++) {

                result[i] = this.mas[i] - vector.mas[i];

            }
            return new Vector(result);

        }
        if (other instanceof Scalar) {
            Scalar scalar = (Scalar) other;
            double[] result = new double[this.mas.length];
            for (int i = 0; i < this.mas.length; i++) {

                result[i] = this.mas[i] - scalar.b;

            }
            return new Vector(result);
        }
        return super.vichitanie(other);
    }

    @Override
    public Variable umnogenie(Variable other) {
        if (other instanceof Scalar) {
            Scalar scalar = (Scalar) other;
            double[] result = new double[this.mas.length];
            for (int i = 0; i < this.mas.length; i++) {

                result[i] = this.mas[i] * scalar.b;

            }
            return new Vector(result);

        }
        if (other instanceof Vector) {
            Vector vector = (Vector) other;
            double result = 0;
            for (int i = 0; i < this.mas.length; i++) {

                result += this.mas[i] * vector.mas[i];

            }
            return new Scalar(result);

        }
        return super.umnogenie(other);
    }

    @Override
    public Variable delenie(Variable other) {

        if (other instanceof Scalar) {
            Scalar scalar = (Scalar) other;
            double[] result = new double[this.mas.length];
            for (int i = 0; i < this.mas.length; i++) {

                result[i] = this.mas[i] / scalar.b;

            }
            return new Vector(result);

        }
        return super.delenie(other);
    }
}
