package com.polinema.tugasbesarkatering;

public class Paket {

    private static String nama_makanan;
    private static String detail_makanan;
    private static String harga_makanan;
    private static int gambar_makanan;

    public static final Paket[] paketmakanan = {
            new Paket("Paket 1", "ISI PAKET : Nasi Uduk, Ayam Goreng, Tempe Bacem, Sambel", "Harga : Rp.30.000,- / porsi", R.drawable.pic1 ),
            new Paket("Paket 2", "ISI PAKET : Nasi Goreng, Ayam Siur, Telur, Kerupuk","Harga : Rp.32.000,- / porsi", R.drawable.pic2 ),
            new Paket("Paket 3", "ISI PAKET : Bakso Telur, Bakso kecil, Mie Kuning, Sambel","Harga : Rp.28.000,- / porsi", R.drawable.pic3) ,
    };
    public Paket(String nama, String detail, String harga,int gambar){
        this.nama_makanan = nama;
        this.detail_makanan = detail;
        this.harga_makanan = harga;
        this.gambar_makanan = gambar;
    }

    public static String getDetail_makanan() {
        return detail_makanan;
    }

    public static String getNama_makanan() {
        return nama_makanan;
    }

    public static String getHarga_makanan() {
        return harga_makanan;
    }

    public static int getGambar_makanan() { return gambar_makanan; }

    @Override
    public String toString() {
        return this.nama_makanan;
    }
}
