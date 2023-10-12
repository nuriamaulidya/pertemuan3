/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author pc4
 */
public class MasterBangunDatar {
    void hitungLuasJajarGenjang(int alas, int tinggi){
        int luas = alas*tinggi;
        System.out.println("Luas " + luas);
        System.out.println("Tinggi " + tinggi);
        System.out.println("Luas " + luas);
    }
    int LuasJajarGenjang(int alas, int tinggi){
        int luas = alas*tinggi;
        System.out.println(" Alas " + alas);
        System.out.println("Tinggi " + tinggi);
        return luas;
    }
    static void JajarGenjang(int alas, int tinggi ) {
        int luas = alas*tinggi;
        System.out.println("Alas " + alas);
        System.out.println("Tinggi " + tinggi );
        System.out.println("Luas = "+ luas);
    }
    static int JajarGenjangLuas (int alas, int tinggi){
        int luas = alas*tinggi;
        System.out.println("Alas " + alas);
        System.out.println("Tinggi " + tinggi);
        return luas;
    }
}
