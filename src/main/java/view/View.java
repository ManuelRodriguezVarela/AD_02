/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.mycompany.ad_02.model.Cliente;
import com.mycompany.ad_02.model.Empregado;
import com.mycompany.ad_02.model.Producto;
import com.mycompany.ad_02.model.Tenda;
import com.mycompany.ad_02.utils.LeerSistema;

/**
 *
 * @author manu
 */
public class View implements IView {
    private LeerSistema leer = new LeerSistema();
    
    public static final String ALTA_CLIENTE = "ALTA CLIENTE";
    public static final String ALTA_EMPREGADO = "ALTA EMPREGADO";
    public static final String NOME = "Introduzca o nome";
    public static final String APELIDOS = "Introduzca os apelidos";
    public static final String EMAIL = "Introduzca o email";
    public static final String ALTA_PRODUCTO = "ALTA PRODUCTO";
    public static final String IDENTIFICADOR = "Introduzca o identificador";
    public static final String DESCRIPCION = "Introduzca a descripción";
    public static final String PREZO = "Introduzca o prezo";
    public static final String CANTIDADE = "Introduzca a cantidade";
    public static final String ALTA_TENDA = "ALTA TENDA";
    public static final String CIDADE = "Introduzca o cidade";
    
    public Cliente altaCliente() {
        System.out.println(ALTA_CLIENTE);
        String nome = leer.leerCadena(NOME);
        String apelidos = leer.leerCadena(APELIDOS);
        String email = leer.leerCadena(EMAIL);
        Cliente cliente = new Cliente(nome, apelidos, email);
        return cliente;
    }
    
    public Empregado altaEmpregado() {
        System.out.println(ALTA_EMPREGADO);
        String nome = leer.leerCadena(NOME);
        String apelidos = leer.leerCadena(APELIDOS);
        Empregado empregado = new Empregado(nome, apelidos);
        return empregado;
    }
    
    public Producto altaProducto() {
        System.out.println(ALTA_PRODUCTO);
        long identificador = leer.leerInt(IDENTIFICADOR);
        leer.leerCadena("");
        String descripcion = leer.leerCadena(DESCRIPCION);
        double prezo = leer.leerDouble(PREZO);
        int cantidade = leer.leerInt(CANTIDADE);
        Producto producto = new Producto(identificador, descripcion, prezo, cantidade);
        return producto;
    }
    
    public Tenda altaTenda() {
        System.out.println(ALTA_TENDA);
        String nome = leer.leerCadena(NOME);
        String cidade = leer.leerCadena(CIDADE);
        Tenda tenda = new Tenda(nome, cidade);
        return tenda;
    }
    
}
