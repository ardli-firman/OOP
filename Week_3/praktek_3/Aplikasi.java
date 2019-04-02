import entitas.Mahasiswa; // import entitas

public class Aplikasi {

    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("17090081", "Ardli Firman Maulana");
        Mahasiswa mhs2 = new Mahasiswa("17090018", "Erie Koesnadi");
        Mahasiswa mhs3 = new Mahasiswa("17090032", "Firman");

        System.out.println(args.length);

        mhs1.cetak();
        mhs2.cetak();
        mhs3.cetak();

    }
}

