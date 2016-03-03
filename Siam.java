/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author guest-9LxYnN
 */
import java.util.Scanner;
public class Siam {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        DataSiam data1 = new DataSiam();
        System.out.println("======================");
        System.out.println("Data SIAM");
        System.out.println("======================");
        System.out.print("Nama      : ");
        data1.setNama(masuk.nextLine());
        System.out.print("NIM       : ");
        data1.setNIM(masuk.nextLine());
        System.out.print("IP        : ");
        data1.setIP(masuk.nextDouble());
        System.out.print("Jurusan   : ");
        data1.setJurusan(masuk.next());
        System.out.println("=====================");
    }
}
