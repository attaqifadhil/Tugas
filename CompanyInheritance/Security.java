package CompanyInheritance;

class Security extends Employee {
    public Security(String NIP, String nama, String status, int jamKerja) {
        super(NIP, nama, "Security", status, jamKerja);
    }
}