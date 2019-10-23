/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118063.latihan49;

/**
 *
 * @author 
 * NAMA     : Naufal Asha
 * KELAS    : IF-2
 * NIM      : 10118063
 */
public class EmasKawin {
    private double berat, hargaGram;

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public void setHargaGram(double hargaGram) {
        this.hargaGram = hargaGram;
    }
    
    public double hitungTotal(){
        return berat * hargaGram;
    }
}
