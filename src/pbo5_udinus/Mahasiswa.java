/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo5_udinus;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
class Mahasiswa {
  private double quiz, uts, uas, nAkhir;
    private char index=0;
    private String nama, nim, keterangan;
    
    public double getQuiz() {
        return quiz;
    }

    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }
    public double getUas() {
        return uas;
    }
    public void setUas(double uas) {
        this.uas = uas;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama=nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    
    double getNilaiAkhir(double quiz,double uts,double uas){
        nAkhir=(0.2*quiz)+(0.3*uts)+(0.5*uas);
        return nAkhir;
    }
    public void getIndexNilai(double nAkhir){
        
        if (nAkhir>=80){
            index='A';
            keterangan="SangatBaik";
        }
        else if(nAkhir>=68){
            index='B';
            keterangan="Baik";
        }
        else if(nAkhir>=56){
            index='C';
            keterangan="Cukup";
        }
        else if(nAkhir>=45){
            index='D';
            keterangan="Kurang";
        }
        else if(nAkhir<=45){
            index='E';
            keterangan="Sangat Kurang";
        } 
        
        System.out.println("Index = "+index);
        System.out.println("Keterangan = "+keterangan);
        
    }
    }