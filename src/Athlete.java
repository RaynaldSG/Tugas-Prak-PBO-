/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Raynald Krisnawan
 */
public abstract class Athlete {
    private String nama;
    private int umur;
    private double tinggi;
    private double berat;
    private String jenis;

    Athlete(String nama, int umur, double tinggi, double berat, String jenis) {
        this.nama = nama;
        this.umur = umur;
        this.tinggi = tinggi;
        this.berat = berat;
        this.jenis = jenis;
    }

    void DataAtlit(){
        System.out.println("Data Atlit:");
        System.out.println("Nama Atlit\t: " + nama);
        System.out.println("Umur Atlit\t: " + umur);
        System.out.println("Tinggi Atlit\t: " + tinggi);
        System.out.println("Berat Badan\t: " + berat);
        System.out.println("Atlit\t\t: " + jenis);
    }

    void PerlengkapanAtlit(){
        System.out.println("Tiap Atlit memiliki perlengkapan yang berbeda");
    }

    int JumlahPerlengkapan(){
        return 0;
    }

    String AreaLomba(){
        return "Area untuk para atlit dibedakan berdasarkan keahlian atlit";
    }

    abstract void JenisLomba();

    void SetPrivate(String nama, int umur, double tinggi, double berat, String jenis){
        this.nama = nama;
        this.umur = umur;
        this.tinggi = tinggi;
        this.berat = berat;
        this.jenis = jenis;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getBerat() {
        return berat;
    }

    public String getJenis() {
        return jenis;
    }
}
