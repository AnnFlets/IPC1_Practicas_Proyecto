package edu.usac.ipc1.pruebas;

import hilo.Hilo;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Hilo hilo = new Hilo();
    }
}
/*
    //static int tablero[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    public static void main(String[] args) {
        String fecha = "06/11/1965";
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = formato.parse(fecha);
            String fechaFormato = new SimpleDateFormat("yyyy/MM/dd").format(date);
            System.out.println(fechaFormato);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
//System.out.println(calcularDigitos(1));
    //System.out.println(calcularCombinaciones(3,2));

    /*private static int calcularCombinaciones(int n, int m){
        if(n < 2 || m < 2 || m == n){
            return 1;
        }else{
            return ((calcularCombinaciones(n-1, m))+(calcularCombinaciones(n-1, m-1)));
        }
    } */
 /*
    static int calcularDigitos(int numero) {
        int cantidadDigitos = 0;
        while (numero != 0) {
            numero = numero / 10;
            cantidadDigitos++;
        }
        return cantidadDigitos;
    }
 */
 /*static void imprimirPiramide(int filas) {
        if (filas > 0) {
            for (int i = 0; i < filas; i++) {
                for (int espacio = 0; espacio < (filas - i); espacio++) {
                    System.out.print("");
                }
                for (int asterisco = 0; asterisco < (i * 2) - 1; asterisco++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }*/
 /*
    static void imprimirPiramide(int filas) {
        if (filas > 0) {
            for (int i = 1; i <= filas; i++) {
                for (int asterisco = 1; asterisco < (i * 2); asterisco++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
 */
