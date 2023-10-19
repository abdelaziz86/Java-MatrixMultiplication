package Calculator;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Matrix extends Remote {
    int[][] multiply(int[][] matrixA, int[][] matrixB) throws RemoteException;
}

