/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mobil;

/**
 *
 * @author L540
 */
public class Mobil {

    // Atribut
    private String merek;
    private int tahunProduksi;
    private String warna;
    private int kecepatan;

    // Konstruktor
    public Mobil(String merek, int tahunProduksi, String warna, int kecepatan) {
        this.merek = merek;
        this.tahunProduksi = tahunProduksi;
        this.warna = warna;
        this.kecepatan = kecepatan;
    }

    // Metode "percepat"
    public void percepat(int nilaiKecepatan) {
        this.kecepatan += nilaiKecepatan;
    }

    // Metode "tampilInformasi"
    public void tampilInformasi() {
        System.out.println("Informasi Mobil:");
        System.out.println("Merek: " + merek);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Warna: " + warna);
        System.out.println("Kecepatan: " + kecepatan + " km/h");
    }

    public static void main(String[] args) {
        // Contoh penggunaan kelas Mobil
        Mobil mobil1 = new Mobil("Toyota", 2022, "Merah", 80);
        mobil1.tampilInformasi();

        // Percepat mobil
        mobil1.percepat(20);
        mobil1.tampilInformasi();
    }
}
