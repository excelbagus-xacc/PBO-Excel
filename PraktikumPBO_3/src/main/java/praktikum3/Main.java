/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan("Hachi", 5);
        kucing.suara();
        kucing.info();
        
        System.out.println();
        
        Hewan anjing = new Hewan("Kuro", 4);
        anjing.suara();
        anjing.info();
        anjing.berlari();
    }
}
