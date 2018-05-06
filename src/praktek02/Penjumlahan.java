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
public class Penjumlahan {
    int a;
    int b;

    public Penjumlahan() {
        a=6;
        b=3;
    }
    
    void CetakInfo(){
        System.out.println("==============");
        System.out.println("a :"+a);
        System.out.println("b :"+b);
        System.out.println("==============");
    }
    
    int hasil(){
        int jumlah;
        jumlah=a*b;
        return jumlah;
    }
    
    void cetakjumlah(){
        System.out.println("Hasilnya adalah : "+hasil());
       
    }
}

