package org.example;

import java.rmi.Naming;

public class ClientMultiplication {
    public static void main(String[] args) {
        try {
            Matrix matrix = (Matrix) Naming.lookup("rmi://localhost/MatrixService");

            int[][] matrixA = {{1, 2, 3}, {4, 5, 6}};
            int[][] matrixB = {{7, 8}, {9, 10}, {11, 12}};

            int[][] result = matrix.multiply(matrixA, matrixB);

            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[0].length; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Client exception: " + e);
        }
    }
}
