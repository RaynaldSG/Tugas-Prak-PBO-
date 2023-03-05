/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Raynald Krisnawan
 */
public class Swimmer extends Athlete implements Rules{
    Swimmer(String nama, int umur, double tinggi, double berat, String jenis) {
        super(nama, umur, tinggi, berat, jenis);
    }
    
    @Override
    void PerlengkapanAtlit(){
        System.out.println("1. Seragam Renang\n2. Kacamata Renang\n3. Topi Renang\n4. Handuk\n5. Penutup Telinga");
    }

    @Override
    int JumlahPerlengkapan(){
        return 5;
    }

    @Override
    String AreaLomba(){
        return "Kolam Renang Internasional Kalasan";
    }

    @Override
    void JenisLomba() {
        System.out.println("Jenis-Jenis Lomba Renang adalah sebagai berikut: ");
        System.out.println("1. Renang Gaya Bebas\n2. Renang Gaya Dada\n3. Lompat Indah\n4. Renang Gaya Kupu-Kupu");
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
            gol = "A";
        }
        else if(bmi > 24.9){
            gol = "C";
        }
        else{
            gol = "B";
        }

        return gol;
    }

    @Override
    public void WaktuTanding() {
        String gol;

        gol = Golongan();

        if(gol == "A"){
            System.out.println("Ronde 1: Minggu, 28 Mei 2023");
            System.out.println("Ronde 2: Minggu, 4 Juni 2023");
            System.out.println("Ronde 3: Minggu, 11 Juni 2023");
        }
        else if(gol == "B"){
            System.out.println("Ronde 1: Sabtu, 27 Mei 2023");
            System.out.println("Ronde 2: Sabtu, 3 Juni 2023");
            System.out.println("Ronde 3: Sabtu, 10 Juni 2023");
        }
        else{
            System.out.println("Ronde 1: Jumat, 26 Mei 2023");
            System.out.println("Ronde 2: Jumat, 2 Juni 2023");
            System.out.println("Ronde 3: Jumat, 9 Juni 2023");
        }
    }

    @Override
    public void PerhitunganPoint() {
        System.out.println("Juara 1: 25 Point");
        System.out.println("Juara 2: 20 Point");
        System.out.println("Juara 3: 15 Point");
    }

}
