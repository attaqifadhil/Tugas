package Emplyee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan NIP: ");
        String NIP = input.nextLine();

        System.out.println("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.println("Masukkan Jabatan: ");
        String Jabatan = input.nextLine();

        System.out.println("Masukkan Status: ");
        String status = input.nextLine();

        System.out.println("Masukkan Jam Kerja: ");
        int jamkerja = input.nextInt();

        Boss boss = new Boss(NIP, nama, Jabatan, status, jamkerja);
        Manager manager = new Manager(NIP, nama, Jabatan, status, jamkerja);
    }
}
