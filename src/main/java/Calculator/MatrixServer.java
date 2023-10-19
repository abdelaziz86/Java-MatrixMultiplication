package Calculator;

import java.rmi.Naming;

public class MatrixServer {
    public MatrixServer() {
        try {
            Matrix matrix = new MatrixMultiplication();
            Naming.rebind("rmi://localhost:1099/MatrixService", new MatrixMultiplication());
            System.out.println("Matrix server is ready.");
        } catch (Exception e) {
            System.out.println("Trouble: " + e);
        }
    }

    public static void main(String[] args) {
        new MatrixServer();
    }
}
