import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

// 1. Añadir 2. Borrar 3. Modificar 4. Mostrar 5. Salir



public class Main {

    public static void main(String[] args) {
        List<Estudiante> listaEstudiantes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu del Listado de Estudiantes");
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Modificar Estudiante");
            System.out.println("3. Eliminar Estudiante");
            System.out.println("4. Mostrar Lista de Estudiantes");
            System.out.println("5. Salir del Programa");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch(opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del estudiante: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese la edad del estudiante: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Ingrese el nombre del curso: ");
                    String curso = scanner.nextLine();

                    Estudiante estudiante = new Estudiante(nombre, edad, curso);
                    listaEstudiantes.add(estudiante);
                    break;

                case 2:
                    System.out.println("Ingrese el nombre del estudiante que deseas modificar: ");
                    String nombreModificar = scanner.nextLine();
                    boolean encontrado = false;

                    for (int i = 0; i < listaEstudiantes.size(); i++) {
                        Estudiante e = listaEstudiantes.get(i);

                        if (e.getNombre().equals(nombreModificar)) {
                            System.out.println("Ingrese la nueva edad del estudiante: ");
                            int nuevaEdad = scanner.nextInt();
                            scanner.nextLine();
                            e.setEdad(nuevaEdad);
                            System.out.println("Edad modificada");
                            encontrado = true;
                            break;
                        }
                    }
                    if (encontrado) {
                        // El estudiante fue encontrado y modificado
                    } else {
                        System.out.println("El estudiante no fue encontrado");
                    }
                break;

                case 3: // Ayuda
                    System.out.println("Ingrese el nombre del estudiante que desea eliminar: ");
                    String nombreEliminar = scanner.nextLine();


                // Se elabora recorriendo la lista, buscando el nombre igual y eliminando.

                    break;

                case 4:
                    System.out.println("Lista de Estudiantes");
                    for (Estudiante e : listaEstudiantes) {
                        e.imprimirDetalles();
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del Programa");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opción no Valida");
            }

        } while (opcion != 5);

    }

}
