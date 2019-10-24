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
public class Bola implements BangunRuang{
    private int jari;

    public int getJari() {
        return jari;
    }

    public void setJari(int jari) {
        this.jari = jari;
    }

    @Override
    public double hitungVolume(){
        return 4.0/3.0 * 22.0/7.0 * Math.pow(jari, 3);
    }
}
