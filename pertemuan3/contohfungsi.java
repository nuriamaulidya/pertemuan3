/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author pc4
 */
public class contohfungsi {
    int alas = 10;
    int tinggi = 5;
    
    int hitungLuasJajarGenjang(){
        int luas = alas*tinggi;
        return luas;
    }

    public static void main(String[] args) {
        contohfungsi F = new contohfungsi();
        System.out.println(" Luas Jajar Genjang = " + F.hitungLuasJajarGenjang());
    }
    
}
