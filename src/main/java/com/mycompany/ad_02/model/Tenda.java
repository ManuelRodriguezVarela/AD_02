package com.mycompany.ad_02.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Tenda implements Serializable {
    private String nome;
    private String cidade;
    private ArrayList<Producto> productos;
    private ArrayList<Empregado> empregados;

    public Tenda(String nome, String cidade, ArrayList<Producto> Productos, ArrayList<Empregado> Empregados) {
        this.nome = nome;
        this.cidade = cidade;
        this.productos = Productos;
        this.empregados = Empregados;
    }

    public Tenda(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
        this.productos = new ArrayList<>();
        this.empregados = new ArrayList<>();
    }

    public Tenda() {
    }    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    public void addProducto(Producto producto) {
        this.productos.add(producto);
    }
    
    public void removeProducto(Producto producto) {
        this.productos.remove(producto);
    }
    
    public void removeProducto(int num) {
        this.productos.remove(num);
    }
    
    public void removeAllProductos() {
        this.productos.clear();
    }

    public ArrayList<Empregado> getEmpregados() {
        return empregados;
    }

    public void setEmpregados(ArrayList<Empregado> empregados) {
        this.empregados = empregados;
    }
    
    public void addEmpregado(Empregado empregado) {
        this.empregados.add(empregado);
    }
    
    public void removeEmpregado(Empregado empregado) {
        this.empregados.remove(empregado);
    }
    
    public void removeEmpregado(int num) {
        this.empregados.remove(num);
    }
    
    public void removeAllEmpregados() {
        this.empregados.clear();
    }

    @Override
    public String toString() {
        String result = "Tenda: " + "Nome: " + nome + ", Cidade: " + cidade + "\nProductos: \n" ;
        
        for(Producto producto : productos) {
            result += producto.toString();
        }
        
        result +=  "Productos: \n";
        
        for(Empregado empregado : empregados) {
            result += empregado.toString();
        }
         
        return result;
    }
   
    
}
