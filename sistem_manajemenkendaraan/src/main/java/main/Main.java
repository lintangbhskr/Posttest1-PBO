/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controllers.PengelolaKendaraan;
import java.util.Scanner;
import model.Kendaraan;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int pilihan;
            
            do {
                System.out.println("=== Manajemen Kendaraan ===");
                System.out.println("1. Tambah Kendaraan");
                System.out.println("2. Lihat Semua Kendaraan");
                System.out.println("3. Hapus Kendaraan");
                System.out.println("4. Update Kendaraan");
                System.out.println("5. Keluar");
                System.out.print("Masukkan pilihan Anda: ");
                pilihan = scanner.nextInt();
                scanner.nextLine();  // Konsumsi karakter newline
                
                switch (pilihan) {
                    case 1 ->  {
                        // Tambah Kendaraan
                        System.out.print("Masukkan nomor plat: ");
                        String nomorPlat = scanner.nextLine();
                        System.out.print("Masukkan merk: ");
                        String merk = scanner.nextLine();
                        System.out.print("Masukkan tahun: ");
                        int tahun = scanner.nextInt();
                        scanner.nextLine(); // Konsumsi karakter newline
                        Kendaraan kendaraan = new Kendaraan(nomorPlat, merk, tahun);
                        PengelolaKendaraan.tambahKendaraan(kendaraan);
                    }
                    case 2 ->  {
                        // Lihat Semua Kendaraan
                        PengelolaKendaraan.lihatKendaraan();
                    }
                    case 3 ->  {
                        // Hapus Kendaraan
                        PengelolaKendaraan.lihatKendaraan();
                        System.out.print("Masukkan indeks kendaraan yang ingin dihapus: ");
                        int index = scanner.nextInt();
                        PengelolaKendaraan.hapusKendaraan(index);
                    }
                    case 4 ->  {
                        // Update Kendaraan
                        PengelolaKendaraan.lihatKendaraan();
                        System.out.print("Masukkan indeks kendaraan yang ingin di-update: ");
                        int index = scanner.nextInt();
                        scanner.nextLine(); // Konsumsi karakter newline
                        
                        if (index >= 0 && index < PengelolaKendaraan.getKendaraanList().size()) {
                            // Masukkan data baru untuk kendaraan yang di-update
                            System.out.print("Masukkan nomor plat baru: ");
                            String nomorPlatBaru = scanner.nextLine();
                            System.out.print("Masukkan merk baru: ");
                            String merkBaru = scanner.nextLine();
                            System.out.print("Masukkan tahun baru: ");
                            int tahunBaru = scanner.nextInt();
                            scanner.nextLine(); // Konsumsi karakter newline
                            
                            Kendaraan kendaraanBaru = new Kendaraan(nomorPlatBaru, merkBaru, tahunBaru);
                            PengelolaKendaraan.updateKendaraan(index, kendaraanBaru);
                        } else {
                            System.out.println("Indeks tidak valid!");
                        }
                    }
                    case 5 -> System.out.println("Keluar...");
                    default -> System.out.println("Pilihan tidak valid, coba lagi.");
                }
            } while (pilihan != 5);
        }
    }
}
