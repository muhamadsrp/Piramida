/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.piramida_angka;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Piramid2 {
    public static void main(String args[]){
        
       Scanner m=new Scanner(System.in);
       int i,j,k,n;
       System.out.print("Masukan jumlah baris: ");
       n=m.nextInt();

        for (i = 0; i <= n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.printf(" ");
            }
            for ( k = n; k >= i; k--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
