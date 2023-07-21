/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.buku;

/**
 *
 * @author L540
 */
public class Buku {

 // Atribut
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private int jumlahHalaman;

    // Konstruktor
    public Buku(String judul, String penulis, int tahunTerbit, int jumlahHalaman) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.jumlahHalaman = jumlahHalaman;
    }

    // Metode "tambahHalaman"
    public void tambahHalaman(int tambahanHalaman) {
        this.jumlahHalaman += tambahanHalaman;
    }

    // Metode "tampilInformasi"
    public void tampilInformasi() {
        System.out.println("Informasi Buku:");
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Jumlah Halaman: " + jumlahHalaman + " halaman");
    }

    public static void main(String[] args) {
        // Contoh penggunaan kelas Buku
        Buku buku1 = new Buku("Purple Cow", "Seth Godin", 2002, 200);
        buku1.tampilInformasi();

        // Tambah halaman buku
        buku1.tambahHalaman(16);
        buku1.tampilInformasi();
    }
}
