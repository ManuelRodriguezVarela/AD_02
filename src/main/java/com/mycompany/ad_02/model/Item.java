/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ad_02.model;

/**
 *
 * @author manu
 */
public class Item {
    private String title;

    public Item(String title) {
        this.title = title;
    }

    public Item() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Titular: " + title + '\n';
    }
    
    
    
}
