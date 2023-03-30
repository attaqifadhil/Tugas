package LatihanSoal;

import java.util.Scanner;

public class BikinArray {
    public static void main(String[] args) {
        int inputM, inputN;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Masukkan m");
            inputM = scan.nextInt();
            System.out.println("masukkan n");
            inputN = scan.nextInt();
        }


        int[][] matriks = nmatriks(inputM, inputN);
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[0].length; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] nmatriks(int m, int n) {
        int[][] matriks = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                    matriks[i][j] = 1;
                } else if (i == 1 || i == m - 2 || j == 1 || j == n - 2) {
                    matriks[i][j] = 2;
                } else if (i == 2 || i == m - 3 || j == 2 || j == n - 3) {
                    matriks[i][j] = 3;
                } else {
                    int k = Math.min(Math.min(i, j), Math.min(m - i - 1, n - j - 1));
                    matriks[i][j] = k + 1;
                }
            }
        }
        return matriks;
    }
}