
package com.mycompany.ad_02;

import com.mycompany.ad_02.model.Companhia;
import com.mycompany.ad_02.model.DaoCompanhia;
import controller.Controller;
import java.io.File;
import com.mycompany.ad_02.utils.LeerSistema;
import com.mycompany.ad_02.utils.Menu;

public class AD02 {

    public static void main(String[] args) {
        Controller controller = new Controller();
        LeerSistema leer = new LeerSistema();
        File file = new File("data.json");
        Companhia companhia;
        DaoCompanhia daoFile = new DaoCompanhia();
        
        boolean salir = false;
        
        if(file.exists()) {
            companhia = daoFile.getCompanhiaFromFile(file);
        } else {
            companhia = new Companhia();
        }
        
        while(!salir) {
            int opcion = leer.leerInt(Menu.printMenu());
            if(opcion == 11) {
                salir = true;
            } else {
                controller.options(opcion, companhia);
            }
        }
        
        daoFile.writeJsonInFile(companhia, file);
        
        System.out.println(Menu.SALIR_PROGRAMA);
        
    }
    
}
