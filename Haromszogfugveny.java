/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haromszogfugveny;

/**
 *
 * @author Márk
 */
public class Haromszogfugveny {
    static double szamitKerulet(double a, double b, double c){
        return a+b+c;
    }
    static double szamitTerulet(double a, double m){
        return (a*m) /2.0;
    }
        
    static double szamitTerulet2(double a, double b, double c){
        double s=(a+b+c) /2.0;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Haromszog kerület terület szamító program! Juhasz Mark 113C");
        
        System.out.printf("Kerület: %.2f\n", szamitKerulet(30, 35, 40) );
        System.out.printf("Terület: %.2f\n", szamitTerulet(30, 35) );
        System.out.printf("Terület: %.2f\n",szamitTerulet2(30, 35, 40) );
    }
    
}
