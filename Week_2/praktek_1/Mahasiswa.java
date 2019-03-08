public class Mahasiswa {
    private String nim;
    private String nama;

    // Constructor
    Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    // Method
    void cetak() {
        System.out.println(this.nim + " : " + this.nama);
    }

}