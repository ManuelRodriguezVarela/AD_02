package view;

import com.mycompany.ad_02.model.Cliente;
import com.mycompany.ad_02.model.Empregado;
import com.mycompany.ad_02.model.Producto;
import com.mycompany.ad_02.model.Tenda;

public interface IView {
    Cliente altaCliente();
    Empregado altaEmpregado();
    Producto altaProducto();
    Tenda altaTenda();
}
