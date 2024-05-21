import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionArticulos extends Articulos{
    Scanner sc = new Scanner(System.in);
    private List <GestionArticulos> articulos;
    
    public GestionArticulos(int numero, String descripcion, double precioAnterior, double precioActual,
            List<GestionArticulos> articulos) {
        super(numero, descripcion, precioAnterior, precioActual);
        this.articulos = new ArrayList<>();
    }

    public void anadirArticulo(GestionArticulos articulo){
        articulos.add(articulo);
        System.out.println("Articulo añadido con exito");
    }
    
    public void modificarArticulo(int indice, GestionArticulos articulo){
        articulos.set(indice, articulo);
        System.out.println("El articulo ha sido modificado");

    }

    public void eliminarArticulo(){
        System.out.println("Ingrese el numero de articulo que desea eliminar: ");
        int numero = sc.nextInt();
        for(int i=0;i<articulos.size();i++){
            GestionArticulos articulo = articulos.get(i);
            if(articulo.getNumero()==(numero)){
                articulos.remove(i);
                System.out.println("El articulo en la posicion "+ i +" ha sido eliminado");
            }
            else{
                System.out.println("El articulo no existe");
            }
        }
    }

    public void mostrarArticulo(){
        System.out.println("Lista de articulos: ");
        for (GestionArticulos articulo : articulos) {
            System.out.println(articulo);
        }
    }
}
