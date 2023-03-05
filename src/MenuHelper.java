/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Raynald Krisnawan
 */
public class MenuHelper {
    Runner runner;
    Swimmer swimmer;
    Jumper jumper;

    public MenuHelper(String nama, int umur, double tinggi, double berat, String jenis) {
        if(jenis == "Runner"){
            runner = new Runner(nama, umur, tinggi, berat, jenis);
        }
        else if(jenis == "Swimmer"){
            swimmer = new Swimmer(nama, umur, tinggi, berat, jenis);
        }
        else{
            jumper = new Jumper(nama, umur, tinggi, berat, jenis);
        }
    }

    String GolHel(String jenis){
        if(jenis == "Runner"){
            return runner.Golongan();
        }
        else if(jenis == "Swimmer"){
            return swimmer.Golongan();
        }
        else{
            return jumper.Golongan();
        }
    }

    void WakHel(String jenis){
        if(jenis == "Runner"){
            runner.WaktuTanding();
        }
        else if(jenis == "Swimmer"){
            swimmer.WaktuTanding();
        }
        else{
            jumper.WaktuTanding();
        }
    }

    void PoiHel(String jenis){
        if(jenis == "Runner"){
            runner.PerhitunganPoint();
        }
        else if(jenis == "Swimmer"){
            swimmer.PerhitunganPoint();
        }
        else{
            jumper.PerhitunganPoint();
        }
    }
}
