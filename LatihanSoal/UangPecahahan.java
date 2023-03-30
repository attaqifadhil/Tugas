package LatihanSoal;

import java.util.Scanner;

class UangPecahan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah uang dalam rupiah: ");
        int jumlahUang = input.nextInt();

        int ratusanRibuan = jumlahUang / 100000;
        int sisa = jumlahUang % 100000;
        int limaPuluhRibuan = sisa / 50000;
        sisa %= 50000;
        int duaPuluhRibuan = sisa / 20000;
        sisa %= 20000;
        int sepuluhRibuan = sisa / 10000;
        sisa %= 10000;
        int limaRibu = sisa / 5000;
        sisa %= 5000;
        int duaRibu = sisa / 2000;
        sisa %= 2000;
        int seribu = sisa / 1000;

        System.out.println(ratusanRibuan + " Lembar 100000");
        System.out.println(limaPuluhRibuan + " Lembar 50000");
        System.out.println(duaPuluhRibuan + " Lembar 20000");
        System.out.println(sepuluhRibuan + " Lembar 10000");
        System.out.println(limaRibu + " Lembar 5000");
        System.out.println(duaRibu + " Lembar 2000");
        System.out.println(seribu + " Lembar 1000");
    }
}
