package baloncesto;

import java.time.LocalDate;

public class PartidoLiga extends Partido{
    
    private int jornada;

    public PartidoLiga(int jornada, String equipoLocal, String equipoVisitante, int cestasEquipoLocal, int cestasEquipoVisitante, boolean finalizacion, LocalDate fechaPartido) {
        super(equipoLocal, equipoVisitante, cestasEquipoLocal, cestasEquipoVisitante, finalizacion, fechaPartido);
        this.jornada = jornada;
    }

    public PartidoLiga(int jornada, String equipoLocal, String equipoVisitante, LocalDate fechaPartido, String estado) {
        super(equipoLocal, equipoVisitante, fechaPartido, estado);
        this.jornada = jornada;
    }

    public int getJornada() {
        return jornada;
    }
    
}
