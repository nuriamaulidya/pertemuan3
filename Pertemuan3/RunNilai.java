/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author lenovo
 */
public class RunNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MasteNilaiMahasiswa Nilai = new MasteNilaiMahasiswa();
        System.out.println("Program Menghitung Nilai Mahasiswa");
        
        Nilai.HitungNilai(96,"Nuria",1001);
        System.out.println(Nilai.HItungNilai(68,"Maulidya",1002));
        
        MasteNilaiMahasiswa.HITungNilai(81,"Rahma", 1003);
        System.out.println(MasteNilaiMahasiswa.HITUngNilai(42,"Wakhid",1004));
    }
    
}
