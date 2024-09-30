/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

/**
 *
 * @author noorl
 */
    package controllers;

import model.Kendaraan;
import java.util.ArrayList;

public class PengelolaKendaraan {
    // Daftar kendaraan menggunakan ArrayList
    private static final ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>();

    // Method untuk menambahkan kendaraan
    public static void tambahKendaraan(Kendaraan kendaraan) {
        daftarKendaraan.add(kendaraan);
        System.out.println("Kendaraan berhasil ditambahkan!");
    }

    // Method untuk melihat semua kendaraan
    public static void lihatKendaraan() {
        if (daftarKendaraan.isEmpty()) {
            System.out.println("Tidak ada kendaraan yang terdaftar!");
        } else {
            for (int i = 0; i < daftarKendaraan.size(); i++) {
                System.out.println("Indeks: " + i);
                daftarKendaraan.get(i).tampilkanInfo();
                System.out.println("--------------------");
            }
        }
    }

    // Method untuk menghapus kendaraan berdasarkan indeks
    public static void hapusKendaraan(int index) {
        if (index >= 0 && index < daftarKendaraan.size()) {
            daftarKendaraan.remove(index);
            System.out.println("Kendaraan berhasil dihapus!");
        } else {
            System.out.println("Indeks tidak valid!");
        }
    }

    // Method untuk update kendaraan berdasarkan indeks
    public static void updateKendaraan(int index, Kendaraan kendaraanBaru) {
        if (index >= 0 && index < daftarKendaraan.size()) {
            daftarKendaraan.set(index, kendaraanBaru);
            System.out.println("Kendaraan berhasil di-update!");
        } else {
            System.out.println("Indeks tidak valid!");
        }
    }

    // Method untuk mengambil daftar kendaraan
    public static ArrayList<Kendaraan> getKendaraanList() {
        return daftarKendaraan;
    }
}


