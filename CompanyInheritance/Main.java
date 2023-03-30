package CompanyInheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan NIP: ");
        String NIP = scanner.nextLine();
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan jabatan (Boss/Manager/Cleaning Service/Security): ");
        String jabatan = scanner.nextLine();
        System.out.print("Masukkan status (Menikah/Belum Menikah/Cerai/Duda/Janda): ");
        String status = scanner.nextLine();
        System.out.print("Masukkan jam kerja: ");
        int jamKerja = scanner.nextInt();

        Employee employee;
        if (jabatan.equals("Boss")) {
            employee = new Boss(NIP, nama, status, jamKerja);
        } else if (jabatan.equals("Manager")) {
            employee = new Manager(NIP, nama, status, jamKerja);
        } else if (jabatan.equals("Cleaning Service")) {
            employee = new CleaningService(NIP, nama, status, jamKerja);
        } else if (jabatan.equals("Security")) {
            employee = new Security(NIP, nama, status, jamKerja);
        } else {
            System.out.println("Jabatan tidak valid");
            return;
        }

        employee.cetakGaji();
    }
}
