package ej3;

import java.util.ArrayList;
import java.util.List;

public class FiltroNombre implements FiltroClientes{
    private String nombre;

    public FiltroNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public List<Cliente> filtrar(List<Cliente> clientes) {
        List<Cliente> filteredList = new ArrayList<>();
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equals(nombre)) {
                filteredList.add(cliente);
            }
        }
        return filteredList;
    }
}
