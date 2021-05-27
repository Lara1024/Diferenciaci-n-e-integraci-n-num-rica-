/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpsonCompuesto;

/**
 *
 * @author Héctor Lara
 */
public class simpson {
    public double f(double x){ 
        return (x*x); 
    }
    
    public double simple(double a, double b){ 
        return ((b-a)/6)*(f(a)+4*f((a+b)/2)+f(b)); 
    }
    
    public double compuesto(double a, double b, long n){ 
        double i=0, suma=0, h=(b-a)/n; 
        while(i<=b){ 
            if (i+h<=b) { 
                suma+=simple(i,i+h); 
            }
            i+=h; }return suma; 
    }
    
    public static void main(String[] args) {
        simpson s=new simpson(); 
        System.out.println("Simpson compuesto: "+s.compuesto(0, 1, 3000)); }
}
