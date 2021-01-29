/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahf_0128_tombkiiratasmetodus;

/**
 *
 * @author szark
 */
public class Javahf_0128_tombkiiratasMetodus {
 private static void kiir(int[] tomb){
    for (int i = 0; i < tomb.length; i++) {
        System.out.print(String.format("%,3d",tomb[i])+" ");
    }
        System.out.println("");
 }
 private static void feltolt(int[] tomb){
    for (int i = 0; i < tomb.length; i++) {
        tomb[i] = (int) (Math.random()*200)-100;
    }
 }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int elemszam = 10;
        int tomb1[] = new int [elemszam];
        int tomb2[] = new int [elemszam];
        int tomb3[] = new int [elemszam];
       
        feltolt(tomb1);
        feltolt(tomb2);
        feltolt(tomb3);
   
        System.out.println("Az első tömb eleme(i: ");
        kiir(tomb1);
        System.out.println("A második tömb eleme(i): ");
        kiir(tomb2);
        System.out.println("A harmadik tömb eleme(i): ");
        kiir(tomb3);
    }  
}