package sih;

import java.util.List;

public class Equipo {
    
    private Doctor lider;
    private List<Doctor> doctoresAsociados;

    public Equipo(Doctor lider, List<Doctor> doctoresAsociados) {
        this.lider = lider;
        this.doctoresAsociados = doctoresAsociados;
    }
    
}
