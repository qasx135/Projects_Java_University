package LAB4_1.number4;

import java.util.Scanner;

public class Matrix {
    Double[][] matrix;
    Integer x;
    Integer y;

    public Matrix(Integer x, Integer y, Double[][] mat) {
        this.x = x;
        this.y = y;
        this.matrix = mat;
    }
    public Matrix(Integer x, Integer y) {
        this.x = x;
        this.y = y;
        this.matrix = new Double[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                this.matrix[i][j] = 0.;
            }
        }
    }

    public Matrix sum(Matrix obj) {
        if (!(obj.x.equals(this.x) && obj.y.equals(this.y))) {
            return null;
        } else {
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    this.matrix[i][j] += obj.matrix[i][j];
                }
            }
        }
        return this;
    }

    public Matrix multNumber(Double number) {
        Matrix n_m = new Matrix(this.x, this.y);
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                n_m.matrix[i][j] = this.matrix[i][j] * number;
            }
        }
        return n_m;
    }

    public void show() {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matrix mult(Matrix m2){
        Matrix new_matrix = new Matrix(this.x, m2.x);
        for (int i=0; i<new_matrix.y; i++)
            for (int j=0; j< new_matrix.x; j++)
                for (int k=0; k<this.matrix[0].length; k++)
                    new_matrix.matrix[i][j] += this.matrix[i][k] * m2.matrix[k][j];
        return new_matrix;
    }
}
