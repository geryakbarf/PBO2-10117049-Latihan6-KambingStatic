/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117049.latihan6.kambingstatic;

/**
 *
 * @author Gery Akbar Fauzi
 * Nama                 : Gery Akbar Fauzi
 * Kelas                : PBO2
 * Nim                  : 10117049
 * Deskripsi Program    : Program ini berisi program menggabungkan dua class
 *                        file yang berbeda
 */
public class KambingStatic {

    //nama kambing sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak "
                            + Mamalia.jumlahKambing + " ekor");
    }
    
}
