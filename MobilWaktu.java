/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

/**
 *
 * @author guest-9LxYnN
 */
public class MobilWaktu {
        
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double Waktu;
    
    public void setNoPlat(String s) {
        noPlat = s;
    }
    public void setWarna(String s) {
        warna = s;
    }
    public void setManufaktur(String s) {
        manufaktur = s;
    }
    public void setKecepatan(int i) {
        kecepatan = i;
    }
    public void setWaktu(double b){
        Waktu = b;
    }
    
    public void displayMessage() {
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memililki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan " + kecepatan);
    }
}
