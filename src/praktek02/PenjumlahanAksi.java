/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek02;

/**
 *
 * @author Windows 10
 */
public class PenjumlahanAksi {
    public static void main(String[] args) {
        Penjumlahan rl = new Penjumlahan();
        rl.a = 2;
        rl.b = 4;
        
        rl.CetakInfo();
        System.out.println("Hasil Penjumlahan = "+rl.hasil());
        rl.cetakjumlah();
        
        Penjumlahan r2 = new Penjumlahan();
        r2.CetakInfo();
        
        Penjumlahan r3 = new Penjumlahan(10,20);
        r3.CetakInfo();
    }
}
