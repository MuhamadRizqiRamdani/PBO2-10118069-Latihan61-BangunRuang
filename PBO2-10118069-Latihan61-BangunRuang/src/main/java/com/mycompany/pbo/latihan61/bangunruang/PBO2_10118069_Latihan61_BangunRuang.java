/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo.latihan61.bangunruang;

/**
 *
 * @author asus
 * Nama     : Muhamad Rizqi Ramdani
 * Kelas    : PBO2
 * Nim      : 10118069
 * Deskripsi Tugas : Bangun Ruang
 */
public class PBO2_10118069_Latihan61_BangunRuang {
    
    public static void main(String[] args) {
        Bola bola = new Bola() {};
        bola.setJari(7);
        System.out.printf("Hasil Volume Bola = %.1f cm3%n", bola.hitungVolume());
        
        Tabung tabung = new Tabung() {};
        tabung.setJari(10);
        tabung.setTinggi(21);
        System.out.printf("Hasil Volume Tabung = cm3%n", tabung.hitungVolume());
        
        Kerucut kerucut = new Kerucut() {};
        kerucut.setJari(14);
        kerucut.setTinggi(9);
        System.out.printf("Hasil Volume Kerucut = cm3%n", kerucut.hitungVolume());
    }
}
