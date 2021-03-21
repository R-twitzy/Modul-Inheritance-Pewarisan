/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author LENOVO
 */
public class Konstruktor {
    public static void main (String[]args){
        System.out.println("=====Piket Hari Ini=====");
        Piket siswa1=new Piket("Menyapu", "Halaman Kelas", "30 menit");
        siswa1.info();
    }
}
