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
class Siswa {
    private String tugas;
    private String tempat;
    
    //konstruktor
    public Siswa (String tugas, String tempat){
        this.tugas=tugas;
        this.tempat=tempat;
    }
    //metode
    public void info(){
        System.out.println("Tugas : "+this.tugas);
        System.out.println("Tempat : "+this.tempat);
    }
}
