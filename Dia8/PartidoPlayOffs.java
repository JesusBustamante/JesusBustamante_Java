package baloncesto;

import java.time.LocalDate;

public class PartidoPlayOffs extends Partido{
    
    private String ronda;

    public PartidoPlayOffs(String ronda, String equipoLocal, String equipoVisitante, int cestasEquipoLocal, int cestasEquipoVisitante, boolean finalizacion, LocalDate fechaPartido) {
        super(equipoLocal, equipoVisitante, cestasEquipoLocal, cestasEquipoVisitante, finalizacion, fechaPartido);
        this.ronda = ronda;
    }

    public PartidoPlayOffs(String ronda, String equipoLocal, String equipoVisitante, LocalDate fechaPartido, String estado) {
        super(equipoLocal, equipoVisitante, fechaPartido, estado);
        this.ronda = ronda;
    }
    
    public String getRonda() {
        return ronda;
    }
}
