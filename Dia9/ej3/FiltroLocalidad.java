package ej3;

import java.util.ArrayList;
import java.util.List;

public class FiltroLocalidad implements FiltroClientes{
    private Localidad localidad;

    public FiltroLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    @Override
    public List<Cliente> filtrar(List<Cliente> clientes) {
        List<Cliente> filteredList = new ArrayList<>();
        for (Cliente cliente : clientes) {
            if (cliente.getLocalidad() == localidad) {
                filteredList.add(cliente);
            }
        }
        return filteredList;
    }
}
