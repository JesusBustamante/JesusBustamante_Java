package campuslands_bustamantejesus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class CampusLands_BustamanteJesus {

    static ArrayList<Campers> camper = new ArrayList<>();
    static ArrayList<sesiones> sesion = new ArrayList<>();
    static ArrayList<Trainers> trainer = new ArrayList<>();
    static ArrayList<notaModulo> modulo = new ArrayList<>();
    static List<pruebaInicial> nota = new CopyOnWriteArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Campers camper1 = new Campers(1258502, "Jesus", "Bustamante Ramirez", "Buenos Aires", "3156611676", "Ingrid Ramirez", "Pedro Gomez", "Java", LocalDate.of(2024, 3, 1), LocalDate.of(2024, 7, 1));
        camper.add(camper1);

        Campers camper2 = new Campers(3245678, "Luis", "Perez Lopez", "Malos Aires", "3154441676", "Rosa Angulo", "Inscrito");
        camper.add(camper2);

        Trainers trainer1 = new Trainers(31972561, "Pedro", "Gomez", "12345");
        trainer.add(trainer1);

        pruebaInicial nota1 = new pruebaInicial(1234567, "Javier", "Gutierrez", "Pueba Inicial", 80.0, "Aprobado");
        nota.add(nota1);
        int option;

        System.out.println("Bienvenido a plataforma CampusLands");
        System.out.println("");
        System.out.println("Elige tu cargo para iniciar sesión");
        System.out.println("1. Coordinador");
        System.out.println("2. Docente");
        System.out.println("3. Estudiante");
        System.out.println("4. Salir");

        System.out.print("\nSeleccione: ");
        option = sc.nextInt();
        sc.nextLine();
        System.out.println("");
        switch (option) {
            case 1 ->
                coordinador();
            case 2 ->
                docente();
            case 3 ->
                estudiante();
            case 4 ->
                System.out.println("Saliendo...");
            default ->
                System.out.println("Opción inválida.");
        }
    }

    public static void limpiar() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void coordinador() {
        String user = "Jesus";
        String password = "12345";

        System.out.print("Ingrese su usuario: ");
        String usuario = sc.nextLine();

        System.out.print("\nIngrese su contraseña: ");
        String contrasena = sc.nextLine();

        if (user.equals(usuario) && password.equals(contrasena)) {
            System.out.println("\n Elige una opción: ");
            System.out.println("1. Inscribir campers");
            System.out.println("2. Registrar notas");
            System.out.println("3. Crear nuevas rutas");
            System.out.println("4. Módulo de matrículas");
            System.out.println("5. Módulo de reportes \n");

            System.out.print("Selecciona: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // Limpia el buffer después de `nextInt()`
            System.out.println("\n");

            switch (opcion) {
                case 1 ->
                    inscribir();
                case 2 ->
                    registrarNota();
                case 3 ->
                    System.out.println("Has elegido crear nuevas rutas.");
                case 4 ->
                    System.out.println("Has elegido el módulo de matrículas.");
                case 5 ->
                    System.out.println("Has elegido el módulo de reportes.");
                default ->
                    System.out.println("Opción inválida.");
            }
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
        }
    }

    static void inscribir() {
        System.out.println("Inscripción: Ingrese los datos \n");

        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Apellidos: ");
        String apellidos = sc.nextLine();

        System.out.print("Direccion: ");
        String direccion = sc.nextLine();

        System.out.print("Celular: ");
        String celular = sc.nextLine();

        System.out.print("Acudiente: ");
        String acudiente = sc.nextLine();

        String estado = "Inscrito";

        camper.add(new Campers(id, nombre, apellidos, direccion, celular, acudiente, estado));
        System.out.println("Estudiante inscrito");

        System.out.println("\nLista de estudiantes inscritos:");
        for (Campers c : camper) {
            if (c.estado != null && c.estado.equalsIgnoreCase("Inscrito")) {
                System.out.println("ID: " + c.id + " | Nombre: " + c.nombre + " " + c.apellidos);
            }
        }
    }

    static void registrarNota() {
        System.out.println("Registro de notas");
        System.out.println("1. Prueba inicial");
        System.out.println("2. Éxamen de módulo \n");
        System.out.print("Selecciona: ");
        int opcion = sc.nextInt();
        sc.nextLine();
        System.out.println("\n");

        switch (opcion) {
            case 1:
                System.out.println("Registrar nota de Prueba Inicial");
                System.out.print("Ingresa el número de identificación del estudiante: ");
                
                int id = sc.nextInt();
                System.out.println("\n");

                for (Campers c : camper) {
                    if (c.id == id && c.estado.equalsIgnoreCase("Inscrito")) {
                        System.out.println("Estudiante: " + c.nombre + " " + c.apellidos);

                        System.out.println("Ingrese las notas de la prueba inicial: ");
                        System.out.print("70% = ");
                        double nota70 = sc.nextDouble();
                        System.out.print("30% = ");
                        double nota30 = sc.nextDouble();

                        if (100 >= nota70 && nota30 >= 1) {

                            double resultado = (nota70 * 0.7) + (nota30 * 0.30);

                            for (pruebaInicial n : nota) {

                                if (resultado > 60) {
                                    n.estado = "Aprobado";
                                } else {
                                    n.estado = "Desaprobado";
                                }

                                n.id = c.id;
                                n.nombre = c.nombre;
                                n.apellidos = c.apellidos;
                                n.tipoPrueba = "Prueba Inicial";
                                n.nota = resultado;

                                nota.add(new pruebaInicial(n.id, n.nombre, n.apellidos, n.tipoPrueba, n.nota, n.estado));
                                
                                System.out.println("\nEstado actualizado\n");
                                System.out.println(" ID: " + n.id + "\n Nombre: " + n.nombre + "\n Apellidos: " + n.apellidos + "\n Tipo de prueba: " + n.tipoPrueba + "\n Nota: " + n.nota + "\n Estado: " + n.estado);
                            }
                        } else {
                            System.out.println("La nota supera el límite");
                        }

                    }

                }
                break;
            case 2:
                System.out.println("Registrar nota de módulo\n");
                System.out.print("Ingresa el número de identificación del estudiante: ");
                int ids = sc.nextInt();
                System.out.println("");
                
                for (Campers c : camper) {
                    if (c.id == ids) {
                        System.out.println("Estudiante: " + c.nombre + " " + c.apellidos);

                        System.out.println("\nIngrese las notas del módulo:");
                        System.out.print("60% = ");
                        double nota60 = sc.nextDouble();
                        System.out.print("30% = ");
                        double nota30 = sc.nextDouble();
                        System.out.print("10% = ");
                        double nota10 = sc.nextDouble();
                        System.out.println("");

                        if (100 >= nota60 && nota30 >= 1) {
                            double resultado = ((nota60 * 0.6) + (nota30 * 0.30) + (nota10 * 0.1));
                            String estado = resultado > 60 ? "Aprobado" : "Desaprobado";

                            modulo.add(new notaModulo(c.id, c.nombre, c.apellidos, "Prueba de módulo", resultado, estado));

                            System.out.println(" ID: " + c.id + "\n Nombre: " + c.nombre + "\n Apellidos: " + c.apellidos 
                            + "\n Tipo de prueba: Prueba de módulo" + "\n Nota: " + resultado + "\n Estado: " + estado);

                            System.out.println(modulo);
                            System.out.println("\nModulo " + estado);
                            
                        } else {
                            System.out.println("La nota supera el límite");
                        }
                    }
                }
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }

    static void docente() {
        System.out.print("Ingrese su usuario: ");
        String usuario = sc.nextLine();
        System.out.println("");

        System.out.print("Ingrese su contraseña: ");
        String password = sc.nextLine();

        for (Trainers t : trainer) {
            if (t.nombre.equals(usuario) && t.contrasena.equals(password)) {

                System.out.println("\nBienvenido Trainer\n");
                System.out.println("Información:");
                System.out.println("ID: " + t.id);
                System.out.println("Nombre y apellidos: " + t.nombre + " " + t.apellidos);
                System.out.println("Ruta: " + t.ruta);

            }
        }
    }

    static void estudiante() {
        System.out.print("Ingrese su usuario: ");
        String usuario = sc.nextLine();
        System.out.println("");

        System.out.print("Ingrese su contraseña: ");
        int password = sc.nextInt();
        System.out.println("");

        boolean encontrado = false;

        for (Campers c : camper) {
            if (c.nombre.equals(usuario) && c.id == password) {
                encontrado = true;
                System.out.println("Bienvenido Camper\n");
                System.out.println("Información:");
                System.out.println("Nombre y apellidos: " + c.nombre + " " + c.apellidos);
                System.out.println("Dirección: " + c.direccion);
                System.out.println("Celular: " + c.celular);
                System.out.println("Acudiente: " + c.acudiente);
                System.out.println("Trainer: " + c.trainer);
                System.out.println("Ruta: " + c.ruta);
                System.out.println("Fecha de inicio: " + c.fechaInicio);
                System.out.println("Fecha de finalización: " + c.fechaFinalizacion);

                c.fechaSesion = LocalDateTime.now();
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                String fechaFormateada = c.fechaSesion.format(formato);

                sesiones nuevaSesion = new sesiones(c.nombre, c.apellidos, fechaFormateada, c.actividad);
                sesion.add(nuevaSesion);

                break;
            }
        }

        if (!encontrado) {
            System.out.println("Usuario o contraseña incorrectos.");
        }
    }
}
