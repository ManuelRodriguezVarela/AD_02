
package com.mycompany.ad_02.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoCopiaSeguridade {
    public void copiaSeguridade(Companhia companhia) {
        //Vamos comezar declarando o ficheiro
        File arquivo = new File("copiaSeguridade.backup");

        try {

            //Creamos un fluxo de saida para o arquivo
            FileOutputStream fileOut = new FileOutputStream(arquivo);
            ObjectOutputStream fluxoDatos = new ObjectOutputStream(fileOut);
            
            fluxoDatos.writeObject(companhia);
         
            //Temos que cerrar sempre o ficheiro
            fluxoDatos.close();
            
        } catch (IOException ex) {
            Logger.getLogger(DaoCompanhia.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
}
