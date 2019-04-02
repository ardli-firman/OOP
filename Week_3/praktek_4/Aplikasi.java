/**
 * Aplikasi
 */
public class Aplikasi {

    public static void main(String[] args) {
        Mahasiswa[] dataMhs = {
            new Mahasiswa("17090032", "re");
            new Mahasiswa("17090032", "re");
            new Mahasiswa("17090032", "re");
        };

        for(Mahasiswa mhs : dataMhs){
            mhs.cetak();
        }
    }
}