package Emplyee;

class Employee {
    protected String NIP;
    protected String nama;
    protected String Jabatan;
    protected String status;
    protected int jamkerja;
    protected double gaji;
    protected double bonus;
    protected double potongan;

    public Employee(String NIP, String nama, String Jabatan, String status, int jamkerja) {
        this.NIP = NIP;
        this.nama = nama;
        this.Jabatan = Jabatan;
        this.status = status;
        this.jamkerja = jamkerja;
        this.gaji = 0;
        this.bonus = 0;
        this.potongan = 0;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setPotongan(double potongan) {
        this.potongan = potongan;
    }

    public void printData() {
        System.out.println("NIP: " + NIP);
        System.out.println("Nama: " + nama);
        System.out.println("Jabatan: " + Jabatan);
        System.out.println("Status: " + status);
        System.out.println("Jam Kerja: " + jamkerja);
        System.out.println("Gaji: " + gaji);
        System.out.println("Bonus: " + bonus);
        System.out.println("Potongan: " + potongan);
    }
}

class Boss extends Employee {
    public Boss(String NIP, String nama, String Jabatan, String status, int jamkerja) {
        super(NIP, nama, Jabatan, status, jamkerja);
        setGaji(10000000);
        setBonus(500000);
        setPotongan(250000);
    }
}

class Manager extends Employee {
    public Manager(String NIP, String nama, String Jabatan, String status, int jamkerja) {
        super(NIP, nama, Jabatan, status, jamkerja);
        setGaji(8000000);
        setBonus(400000);
        setPotongan(200000);
    }
}

class CleaningService extends Employee {
    public CleaningService(String NIP, String nama, String Jabatan, String status, int jamkerja) {
        super(NIP, nama, Jabatan, status, jamkerja);
        setGaji(4000000);
        setBonus(200000);
        setPotongan(100000);
    }
}

class Security extends Employee {
    public Security(String NIP, String nama, String Jabatan, String status, int jamkerja) {
        super(NIP, nama, Jabatan, status, jamkerja);
        setGaji(3500000);
        setBonus(150000);
        setPotongan(75000);
    }
}

