package com.mycompany.ad_02.utils;

import java.util.Scanner;

public class LeerSistema {
    private Scanner teclado = new Scanner(System.in);
    
    public String leerCadena(String texto) {
        String text = "";
        System.out.println(texto);
        text = teclado.nextLine();
        return text;
    }
    
    public long leerLong(String texto) {
        long num = 0;
        System.out.println(texto);
        num = teclado.nextLong();
        return num;
    }
    
    public int leerInt(String texto) {
        int num = 0;
        System.out.println(texto);
        num = teclado.nextInt();
        return num;
    }
    
    public double leerDouble(String texto) {
        double num = 0.0;
        System.out.println(texto);
        num = teclado.nextDouble();
        return num;
    }
}
