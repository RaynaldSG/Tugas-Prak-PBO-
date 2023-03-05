/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Raynald Krisnawan
 */
public class Runner extends Athlete implements Rules{
    Runner(String nama, int umur, double tinggi, double berat, String jenis) {
        super(nama, umur, tinggi, berat, jenis);
    }

    @Override
    void PerlengkapanAtlit(){
        System.out.println("1. Sepatu Lari\n2. Baju Lari\n3. Celana Lari\n4. Botol Minum\n5. Ikat Rambut (Opsional)\n6. Pelindung Pergelangan");
    }

    @Override
    int JumlahPerlengkapan(){
        return 6;
    }

    @Override
    String AreaLomba(){
        return "Lapangan Lari UPNYK Kampus 3";
    }

    @Override
    void JenisLomba() {
        System.out.println("Jenis-Jenis Lomba Lari adalah sebagai berikut: ");
        System.out.println("1. Lari 100 Meter\n2. Lari 500 Meter\n3. Marathon");
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
            gol = "1";
        }
        else if(bmi > 24.9){
            gol = "3";
        }
        else{
            gol = "2";
        }

        return gol;
    }

    @Override
    public void WaktuTanding() {
        String gol;

        gol = Golongan();

        if(gol == "1"){
            System.out.println("Lari 100 Meter: Senin, 29 Mei 2023");
            System.out.println("Lari 500 Meter: Senin, 5 Juni 2023");
            System.out.println("Marathon      : Senin, 12 Juni 2023");
        }
        else if(gol == "2"){
            System.out.println("Lari 100 Meter: Selasa, 30 Mei 2023");
            System.out.println("Lari 500 Meter: Selasa, 6 Juni 2023");
            System.out.println("Marathon      : Selasa, 13 Juni 2023");
        }
        else{
            System.out.println("Lari 100 Meter: Rabu, 31 Mei 2023");
            System.out.println("Lari 500 Meter: Rabu, 7 Juni 2023");
            System.out.println("Marathon      : Rabu, 14 Juni 2023");
        }
    }

    @Override
    public void PerhitunganPoint() {
        System.out.println("Juara 1: 10 Point");
        System.out.println("Juara 2: 7 Point");
        System.out.println("Juara 3: 5 Point");
    }
    
}
