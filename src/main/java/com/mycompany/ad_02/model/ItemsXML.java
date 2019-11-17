/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ad_02.model;

import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author manu
 */
public class ItemsXML extends DefaultHandler {
    //Aqui imos gardar os datos dos items do XML
    private ArrayList<Item> items;
    //Atributo auxiliar para ir gardando os datos do item no XML
    private Item item;
    private String txt;
    private boolean leer;

    public ItemsXML() {
        super();
    }

    /*
    Este metodo executase ao comezar a ler unha etiqueta
     */
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        //Se atopamos a etiqueta chanel creamos un novo arrayList
        if(qName.equals("channel")){
            this.items = new ArrayList<Item>();
        }
        //Se atopamos a etiqueta item, creamos o obxecto item onde gardaremos os titulares
        else if(qName.equals("item")){
            this.item = new Item();
            leer = true;
        }
    }

    /*
    Este método executase cando se finaliza de ler unha etiqueta
     */
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        //Finalizamos de ler a etiqueta title, polo que podemos gardar o texto que hai entre as etiquetas
        if(qName.equals("title") && leer){
            this.item.setTitle(txt);
        }
        //Finalizamos de ler a etiqueta item, polo que podemos gardar o obxecto ausiliar de Persoa no ArrayList
        else if(localName.equals("item")){
            this.items.add(this.item);
        }
    }

    /*
    Este metodo executase cando se le unha cadea de texto
     */
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        //Gardamos todo o texto entre caracteres na cadea de texto auxiliar
        this.txt = new String(ch,start,length);
    }

    public ArrayList<Item> getItems() {
        return items;
    }
    
}
