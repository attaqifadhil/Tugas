package Klasifikasi;

abstract class Vertebrata {
    protected String nama;
    protected String jenis;

    public Vertebrata(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }
}

class BerdarahPanas extends Vertebrata {
    public BerdarahPanas(String nama, String jenis) {
        super(nama, jenis);
    }
}

class BerdarahDingin extends Vertebrata {
    public BerdarahDingin(String nama, String jenis) {
        super(nama, jenis);
    }
}

class Mamalia extends BerdarahPanas {
    public Mamalia(String nama, String jenis) {
        super(nama, jenis);
    }
}

class Burung extends BerdarahPanas {
    public Burung(String nama, String jenis) {
        super(nama, jenis);
    }
}

class Ikan extends BerdarahDingin {
    public Ikan(String nama, String jenis) {
        super(nama, jenis);
    }
}

class Amfibi extends BerdarahDingin {
    public Amfibi(String nama, String jenis) {
        super(nama, jenis);
    }
}

class Main {
    public static void main(String[] args) {
        Vertebrata hewan1 = new Ikan("Lele", "Ikan");
        Vertebrata hewan2 = new Amfibi("Kodok", "Amfibi");
        Vertebrata hewan3 = new Mamalia("Kucing", "Mamalia");
        Vertebrata hewan4 = new Burung("Elang", "Burung");

        System.out.println(hewan1.jenis + " " + hewan1.nama);
        System.out.println(hewan2.jenis + " " + hewan2.nama);
        System.out.println(hewan3.jenis + " " + hewan3.nama);
        System.out.println(hewan4.jenis + " " + hewan4.nama);
    }
}
