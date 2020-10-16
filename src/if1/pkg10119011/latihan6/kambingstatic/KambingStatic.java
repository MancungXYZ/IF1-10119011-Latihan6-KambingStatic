/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan6.kambingstatic;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda
 *  Kelas   : IF-1
 *  Nim     : 10119011
 */


    public class KambingStatic {
        
        //Nama_Kambing sebagai konstanta
            public static final String NAMA_KAMBING = "SHAUN THE SHEEP";
            
    public static void main(String[] args) {
       Mamalia.jumlahKambing = 485000;
       System.out.print(NAMA_KAMBING + " memiliki kambing sebanyak : " + Mamalia.jumlahKambing);
    }
    
}