/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mahasiswa;

/**
 *
 * @author L540
 */
public class Mahasiswa {

  // Atribut
    private String nama;
    private String nim;
    private String jurusan;
    private float ipk;

    // Konstruktor
    public Mahasiswa(String nama, String nim, String jurusan, float ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    // Metode "ubahNama"
    public void ubahNama(String namaBaru) {
        this.nama = namaBaru;
    }

    // Metode "tampilInformasi"
    public void tampilInformasi() {
        System.out.println("Informasi Mahasiswa:");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("IPK: " + ipk);
    }

    public static void main(String[] args) {
        // Contoh penggunaan kelas Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Maulana Arighi", "C2083207008", "Pendidikan Teknologi Informasi", 3.21f);
        mahasiswa1.tampilInformasi();

        // Ubah nama mahasiswa
        mahasiswa1.ubahNama("Maulana Arighi");
        mahasiswa1.tampilInformasi();
    }
}
