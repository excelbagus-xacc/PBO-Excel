/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xcel_tugas3;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Mercedes", "Mazda", 2022, "Hitam");
        Mobil mobil2 = new Mobil("Honda", "Civic", 2023, "Putih");

        System.out.println("Informasi Mobil 1");
        mobil1.startEngine();
        mobil1.displayInfo();

        System.out.println();

        System.out.println("Informasi Mobil 2");
        mobil2.startEngine();
        mobil2.displayInfo();

        System.out.println();

        System.out.println("Perubahan Warna Mobil 1");
        mobil1.setWarna("Merah");
        mobil1.displayInfo();
    }
}
