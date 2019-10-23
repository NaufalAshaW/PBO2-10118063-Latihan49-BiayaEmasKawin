/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118063.latihan49;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Naufal Asha
 * KELAS    : IF-2
 * NIM      : 10118063
 */
public class BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmasKawin ek = new EmasKawin();
        
        System.out.println("------Hitung Emas Kawin------");
        System.out.print("Harga Emas Per Gram : Rp. ");
        ek.setHargaGram(scanner.nextDouble());
        System.out.print("Berat Emas : ");
        ek.setBerat(scanner.nextDouble());
        
        System.out.println("Total yang harus dibayar : Rp. " + ek.hitungTotal());
    }
    
}
