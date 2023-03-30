package CompanyInheritance;

class Boss extends Employee {
    public Boss(String NIP, String nama, String status, int jamKerja) {
        this.NIP = NIP;
        this.nama = nama;
        this.jabatan = "Boss";
        this.status = status;
        this.jamKerja = jamKerja;
    }
}