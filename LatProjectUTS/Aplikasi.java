import java.util.Scanner;

import entity.*;
import servis.*;

/**
 * Aplikasi
 */
public class Aplikasi {
    private static ServiceMahasiswa service;
    private static Scanner scanner;

    public static void main(String[] args) {
        service = new ServiceMahasiswa();

        int opsi = 0;
        do {
            cetakMenu();
            scanner = new Scanner(System.in);
            opsi = scanner.nextInt();
            prosesMenu(opsi);
        } while (opsi != 5);
    }

    private static void prosesMenu(int opsi) {
        switch (opsi) {
        case 1:
            formTambahData();
            break;

        case 2:

            break;

        case 3:

            break;

        case 4:
            service.cetakData();
            break;

        default:
            break;
        }
    }

    private static void formTambahData() {
        String nim, nama, kelas;
        System.out.println("=== form tambah data ===");
        scanner = new Scanner(System.in);
        System.out.print("NIM = ");
        nim = scanner.nextLine();
        System.out.print("nama = ");
        nama = scanner.nextLine();
        System.out.print("kelas = ");
        kelas = scanner.nextLine();
        simpanDataBaru(new Mahasiswa(nim, nama, kelas));
    }

    private static void simpanDataBaru(Mahasiswa mhs) {
        service.tambahData(mhs);
    }

    private static void cetakMenu() {
        System.out.println("=== aplikasi mahasiswa ===");
        System.out.println("1. Tambah data");
        System.out.println("2. Ubah data");
        System.out.println("3. Hapus data");
        System.out.println("4. Tampilkan data");
        System.out.println("5. Keluar");
        System.out.println("---------------------------");
        System.out.print("pilihan > ");

    }
}