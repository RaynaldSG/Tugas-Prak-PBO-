/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Raynald Krisnawan
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama, jenis;
        int umur, pil = 0;
        double tinggi, berat;
        Scanner scan = new Scanner(System.in);
        Athlete atlit = null;
        MenuHelper helper = null;
        boolean cek;
        char menu = 'n';

        do{
            try{
                cek = true;
                System.out.println("Masukkan Data Atlit: ");
                System.out.print("Nama\t\t: ");
                nama = scan.nextLine();
                System.out.print("Umur\t\t: ");
                umur = scan.nextInt();
                System.out.print("Tinggi(cm)\t: ");
                tinggi = scan.nextDouble();
                System.out.print("Berat(kg)\t: ");
                berat = scan.nextDouble();
    
                do{
                    System.out.println("Cabang Olahraga Yang Dikuasai:");
                    System.out.println("1. Lari\n2. Renang\n3. Lompat");
                    System.out.print("Pilih: ");
                    pil = scan.nextInt();
                    switch (pil){
                        case 1:
                            jenis = "Runner";
                            atlit = new Runner(nama, umur, tinggi, berat, jenis);
                            break;
                        case 2:
                            jenis = "Swimmer";
                            atlit = new Swimmer(nama, umur, tinggi, berat, jenis);
                            break;
                        case 3:
                            jenis = "Jumper";
                            atlit = new Jumper(nama, umur, tinggi, berat, jenis);
                            break;
                        default:
                            System.out.println("Masukkan Angka Yang Benar");
                            break;
                    }                
                }while(pil < 1 || pil > 3);
            }
            catch(Exception e){
                System.out.println("Masukkan input dengan benar");
                cek = false;
                System.out.println("Press Enter To Continue...");
                scan.nextLine();
                scan.nextLine();
            }
            finally{
                for(int i = 0; i < 20; i++){
                    System.out.println();
                }
            }
        }while(cek == false);

        helper = new MenuHelper(atlit.getNama(), atlit.getUmur(), atlit.getTinggi(), atlit.getBerat(), atlit.getJenis());
        
        do{
            try {
                do{
                    cek = true;
                    System.out.print("Menu\n1. Atlit\n2. Rules\n3. Exit\nPilih: ");
                    pil = scan.nextInt();
                }while(pil < 1 || pil > 3);
            } catch (Exception e) {
                System.out.println("Masukkan input dengan benar");
                cek = false;
                System.out.println("Press Enter To Continue...");
                scan.nextLine();
                scan.nextLine();
                pil = 0;
            }
            finally{
                for(int i = 0; i < 20; i++){
                    System.out.println();
                }
            }
            
            switch (pil){
                case 1:
                    try {
                        do{
                            cek = true;
                            System.out.print("Menu\n1. Data Atlit\n2. Perlengkapan\n3. Exit\nPilih: ");
                            pil = scan.nextInt();
                        }while(pil < 1 || pil > 3);
                    } catch (Exception e) {
                        System.out.println("Masukkan input dengan benar");
                        cek = false;
                        System.out.println("Press Enter To Continue...");
                        scan.nextLine();
                        scan.nextLine();
                        pil = 0;
                    }finally{
                        for(int i = 0; i < 20; i++){
                            System.out.println();
                        }
                    }
    
                    switch (pil) {
                        case 1:
                            atlit.DataAtlit();
                        break;
                        case 2:
                            System.out.println("Perlengkapan Yang Harus Dibawa adalah: ");
                            atlit.PerlengkapanAtlit();
                            System.out.println("Total Perlengkapan adalah: " + atlit.JumlahPerlengkapan());
                        break;
                        default:
                        break;
                    }
    
                    try {
                        cek = true;
                        System.out.print("Kembali Ke Menu? (Y/N): ");
                        menu = scan.next().charAt(0);
                    } catch (Exception e) {
                        System.out.println("Masukkan input dengan benar");
                        cek = false;
                        System.out.println("Press Enter To Continue...");
                        scan.nextLine();
                        scan.nextLine();
                    }finally{
                        for(int i = 0; i < 20; i++){
                            System.out.println();
                        }
                    }
    
                    if(menu == 'y' || menu == 'Y'){
                        cek = false;
                    }
                    else{
                        cek = true;
                    }
                break;
    
                case 2:
                    try {
                        do{
                            cek = true;
                            System.out.print("Menu\n1. Golongan Lomba Anda\n2. Waktu Pertandingan\n3. Tempat Pertandingan\n4. Jenis Lomba\n5. Aturan Poin\n6. Exit\nPilih: ");
                            pil = scan.nextInt();
                        }while(pil < 1 || pil > 6);
                    } catch (Exception e) {
                        System.out.println("Masukkan input dengan benar");
                        cek = false;
                        System.out.println("Press Enter To Continue...");
                        scan.nextLine();
                        scan.nextLine();
                        pil = 0;
                    }finally{
                        for(int i = 0; i < 20; i++){
                            System.out.println();
                        }
                    }
    
                    switch (pil) {
                        case 1:
                            System.out.println("Golongan Lomba Anda Adalah: " + atlit.getJenis() + "-" + helper.GolHel(atlit.getJenis()));
                        break;
                        case 2:
                            System.out.println("Waktu Pertandingan Anda: ");
                            helper.WakHel(atlit.getJenis());
                        break;
                        case 3:
                            System.out.println("Tempat Pertandingan: " + atlit.AreaLomba());
                        break;
                        case 4:
                            atlit.JenisLomba();
                        break;
                        case 5:
                            System.out.println("Aturan poin adalah sebagai berikut:");
                            helper.PoiHel(atlit.getJenis());
                        break;
                        default:
                        break;
                    }
    
                    try {
                        cek = true;
                        System.out.print("Kembali Ke Menu? (Y/N): ");
                        menu = scan.next().charAt(0);
                    } catch (Exception e) {
                        System.out.println("Masukkan input dengan benar");
                        cek = false;
                        System.out.println("Press Enter To Continue...");
                        scan.nextLine();
                        scan.nextLine();
                    }finally{
                        for(int i = 0; i < 20; i++){
                            System.out.println();
                        }
                    }
    
                    if(menu == 'y' || menu == 'Y'){
                        cek = false;
                    }
                    else{
                        cek = true;
                    }
                break;
    
                default:
                break;
            }
            

        }while(cek == false);
        
        scan.close();
    }
    
}
