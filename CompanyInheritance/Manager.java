package CompanyInheritance;

class Manager extends Employee {
    public Manager(String NIP, String nama, String status, int jamKerja) {
        super(NIP, nama, "Manager", status, jamKerja);
    }
}
