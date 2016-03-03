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
import java.util.Scanner;

public class MainMobilInter {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        //buat Object 1
        System.out.println("================");
        System.out.println("Buat mobil");
        Mobil m1 = new Mobil();
        System.out.println("================");
        System.out.print("Manufaktur : ");
        m1.setManufaktur(masuk.nextLine());
        System.out.print("No. Plat   : ");
        m1.setNoPlat(masuk.nextLine());
        System.out.print("Warna      : ");
        m1.setWarna(masuk.nextLine());
        System.out.print("Kecepatan  : ");
        m1.setKecepatan(masuk.nextInt());
        System.out.println("================");
        m1.displayMessage();
        System.out.println("================");
        
        //buat Object 2
        System.out.println("================");
        System.out.println("Buat mobil");
        Mobil m2 = new Mobil();
        System.out.println("================");
        System.out.print("Manufaktur : ");
        m2.setManufaktur(masuk.next());
        System.out.print("No. Plat   : ");
        m2.setNoPlat(masuk.next());
        System.out.print("Warna      : ");
        m2.setWarna(masuk.next());
        System.out.print("Kecepatan  : ");
        m2.setKecepatan(masuk.nextInt());
        System.out.println("================");
        m2.displayMessage();
        System.out.println("================");

    }
}
