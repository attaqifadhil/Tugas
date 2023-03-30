package Polymorphism;

public class Staf extends Pegawai{
    private static final int gajiStaf =50000;
    private static final int bounsStaf =1000;

    public int gaji (){
        return gajiStaf;
    }
    public int Bonus(){
        return bounsStaf;
    }
}
