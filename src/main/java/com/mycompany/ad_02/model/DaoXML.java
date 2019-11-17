package com.mycompany.ad_02.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class DaoXML {
    public void leerXML(String file) {
        XMLReader procesadorXML = null;
        
        try {

            //Creamos un parseador de texto para clase itemXML 
            procesadorXML = XMLReaderFactory.createXMLReader();
            ItemsXML itemsXML = new ItemsXML();
            procesadorXML.setContentHandler(itemsXML);

            //Indicamos o texto donde estan gardadas os items
            InputSource arquivo = new InputSource(file);
        
            procesadorXML.parse(arquivo);

            //Imprimimos os datos lidos no XML
            ArrayList<Item> items = itemsXML.getItems();
            for(Item item : items) {
                System.out.println(item.toString());
            }
        } catch (IOException ex) {
            Logger.getLogger(DaoXML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(DaoXML.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
        
}
