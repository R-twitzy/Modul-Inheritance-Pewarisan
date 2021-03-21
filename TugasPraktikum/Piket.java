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
class Piket extends Siswa{
    private String Durasi;
    //konstruktor
    public Piket (String tugas, String tempat, String Durasi ){
        super(tugas, tempat);
        this.Durasi=Durasi;
    }
    //metode
    public void info(){
        System.out.println("Durasi : "+this.Durasi);
        super.info();
    }
}
