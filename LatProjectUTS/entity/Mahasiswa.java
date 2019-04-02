package entity;

/**
 * Mahasiswa
 */
public class Mahasiswa {

    private String nim;
    private String nama;
    private String kelas;

    public Mahasiswa() {
    }

    public Mahasiswa(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }

    public String getNim() {
        return this.nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return this.kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public Mahasiswa nim(String nim) {
        this.nim = nim;
        return this;
    }

    public Mahasiswa nama(String nama) {
        this.nama = nama;
        return this;
    }

    public Mahasiswa kelas(String kelas) {
        this.kelas = kelas;
        return this;
    }

}
                    