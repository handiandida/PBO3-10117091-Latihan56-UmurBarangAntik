/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117091.latihan56.umurbarangantik;

/**
 *
 * @author 
 * NAMA  : Dida Handian
 * Kelas : PBO3
 * NIM   : 10117091
 * Deskripsi Tugas : Membuat Program Menentukan Umur Barang Antik
 *  
 */
public class PBO310117091Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    static int umur;
    private static String name;
    
    public static void main(String[] args) {
        Radio radio = new Radio(umur);
        radio.setName("Radio AM");
        System.out.println("Nama barang antik : " + radio.getName());
        BarangAntik barang = new BarangAntik(umur);
        barang.tampilUmur();
    }
    
}
