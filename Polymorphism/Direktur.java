package Polymorphism;

class Direktur extends  Pegawai{
    private static final int gajiDir=10000000;
    private static  final int tunjangan=50000;

    public int gaji(){
        return gajiDir;
    }
    public int tunjangan(){
        return tunjangan;
    }
}
