package ej3;

import java.util.ArrayList;
import java.util.List;

public class LogicaClientes {

    private List<Cliente> clientes = new ArrayList<>();

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Cliente> getClientesPorLocalidad(Localidad localidad) {
        FiltroClientes filtro = new FiltroLocalidad(localidad);
        return filtro.filtrar(clientes);
    }

    public List<Cliente> getClientesPorNombre(String nombre) {
        FiltroClientes filtro = new FiltroNombre(nombre);
        return filtro.filtrar(clientes);
    }

    public List<Cliente> getClientesConSaldo() {
        FiltroClientes filtro = new FiltroSaldo();
        return filtro.filtrar(clientes);
    }
}
