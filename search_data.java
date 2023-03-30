import java.util.Scanner;

public class search_data {
    public static void main(String[] args) {
        int jmlData, i, cari;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Masukkan jumlah data yang akan dimasukkan :");
            jmlData = scan.nextInt();

            int[] array = new int[jmlData];
            System.out.println("\nMasukkan " + jmlData + " buah data integer");
            System.out.println("==========================================");

            // input data ke dalam array
            for (i = 0; i < jmlData; i++) {
                System.out.println("Data ke-" + (i + 1) + "=");
                array[i] = scan.nextInt();
            }

            // menampilakn data sebelum diurutkan
            System.out.println("\nData di dalam array");
            System.out.println("=======================");
            for (int a = 0; a < array.length; a++) {
                System.out.println(array[a] + ", ");
            }
            System.out.println("\n========================");

            System.out.println("Masukkan angka yang mau di cari");
            cari = scan.nextInt();

            // pemangiila fungsi pencarian

            int result = pencarian(array, cari);
            if (result == -1) {
                System.out.println("\n=============================");
                System.out.println("\nData tidak ditemukan");
            } else {
                System.out.println("\n=============================");
                System.out.println("Data yang ditemukan di indexke- " + result);
            }

        }
    }

    public static int pencarian(int[] data, int x) {
        int n = data.length;
        for (int i = 0; i < n; i++) {
            if (data[i] == x) {
                return i;
            }
        }
        return -1;
    }
}