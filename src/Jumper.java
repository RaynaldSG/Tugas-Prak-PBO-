/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Raynald Krisnawan
 */
public class Jumper extends Athlete implements Rules{
    Jumper(String nama, int umur, double tinggi, double berat, String jenis) {
        super(nama, umur, tinggi, berat, jenis);
    }

    @Override
    void PerlengkapanAtlit(){
        System.out.println("1. Seragam\n2. Handuk\n3. Botol Minum\n4. Sepatu Lompat\n5. Ikat Rambut (Opsional)\n6. Tongkat Lompat (Bagi Yang Mengikuti Lompat Tinggi)\n7. Pelindung Pergelangan");
    }

    @Override
    int JumlahPerlengkapan(){
        return 7;
    }

    @Override
    String AreaLomba(){
        return "Stadion Bola Sleman Sembada";
    }

    @Override
    void JenisLomba() {
        System.out.println("Jenis-Jenis Lomba Lompat adalah sebagai berikut: ");
        System.out.println("1. Lompat Jauh\n2. Lompat Tinggi");
    }

    @Override
    public String Golongan() {
        String gol;
        double tinggi, berat, bmi;

        tinggi = super.getTinggi();
        berat = super.getBerat();
        
        tinggi = tinggi / 100;

        bmi = berat/(tinggi*tinggi);

        if(bmi < 18.5){
            gol = "I";
        }
        else if(bmi > 24.9){
            gol = "III";
        }
        else{
            gol = "II";
        }

        return gol;
    }

    @Override
    public void WaktuTanding() {
        String gol;

        gol = Golongan();

        if(gol == "A"){
            System.out.println("Lompat Jauh   : Kamis, 25 Mei 2023");
            System.out.println("Lompat Tinggi : Rabu, 24 Mei 2023");
        }
        else if(gol == "B"){
            System.out.println("Lompat Jauh   : Kamis, 25 Mei 2023");
            System.out.println("Lompat Tinggi : Rabu, 24 Mei 2023");
        }
        else{
            System.out.println("Lompat Jauh   : Kamis, 25 Mei 2023");
            System.out.println("Lompat Tinggi : Rabu, 24 Mei 2023");
        }
    }

    @Override
    public void PerhitunganPoint() {
        System.out.println("Juara 1: 100 Point");
        System.out.println("Juara 2: 75 Point");
        System.out.println("Juara 3: 50 Point");
    }
    
}
