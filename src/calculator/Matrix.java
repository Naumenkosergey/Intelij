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
    /*public Matrix(String mat) {
        mat = mat.replaceAll("[}{]", "");
        String[][] mat1 = mat.split(",\\s*");
        double[][] mat2 = new double[mat1.length][mat1.length];
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                mat2[i][j] = Double.parseDouble(mat1[i][j]);
            }
        }
        this.mat = mat2;
    }*/

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        String razdelitel2 = "";
        for (int i = 0; i < this.mat.length; i++) {
            for (int j = 0; j <mat[i].length; j++) {
                stringBuilder.append(razdelitel2).append(this.mat[i][j]);
                razdelitel2 = ",";
            }
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
