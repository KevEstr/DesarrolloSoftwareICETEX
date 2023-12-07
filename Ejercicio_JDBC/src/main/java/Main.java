import java.util.ArrayList;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Producto producto;

        int opcion = 0;

        // Opcion 1 -> Añadir, Modificar, Eliminar, Mostrar, Salir
        EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();

        while (opcion != 5){
            System.out.println("1. Añadir Productos");
            System.out.println("2. Buscar Productos");
            System.out.println("3. Modificar Productos");
            System.out.println("4. Eliminar Productos");
            System.out.println("5. Salir del Programa");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Escriba el nombre del producto: ");
                    producto = new Producto();
                    producto.setId(null);
                    scanner.nextLine();
                    producto.setNombre(scanner.nextLine());

                    System.out.println("Escriba el precio del producto: ");
                    producto.setPrecio(scanner.nextInt());

                    entity.getTransaction().begin();
                    entity.persist(producto);
                    entity.getTransaction().commit();

                    break;

                case 2:
                    System.out.println("Introduzca el ID del producto que quieras buscar");
                    producto = new Producto();
                    producto = entity.find(Producto.class, scanner.nextLong());

                    if (producto != null){
                        // Cuando encontró el producto
                        System.out.println(producto);
                    } else {
                        System.out.println("El producto no fue encontrado. Te vamos a mostrar todos los productos:");
                        List<Producto> listaProductos = new ArrayList<>();
                        Query query = entity.createQuery("SELECT p FROM Producto p");
                        listaProductos = query.getResultList();

                        for (Producto p : listaProductos){
                            System.out.println(p);
                        }

                    }
                    break;

                case 3:
                    System.out.println("Introduzca el ID del producto que deseas modificar");
                    producto = new Producto();

                    producto = entity.find(Producto.class, scanner.nextLong());

                    if (producto != null){
                        // Si lo encontró
                        System.out.println(producto);
                        System.out.println("Escriba el nuevo nombre del producto");
                        scanner.nextLine();
                        producto.setNombre(scanner.nextLine());
                        System.out.println("Escriba el nuevo precio del producto");
                        producto.setPrecio(scanner.nextInt());

                        entity.getTransaction().begin();
                        entity.merge(producto);
                        entity.getTransaction().commit();

                    } else {
                        System.out.println("El producto no fue encontrado, no se puede modificar");
                    }
                    break;

                case 4:
                    System.out.println("Introduzca el ID del producto que deseas eliminar");
                    producto = new Producto();

                    producto = entity.find(Producto.class, scanner.nextLong());

                    if (producto != null){
                        System.out.println(producto);

                        entity.getTransaction().begin();
                        entity.remove(producto);
                        entity.getTransaction().commit();
                    } else {
                        System.out.println("Producto no fue encontrado");
                    }
                    break;

                case 5:
                   entity.close();
                   JPAUtil.shutdown();
                   break;

                default:
                    System.out.println("Escribiste una opción invalida");
                    break;
            }
        }
    }
}
