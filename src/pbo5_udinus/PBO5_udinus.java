/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo5_udinus;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class PBO5_udinus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 // TODO code application logic here
        Mahasiswa oMhs = new Mahasiswa();
            oMhs.setNama("Danu Hartanto");
            oMhs.setNim("A11.2017.10606");
            oMhs.setQuiz(100);
            oMhs.setUts(100);
            oMhs.setUas(100);
 
        
        for(int i=1;i<=1;i++){
            System.out.println("Nama ke "+i+"\t= "+oMhs.getNama());
        }
        for(int j=1;j>=1;j--){
            System.out.println("Nim ke "+j+"\t= "+oMhs.getNim());
        }
        System.out.println("\n");
        
        double nAkhir=oMhs.getNilaiAkhir(oMhs.getQuiz(), oMhs.getUts(), oMhs.getUas());
        
        System.out.println("Quiz : "+oMhs.getQuiz());
        System.out.println("UTS : "+oMhs.getUts());
        System.out.println("UAS : "+oMhs.getUas());
        System.out.println("\n");
        System.out.println("Nilai Akhir = "+nAkhir);
        System.out.println("\n");
        oMhs.getIndexNilai(nAkhir);
    }
    
}