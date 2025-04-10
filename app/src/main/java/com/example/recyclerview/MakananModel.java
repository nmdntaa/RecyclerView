package com.example.recyclerview;

public class MakananModel {
    private String namaMakanan;
    private String asalMakanan;

    private String hargaMakanan;

    private int gambarMakanan;

    public MakananModel(String namaMakanan, String asalMakanan, String hargaMakanan, int gambarMakanan){
        this.namaMakanan = namaMakanan;
        this.hargaMakanan = hargaMakanan;
        this.asalMakanan = asalMakanan;
        this.gambarMakanan = gambarMakanan;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public String getHargaMakanan() {
        return hargaMakanan;
    }

    public String getAsalMakanan() {
        return asalMakanan;
    }

    public int getGambarMakanan() {
        return gambarMakanan;
    }
}
