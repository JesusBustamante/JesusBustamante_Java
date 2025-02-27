package baloncesto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    
    private List<Partido> partidos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    
    public void registrarPartido() {
        
        System.out.println("\n--- MENÚ DE REGISTRO ---\n");
        
        System.out.println("Ingrese el tipo de partido:\n1. Partido de liga\n2. Partido PlayOffs");
        System.out.print("Seleccione: ");
        int tipo = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Equipo local: ");
        String equipoLocal = sc.nextLine();
        
        System.out.print("Equipo visitante: ");
        String equipoVisitante = sc.nextLine();
        
        System.out.print("Fecha del partido(YYYY-MM-DD): ");
        String fechaPartidoStr = sc.nextLine();
        LocalDate fechaPartido = LocalDate.parse(fechaPartidoStr, DateTimeFormatter.ISO_LOCAL_DATE);
        
        String estado = "En juego";
        
        Partido partido;
        
        if(tipo == 1) {
            System.out.print("Jornada del partido: ");
            int jornada = sc.nextInt();
            sc.nextLine();
            
            partido = new PartidoLiga(jornada, equipoLocal, equipoVisitante, fechaPartido, estado);
        } else if (tipo == 2) {
            System.out.print("Ronda del partido (octavos, cuartos, final): ");
            String ronda = sc.nextLine();

            partido = new PartidoPlayOffs(ronda, equipoLocal, equipoVisitante, fechaPartido, estado);
        } else {
            System.out.println("Opción no válida.");
            return;
        }
        
        partidos.add(partido);
        System.out.println("Partido registrado exitosamente.");
    }
   
    public void finalizarPartido() {
        System.out.print("Ingrese el índice del partido a finalizar: ");
        int indice = sc.nextInt();
        sc.nextLine();
        
        if (indice >= 0 && indice < partidos.size()) {
            Partido partido = partidos.get(indice);
            partido.finalizacionPartido();
        } else {
            System.out.println("Índice no válido.");
        }
    }
    
    public void mostrarGanador() {
        System.out.print("Ingrese el índice del partido: ");
        int indice = sc.nextInt();
        sc.nextLine();
        
        if (indice >= 0 && indice < partidos.size()) {
            Partido partido = partidos.get(indice);
            System.out.println("El ganador es: " + partido.obtenerGanador());
        } else {
            System.out.println("Índice no válido.");
        }
    }
    
    public void mostrarInformacionPartido() {
        System.out.print("Ingrese el índice del partido: ");
        int indice = sc.nextInt();
        sc.nextLine();
        
        if (indice >= 0 && indice < partidos.size()) {
            Partido partido = partidos.get(indice);
            System.out.println("Equipo local: " + partido.getEquipoLocal());
            System.out.println("Equipo visitante: " + partido.getEquipoVisitante());
            System.out.println("Cestas equipo local: " + partido.getCestasEquipoLocal());
            System.out.println("Cestas equipo visitante: " + partido.getCestasEquipoVisitante());
            System.out.println("Fecha del partido: " + partido.getFechaPartido());
            System.out.println("Estado: " + partido.getEstado());
            System.out.println(partido.obtenerResultado());
        } else {
            System.out.println("Índice no válido.");
        }
    }
    
    public void registrarPuntos() {
        System.out.print("Ingrese el índice del partido: ");
        int indice = sc.nextInt();
        sc.nextLine();
        
        if (indice >= 0 && indice < partidos.size()) {
            Partido partido = partidos.get(indice);
            
            if (partido.getEstado().equals("En juego")) {
                System.out.print("Ingrese los puntos para el equipo local (" + partido.getEquipoLocal() + "): ");
                int puntosLocal = sc.nextInt();
                sc.nextLine();
                
                System.out.print("Ingrese los puntos para el equipo visitante (" + partido.getEquipoVisitante() + "): ");
                int puntosVisitante = sc.nextInt();
                sc.nextLine();
                
                partido.registrarPuntosLocales(puntosLocal);
                partido.registrarPuntosVisitantes(puntosVisitante);
                
                System.out.println("Puntos registrados exitosamente.");
                System.out.println(partido.obtenerResultado());
            } else {
                System.out.println("El partido ya ha finalizado, no se pueden registrar más puntos.");
            }
        } else {
            System.out.println("Índice no válido.");
        }
    }
    
    public void mostrarMenu() {
        while (true) {
            System.out.println("\n--- MENÚ PRINCIPAL ---\n");
            System.out.println("1. Registrar partido");
            System.out.println("2. Finalizar partido");
            System.out.println("3. Mostrar ganador");
            System.out.println("4. Mostrar información del partido");
            System.out.println("5. Registrar puntos");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();
            
            switch (opcion) {
                case 1:
                    registrarPartido();
                    break;
                case 2:
                    finalizarPartido();
                    break;
                case 3:
                    mostrarGanador();
                    break;
                case 4:
                    mostrarInformacionPartido();
                    break;
                case 5:
                    registrarPuntos();
                    break;
                case 6:
                    System.out.println("Saliendo del sistema...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
    
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.mostrarMenu();
    }
}
