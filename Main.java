import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GDA ga = new GDA();
        String fileName = "articulos.txt";
        int opc;

        //menu:
        while (true) {
            System.out.println("\n--BIENVENIDO AL MENU--");
            System.out.println("[1]Realizar alta\n[2]Realizar baja\n[3]Cambios\n[4]Consultas\n[5]Calcular promedio de precios\n[6]Salir");
            opc = sc.nextInt();

            switch (opc) {
                case 1: //altas
                    System.out.print("Ingrese numero del articulo: ");
                    int numero=sc.nextInt();
                    System.out.print("Ingrese descripcion del articulo: ");
                    String descripcion=sc.next();
                    System.out.print("Ingrese el precio anterior del articulo: ");
                    double precioAnterior=sc.nextDouble();
                    System.out.print("Ingrese el precio actual del articulo: ");
                    double precioActual=sc.nextDouble();
                    Articulo nuevoArticulo = new Articulo(numero, descripcion, precioAnterior, precioActual);
                    ga.articulos.add(nuevoArticulo);
                    ga.crearArchivo(fileName);
                    break;

                case 2: //bajas
                    System.out.print("Ingrese el numero del articulo a eliminar: ");
                    numero=sc.nextInt();
                    ga.eliminarArticulo(numero);
                    ga.crearArchivo(fileName);
                    break;

                case 3: //Cambios
                    System.out.print("Ingrese el numero del articulo a modificar: ");
                    numero=sc.nextInt();
                    System.out.print("Ingrese la nueva descripcion del articulo: ");
                    descripcion=sc.next();
                    System.out.print("Ingrese el nuevo precio anterior del articulo: ");
                    precioAnterior=sc.nextDouble();
                    System.out.print("Ingrese el nuevo precio actual del articulo: ");
                    precioActual=sc.nextDouble();
                    ga.modificarArticulo(numero, descripcion, precioAnterior, precioActual);
                    ga.crearArchivo(fileName);
                    break;

                case 4: //consultas
                    for (Articulo articulo : ga.articulos) {
                        System.out.println("Numero: " + articulo.numero + ", Descripcion: " + articulo.descripcion + ", Precio Anterior: " + articulo.precioAnterior + ", Precio Actual: " + articulo.precioActual);
                    }
                    break;
                
                case 5: //calcular promedio de precios
                    double promedio = ga.calcularPromedioPrecios();
                    System.out.println("El promedio de los precios actuales es: " + promedio);
                    break;

                case 6: //salida
                    System.out.println("Hasta luego");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, elija una opción del menú.");
                    break;
            }
        }
    }
}
