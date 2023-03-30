package CompanyInheritance;

class Employee {
    protected String NIP;
    protected String nama;
    protected String jabatan;
    protected String status;
    protected int jamKerja;
    protected int gaji;
    protected int bonus;
    protected int potongan;

    public Employee(String NIP, String nama, String jabatan, String status, int jamKerja) {
        this.NIP = NIP;
        this.nama = nama;
        this.jabatan = jabatan;
        this.status = status;
        this.jamKerja = jamKerja;
    }

    Employee() {
    }
    public void hitungGaji() {
        // hitung gaji berdasarkan jam kerja
        gaji = jamKerja * 20000;
    }

    public void hitungBonus() {
        // hitung bonus berdasarkan jabatan dan status
        if (jabatan.equals("Company.Boss")) {
            bonus = 1000000;
        } else if (jabatan.equals("Company.Manager")) {
            bonus = 500000;
        } else if (jabatan.equals("Cleaning Service") || jabatan.equals("Company.Security")) {
            bonus = 250000;
        }
        if (status.equals("Menikah")) {
            bonus += 250000;
        }
    }

    public void hitungPotongan() {
        // hitung potongan berdasarkan status
        if (status.equals("Cerai")) {
            potongan = 100000;
        } else if (status.equals("Duda") || status.equals("Janda")) {
            potongan = 50000;
        }
    }

    public void cetakGaji() {
        hitungGaji();
        hitungBonus();
        hitungPotongan();

        int gajiBersih = gaji + bonus - potongan;

        System.out.println("Nama: " + nama);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji: " + gaji);
        System.out.println("Bonus: " + bonus);
        System.out.println("Potongan: " + potongan);
        System.out.println("Gaji Bersih: " + gajiBersih);
    }
}





