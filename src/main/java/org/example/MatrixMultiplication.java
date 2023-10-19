package org.example;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MatrixMultiplication extends UnicastRemoteObject implements Matrix {
    public MatrixMultiplication() throws RemoteException {
        super();
    }

    @Override
    public int[][] multiply(int[][] matrixA, int[][] matrixB) throws RemoteException {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return result;
    }
}

