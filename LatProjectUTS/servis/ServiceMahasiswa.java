package servis;

import java.util.LinkedList;
import java.util.List;

import entity.*;

/**
 * ServiceMahasiswa
 */
public class ServiceMahasiswa {
    private static List<Mahasiswa> data = new LinkedList<Mahasiswa>();

    public void tambahData(Mahasiswa mhs) {
        ServiceMahasiswa.data.add(mhs);
        System.out.println(" Data telah disimpan");
    }

    public void ubahData(Mahasiswa mhs) {
        int res = data.indexOf(mhs);
        if (res >= 0) {
            data.set(res, mhs);
            System.out.println("Data telah berubah");
        }

    }

    public void cetakData() {
        System.out.println("=== Print data === ");
        int i = 1;
        for (Mahasiswa mhs : data) {
            System.out.println("data ke " + i++);
            System.out.println("\tNIM\t: " + mhs.getNim());
            System.out.println("\tNama\t: " + mhs.getNama());
            System.out.println("\tKelas\t: " + mhs.getKelas());
        }
    }
}