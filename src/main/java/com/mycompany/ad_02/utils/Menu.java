package com.mycompany.ad_02.utils;

import com.mycompany.ad_02.model.Companhia;

public class Menu {
    
    private static String MENU_TIENDAS = 
        "Eliga de entre la siguientes opciones" +
        "\nIntroduza 1 para engadir unha tenda." +
        "\nIntroduza 2 para eliminar unha tenda." +
        "\nIntroduza 3 para engadir un producto a tenda." +
        "\nIntroduza 4 para eliminiar un producto a tenda." +
        "\nIntroduza 5 para engadir un empregado a tenda." +
        "\nIntroduza 6 para eliminar un empregado a tenda." +
        "\nIntroduza 7 para engadir un cliente." +
        "\nIntroduza 8 para eliminar un cliente." +
        "\nIntroduza 9 para crear unha copia de seguriadade dos datos." +
        "\nIntroduza 10 ler os titulares do periódico El País." +
        "\nIntroduza 11, para sair do programa";
    
    public static final String SALIR_PROGRAMA = "Va a salir del pograma";
    
    public static String printMenu() {
        return MENU_TIENDAS;
    }
    
}
