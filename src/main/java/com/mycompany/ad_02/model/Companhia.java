package com.mycompany.ad_02.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Companhia implements Serializable {
    private ArrayList<Cliente> clientes;
    private ArrayList<Tenda> tendas;

    public Companhia(ArrayList<Cliente> clientes, ArrayList<Tenda> tendas) {
        this.clientes = clientes;
        this.tendas = tendas;
    }

    public Companhia() {
        this.clientes = new ArrayList<>();
        this.tendas = new ArrayList<>();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    public void addCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }
    
    public void removeEmpregado(Cliente cliente) {
        this.clientes.remove(cliente);
    }
    
    public void removeEmpregado(int num) {
        Cliente cliente = this.clientes.get(num);
        this.clientes.remove(cliente);
    }

    public ArrayList<Tenda> getTendas() {
        return tendas;
    }

    public void setTendas(ArrayList<Tenda> tendas) {
        this.tendas = tendas;
    }
    
    public void addTenda(Tenda tenda) {
        this.tendas.add(tenda);
    }
    
    public void removeTenda(Tenda tenda) {
        tenda.removeAllEmpregados();
        tenda.removeAllProductos();
        this.tendas.remove(tenda);
    }
    
     public void removeTenda(int num) {
        Tenda tenda = tendas.get(num);
        tenda.removeAllEmpregados();
        tenda.removeAllProductos();
        this.tendas.remove(tenda);
    }
    
    public Tenda getTenda(int tenda) {
        return tendas.get(tenda);
    }
    
    public Tenda getTenda(String nomeTenda, String cidadeTenda) {
        Tenda result = null;
        for(Tenda t : tendas) {
            if(t.getNome().toUpperCase().equals(nomeTenda.toUpperCase()) && 
                t.getCidade().toUpperCase().equals(cidadeTenda.toUpperCase())) {
                result = t;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        String result = "Compañia: \n" ;
        
        result +=  "Clientes: \n";
        
        for(Cliente cliente : clientes) {
            result += cliente.toString();
        }
        
        result +=  "Tendas: \n";
        
        for(Tenda tenda : tendas) {
            result += tenda.toString();
        }
         
        return result;
    }
    
}
