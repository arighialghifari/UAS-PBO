/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.persegipanjang;

/**
 *
 * @author L540
 */
public class PersegiPanjang {

 // Atribut
    private float panjang;
    private float lebar;

    // Konstruktor
    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Metode "hitungLuas"
    public float hitungLuas() {
        return panjang * lebar;
    }

    // Metode "hitungKeliling"
    public float hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    public static void main(String[] args) {
        // Contoh penggunaan kelas PersegiPanjang
        PersegiPanjang persegiPanjang1 = new PersegiPanjang(5.0f, 3.0f);
        System.out.println("Luas Persegi Panjang: " + persegiPanjang1.hitungLuas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang1.hitungKeliling());
    }
}
