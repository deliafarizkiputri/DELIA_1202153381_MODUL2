package com.example.android.delia_1202153381_modul2;

/**
 * Created by Delia farizki on 0018,18/Feb/2018.
 */


public class pilihMenu {
    int foto;
    String nama;
    int harga;
    String komposisi;

    public pilihMenu(int foto, String nama, int harga, String komposisi) {
        this.foto = foto;
        this.nama = nama;
        this.harga = harga;
        this.komposisi = komposisi;
    }

    public int getFoto() {
        return foto;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public String getKomposisi() {
        return komposisi;
    }
}

