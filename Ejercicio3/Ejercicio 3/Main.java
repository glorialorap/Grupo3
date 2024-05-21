import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestionArticulos ga = new GestionArticulos(0, null, 0, 0, null);
        int sw=0, opc=0;

        //menu:
        while (true) {
            System.out.println("\n--BIENVENIDO AL MENU--");
            System.out.println("[1]Realizar alta\n[2]Realizar baja\n[3]Cambios\n[4]Consultas\n[5]Salir");
            opc = sc.nextInt();

            if(opc==1){//altas
                System.out.print("Ingrese numero del articulo: ");
                int numero=sc.nextInt();
                ga.setNumero(numero);
                System.out.print("Ingrese descripcion del articulo: ");
                String descripcion=sc.next();
                ga.setDescripcion(descripcion);
                System.out.print("Ingrese el precio anterior del articulo: ");
                double precioAnterior=sc.nextDouble();
                ga.setPrecioAnterior(precioAnterior);
                System.out.print("Ingrese el precio actual del articulo: ");
                double precioActual=sc.nextDouble();
                ga.setPrecioActual(precioActual);
                GestionArticulos nuevoArticulo = new GestionArticulos(numero, descripcion, precioAnterior, precioActual, null);
                ga.anadirArticulo(nuevoArticulo);
                sw=1;
            }

            if(opc==2 && sw==1){//bajas
                ga.eliminarArticulo();
            }

            else if(opc==2){
                System.out.println("Tienes que ingresar datos primero");
            }

            if(opc==3 && sw==1){//Cambios
                System.out.print("Ingrese el indice del articulo a modificar: ");
                int indice=sc.nextInt();
                System.out.print("Ingrese el nuevo numero del articulo : ");
                int numero=sc.nextInt();
                ga.setNumero(numero);
                System.out.print("Ingrese la nueva descripcion del articulo: ");
                String descripcion=sc.next();
                ga.setDescripcion(descripcion);
                System.out.print("Ingrese el nuevo precio anterior del articulo: ");
                double precioAnterior=sc.nextDouble();
                ga.setPrecioAnterior(precioAnterior);
                System.out.print("Ingrese el nuevo precio actual del articulo: ");
                double precioActual=sc.nextDouble();
                ga.setPrecioActual(precioActual);
                GestionArticulos nuevoArticulo = new GestionArticulos(numero, descripcion, precioAnterior, precioActual, null);
                ga.modificarArticulo(indice, nuevoArticulo);
            }

            else if(opc==3){
                System.out.println("Tienes que ingresar datos primero");
            }

            if(opc==4 && sw==1){//consultas
                ga.mostrarArticulo();
            }

            else if(opc==4){
                System.out.println("Tienes que ingresar datos primero");
            }

            if(opc==5){//salida
                System.out.println("Hasta luego");
                sc.close();
                System.exit(0);
            }

        }


    }
}