package ej3;

import java.util.ArrayList;
import java.util.List;

public class FiltroSaldo implements FiltroClientes{
    @Override
    public List<Cliente> filtrar(List<Cliente> clientes) {
        List<Cliente> filteredList = new ArrayList<>();
        for (Cliente cliente : clientes) {
            if (cliente.getSaldo() > 0) {
                filteredList.add(cliente);
            }
        }
        return filteredList;
    }
}
