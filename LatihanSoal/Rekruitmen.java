package LatihanSoal;

import java.util.Scanner;

public class Rekruitmen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai Tes Akademik: ");
        double nilaiAkademik = input.nextDouble();

        System.out.print("Masukkan nilai Tes Ketrampilan: ");
        double nilaiKetrampilan = input.nextDouble();

        System.out.print("Masukkan nilai Tes Psikologi: ");
        double nilaiPsikologi = input.nextDouble();

        double rataRata = (nilaiAkademik + nilaiKetrampilan + nilaiPsikologi) / 3;

        if (rataRata >= 75) {
            if (nilaiAkademik > nilaiKetrampilan && nilaiAkademik > nilaiPsikologi) {
                System.out.println("Diterima ditempatkan di bagian administrasi");
            } else if (nilaiKetrampilan > nilaiAkademik && nilaiKetrampilan > nilaiPsikologi) {
                System.out.println("Diterima ditempatkan di bagian produksi");
            } else {
                System.out.println("Diterima ditempatkan di bagian pemasaran");
            }
        } else {
            System.out.println("Tidak diterima");
        }

        input.close();
    }
}
