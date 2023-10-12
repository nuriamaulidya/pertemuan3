/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author pc4
 */
public class Pertemuan3 {
    int alas = 3;
    int tinggi = 9;
    int luas;
    
    void hitungLuasJajarGenjang(){
        int luas = alas*tinggi;
        System.out.println("Alas = " + alas);
        System.out.println("Tinggi = " + tinggi);
        
        System.out.println("LuasJajarGenjang = " + luas);
    }

    public static void main(String[] args) {
        Pertemuan3 P = new Pertemuan3();
        P.hitungLuasJajarGenjang();
        
    }
    
}
