/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Regla_Trapecio;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Héctor Lara 
 */
public class Regla_trapecio {
    public static void main(String[] args) {
        System.out.println("Regla del trapecio.");
        System.out.println("\n Funcion f(x) = 70/(1+x^2)dx \n");
        Scanner lr=new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("#.000");
        float a, b, n, funcion, h, dimen, A=0;
        System.out.println("Ingrese el total de iteraciones: "); n=lr.nextFloat();
        System.out.println("Ingrese límite superior [b]"); b=lr.nextFloat();
        System.out.println("Ingrese límite inferior [a]"); a=lr.nextFloat();
        h=(b-a)/n; A=a;
        System.out.println("Valor de h: "+h);
        int v=(int)n; v+=1;
        float dimension[]=new float[v];
        for (int i = 1; i < (v-1); i++) {
            a+=h;
            dimension[i]=a;
        }
        dimension[0]=A;
        dimension[v-1]=b;
        System.out.println("\n");
        for (int i = 0; i < v; i++) {
            System.out.println("Valor de x"+i+" = "+dec.format(dimension[i]));
        }
        float fi,fa,fb,sum=0,resultado,multiplica;
        //Integral
        for (int i = 0; i < v; i++) {
            fi = 70/(1+(dimension[i]*dimension[i]));
            dimension[i]=fi;
        }
        fa=dimension[0];
        fb=dimension[v-1];
        for (int i = 0; i < v; i++) {
            System.out.println("El valo de: f"+i+"(x) = "+dec.format(dimension[i]));
        }
        for (int i = 1; i < (v-1); i++) {
            multiplica=dimension[i]*2;
            sum+=multiplica;
        }
        System.out.println("\n");
        resultado=((h/2)*(sum+fa+fb));
        System.out.println("Resultado: "+resultado);
    }
}
