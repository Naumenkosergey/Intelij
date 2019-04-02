package calculator;

import java.util.Arrays;

public class Matrix {
    double[][] mat;

    public Matrix(double[][] mat) {
        this.mat = mat;
    }

    public Matrix(Matrix mat) {
        this.mat = mat.mat;
    }

    public Matrix(String mat) {
        mat = mat.replaceAll("[},{]", " ");
        mat = mat.trim();
        String[] mat1 = mat.split("   ");
        String[] matstb = mat1[0].split("\\s+");
        int kolvoStb = matstb.length;
        int kolvoStr = mat1.length;
        String[] mat3 = mat.split("\\s+");
        int k=0;
        double[][] mat2 = new double[kolvoStr][kolvoStb];
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                mat2[i][j] = Double.parseDouble(mat3[k]);
                k++;
            }
        }
        this.mat = mat2;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        for (int i = 0; i < this.mat.length; i++) {
            stringBuilder.append("{");
            String razdelitel2 = "";
            for (int j = 0; j < mat[i].length; j++) {
                stringBuilder.append(razdelitel2).append(this.mat[i][j]);
                razdelitel2 = ",";
            }
            if (i!=this.mat.length-1)
                stringBuilder.append("},");
        }
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }
}
