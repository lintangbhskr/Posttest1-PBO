/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author noorl
 */


public class Kendaraan {
    private final String nomorPlat;
    private final String merk;
    private final int tahun;

    // Constructor
    public Kendaraan(String nomorPlat, String merk, int tahun) {
        this.nomorPlat = nomorPlat;
        this.merk = merk;
        this.tahun = tahun;
    }

    // Getter
    public String getNomorPlat() {
        return nomorPlat;
    }

    public String getMerk() {
        return merk;
    }

    public int getTahun() {
        return tahun;
    }

    // Method untuk menampilkan informasi kendaraan
    public void tampilkanInfo() {
        System.out.println("Nomor Plat: " + nomorPlat);
        System.out.println("Merk: " + merk);
        System.out.println("Tahun: " + tahun);
    }
}


