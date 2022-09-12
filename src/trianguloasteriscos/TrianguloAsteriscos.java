/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trianguloasteriscos;

import java.util.Scanner;

/**
 *
 * @author Carolina EM
 */
public class TrianguloAsteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner triangulo= new Scanner(System.in);
        
        System.out.println("Digite un numero entero");
        int numero=triangulo.nextInt();
        int nu2=0;
        
        
        for (int i=0; i<numero; i++) {
        int nu=0;
        while (nu<=nu2){
            System.out.print("*");
            nu++;
        }
        nu2++;
        System.out.println("*");
    }
        
    }
    
}
