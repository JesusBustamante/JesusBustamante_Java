package baloncesto;

import java.time.LocalDate;

// Clase base
public class Partido {
    
    private String equipoLocal;
    private String equipoVisitante;
    private int cestasEquipoLocal;
    private int cestasEquipoVisitante;
    private boolean finalizacion;
    private LocalDate fechaPartido;
    private String estado;

    public Partido(String equipoLocal, String equipoVisitante, int cestasEquipoLocal, int cestasEquipoVisitante, boolean finalizacion, LocalDate fechaPartido) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.cestasEquipoLocal = cestasEquipoLocal;
        this.cestasEquipoVisitante = cestasEquipoVisitante;
        this.finalizacion = finalizacion;
        this.fechaPartido = fechaPartido;
    }

    public Partido(String equipoLocal, String equipoVisitante, LocalDate fechaPartido, String estado) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.fechaPartido = fechaPartido;
        this.estado = estado;
        this.cestasEquipoLocal = 0;
        this.cestasEquipoVisitante = 0;
        this.finalizacion = false;
    }
    
    public String getEquipoLocal() {
        return equipoLocal;
    }
    
    public String getEquipoVisitante() {
        return equipoVisitante;
    }
    
    public int getCestasEquipoLocal() {
        return cestasEquipoLocal;
    }
    
    public int getCestasEquipoVisitante() {
        return cestasEquipoVisitante;
    }
    
    public boolean getFinalizacion() {
        return finalizacion;
    }
    
    public LocalDate getFechaPartido() {
        return fechaPartido;
    }
    
    public String getEstado() {
        return estado;
    }
    
    // Métodos
    public String obtenerResultado() {
        return "Resultado: " + equipoLocal + " " + cestasEquipoLocal + " - " + cestasEquipoVisitante + " " + equipoVisitante;
    }
    
    public void registrarPuntosLocales(int puntos) {
        if (!finalizacion) {
            cestasEquipoLocal += puntos;
        } else {
            System.out.println("El partido ha finalizado, no se pueden registrar más puntos.");
        }
    }
    
    public void registrarPuntosVisitantes(int puntos) {
        if (!finalizacion) {
            cestasEquipoVisitante += puntos;
        } else {
            System.out.println("El partido ha finalizado, no se pueden registrar más puntos.");
        }
    }
    
    public String obtenerGanador() {
        if (cestasEquipoLocal > cestasEquipoVisitante) {
            return equipoLocal;
        } else if (cestasEquipoVisitante > cestasEquipoLocal) {
            return equipoVisitante;
        } else {
            return "Empate";
        }
    }
    
    public void finalizacionPartido() {
        if (cestasEquipoLocal == cestasEquipoVisitante) {
            System.out.println("El partido está empatado, no se puede finalizar hasta que haya un ganador.");
        } else {
            finalizacion = true;
            estado = "Finalizado";
            System.out.println("Partido finalizado.");
        }
    }
}
