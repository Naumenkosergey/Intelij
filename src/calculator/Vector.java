package calculator;

import java.util.Arrays;

public class Vector {
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
            razdelitel = ",";
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
