/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ad_02.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manu
 */
public class DaoCompanhia {
    
    public Companhia getCompanhiaFromFile(File file) {
        Companhia entidad = null;
        BufferedReader buferEntrada;
        
        try {
            //Creamos un fluxo de entrada para o arquivo
            FileReader fluxoDatos = new FileReader(file);
            //Creamos o bufer de entrada
            buferEntrada = new BufferedReader(fluxoDatos);
            //Imos lendo linea a linea
            StringBuilder jsonBuilder = new StringBuilder();
            String linea;
            while ((linea=buferEntrada.readLine()) != null) {
                jsonBuilder.append(linea).append("\n");
            }

            //Construimos o String con todalas lineas lidas
            String json = jsonBuilder.toString();

            //Pasamos o json a clase ca cal se corresponde
            Gson gson = new Gson();
            entidad = gson.fromJson(json, Companhia.class);
             //Temos que cerrar sempre o ficheiro
            buferEntrada.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(DaoCompanhia.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        return entidad;
    }
    
    public void writeJsonInFile(Companhia entidad, File file) {
        
        //Pasamos a nosa clase a JSON utilizando a libreria GSON
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(entidad);

        try {
            //Creamos o fluxo de saida
            FileWriter fluxoDatos;
            fluxoDatos = new FileWriter(file);
            BufferedWriter buferSaida = new BufferedWriter(fluxoDatos);
            buferSaida.write(json);
            //Cerramos o arquivo
            buferSaida.close();
        
        } catch (IOException ex) {
            Logger.getLogger(DaoCompanhia.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
}
