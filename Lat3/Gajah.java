/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat3;

/**
 *
 * @author LENOVO
 */
public class Gajah extends Hewan{
    
    public static void testClassMethod(){
        System.out.println("The Class Method in Hewan...");
    }
    //mengoverride method pada class animal
    public void testInstanceMethod(){
        System.out.println("The Instance Method in Gajah...");
    }
    public static void main(String[]args){
        Gajah myGajah=new Gajah();
        Hewan myHewan=myGajah;
        Hewan.testClassMethod();
        myHewan.testInstanceMethod();
    }
}
