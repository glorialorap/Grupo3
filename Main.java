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
                case 1: // altas
                    System.out.print("Ingrese numero del articulo: ");
                    int numero = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Ingrese descripcion del articulo: ");
                    String descripcion = sc.nextLine();
                    System.out.print("Ingrese el precio anterior del articulo: ");
                    double precioAnterior = sc.nextDouble();
                    System.out.print("Ingrese el precio actual del articulo: ");
                    double precioActual = sc.nextDouble();
                    sc.nextLine(); 
                    System.out.print("Ingrese la marca del articulo: ");
                    String marca = sc.nextLine();
                    System.out.print("Ingrese el peso del articulo: ");
                    double peso = sc.nextDouble();
                    sc.nextLine(); 
                    System.out.print("Ingrese las dimensiones del articulo: ");
                    String dimensiones = sc.nextLine();

                    Articulo nuevoArticulo = new Articulo(numero, descripcion, precioAnterior, precioActual, marca, peso, dimensiones);
                    ga.articulos.add(nuevoArticulo);
                    ga.crearArchivo(fileName);
                    break;

                case 2: // bajas
                    System.out.print("Ingrese el numero del articulo a eliminar: ");
                    numero = sc.nextInt();
                    ga.eliminarArticulo(numero);
                    ga.crearArchivo(fileName);
                    break;

                case 3: // cambios
                    System.out.print("Ingrese el numero del articulo a modificar: ");
                    numero = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Ingrese la nueva descripcion del articulo: ");
                    descripcion = sc.nextLine();
                    System.out.print("Ingrese el nuevo precio anterior del articulo: ");
                    precioAnterior = sc.nextDouble();
                    System.out.print("Ingrese el nuevo precio actual del articulo: ");
                    precioActual = sc.nextDouble();
                    sc.nextLine(); 
                    System.out.print("Ingrese la nueva marca del articulo: ");
                    marca = sc.nextLine();
                    System.out.print("Ingrese el nuevo peso del articulo: ");
                    peso = sc.nextDouble();
                    sc.nextLine(); 
                    System.out.print("Ingrese las nuevas dimensiones del articulo: ");
                    dimensiones = sc.nextLine();

                    ga.modificarArticulo(numero, descripcion, precioAnterior, precioActual, marca, peso, dimensiones);
                    ga.crearArchivo(fileName);
                    break;

                case 4: // consultas
                    for (Articulo articulo : ga.articulos) {
                        System.out.println("Numero: " + articulo.numero + ", Descripcion: " + articulo.descripcion +
                                ", Precio Anterior: " + articulo.precioAnterior + ", Precio Actual: " + articulo.precioActual +
                                ", Marca: " + articulo.marca + ", Peso: " + articulo.peso +
                                ", Dimensiones: " + articulo.dimensiones);
                    }
                    break;

                case 5: // calcular promedio de precios
                    double promedio = ga.calcularPromedioPrecios();
                    System.out.println("El promedio de los precios actuales es: " + promedio);
                    break;

                case 6: // salida
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

