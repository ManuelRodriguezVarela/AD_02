package controller;

import com.mycompany.ad_02.model.Companhia;
import com.mycompany.ad_02.model.DaoCopiaSeguridade;
import com.mycompany.ad_02.model.DaoXML;
import com.mycompany.ad_02.model.Empregado;
import com.mycompany.ad_02.model.Producto;
import com.mycompany.ad_02.model.Tenda;
import view.View;
import view.IView;
import com.mycompany.ad_02.utils.LeerSistema;

public class Controller {
    
    public static final String ELIXA_TENDA = "Elixa unha tenda entre 1 e ";
    public static final String NON_EXISTEN_TENDAS = "A operación non se pode levar a cabo non existen tendas";
    public static final String NON_EXISTEN_EMPREGADOS = "A operación non se pode levar a cabo non existen emregados";
    public static final String NON_EXISTEN_CLIENTES = "A operación non se pode levar a cabo non existen clientes";
    public static final String NON_EXISTEN_PRODUCTOS = "A operación non se pode levar a cabo non existen productos";
    public static final String ELIXA_EMPREGADO = "Elixa un empregado entre 1 e ";
    public static final String ELIXA_PRODUCTO = "Elixa unha producto entre 1 e ";
    public static final String OPCION_INCORRECTA = "La opción no existe";
    public static final String ELIXA_CLIENTE = "Elixa un cliente entre 1 e ";
    
    private IView vista = new View();
    private LeerSistema leer = new LeerSistema();
    private DaoCopiaSeguridade copiaSeguridade = new DaoCopiaSeguridade();
    private DaoXML daoXML = new DaoXML();
        
    public void options(int option, Companhia companhia) {
        switch(option) {
            case 1:
                companhia.addTenda(vista.altaTenda());
                break;
            case 2:
                if(!companhia.getTendas().isEmpty()) {
                    String txt = ELIXA_TENDA + companhia.getTendas().size();
                    companhia.removeTenda((leer.leerInt(txt)-1));
                } else {
                    System.out.println(NON_EXISTEN_TENDAS);
                }
                break;
            case 3:
                if(!companhia.getTendas().isEmpty()) {
                    Producto producto = vista.altaProducto();
                    String txt = ELIXA_TENDA + companhia.getTendas().size();
                    companhia.getTendas().get((leer.leerInt(txt)-1)).addProducto(producto);
                } else {
                    System.out.println(NON_EXISTEN_TENDAS);
                }
                break;
            case 4:
                if(!companhia.getTendas().isEmpty()) {
                    String txtTenda = ELIXA_TENDA + companhia.getTendas().size();
                    Tenda tenda = companhia.getTendas().get((leer.leerInt(txtTenda)-1));
                     if(!tenda.getProductos().isEmpty()) {
                        String txtProducto = ELIXA_PRODUCTO + tenda.getProductos().size();
                        tenda.removeProducto((leer.leerInt(txtProducto)-1));
                     } else {
                         System.out.println(NON_EXISTEN_PRODUCTOS);
                     }
                } else {
                    System.out.println(NON_EXISTEN_TENDAS);
                }
                break;
            case 5:
                if(!companhia.getTendas().isEmpty()) {
                    Empregado empregado = vista.altaEmpregado();
                    String txt = ELIXA_TENDA + companhia.getTendas().size();
                    companhia.getTendas().get((leer.leerInt(txt)-1)).addEmpregado(empregado);
                } else {
                    System.out.println(NON_EXISTEN_TENDAS);
                }
                break;
            case 6:
                if(!companhia.getTendas().isEmpty()) {
                    String txtTenda = ELIXA_TENDA + companhia.getTendas().size();
                    Tenda tenda = companhia.getTendas().get((leer.leerInt(txtTenda)-1));
                    if(!tenda.getEmpregados().isEmpty()) {
                        String txtEmpregado = ELIXA_EMPREGADO + tenda.getEmpregados().size();
                        tenda.removeEmpregado((leer.leerInt(txtEmpregado)-1));
                    } else {
                        System.out.println(NON_EXISTEN_EMPREGADOS);
                    }
                } else {
                    System.out.println(NON_EXISTEN_TENDAS);
                }
                break;
            case 7:
                companhia.addCliente(vista.altaCliente());
                break;
            case 8:
                if(!companhia.getClientes().isEmpty()) {
                    String txtTenda = ELIXA_CLIENTE + companhia.getClientes().size();
                    Tenda tenda = companhia.getTendas().get((leer.leerInt(txtTenda)-1));
                    String txtEmpregado = ELIXA_CLIENTE + tenda.getEmpregados().size();
                    tenda.removeEmpregado((leer.leerInt(txtEmpregado)-1));
                } else {
                    System.out.println(NON_EXISTEN_CLIENTES);
                }
                break;
            case 9:
                copiaSeguridade.copiaSeguridade(companhia);
                break;
            case 10:
                daoXML.leerXML("portada.xml");
                break;
            default:
                System.out.println(OPCION_INCORRECTA);
        }

                
    }
}
