import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GDA {
    List<Articulo> articulos = new ArrayList<>();

    public void crearArchivo(String fileName) {
        System.out.println("=== Creando el archivo " + fileName + " ===");
        boolean fileCreated = false;
        File file = new File(fileName);
        try {
            fileCreated = file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            for (Articulo articulo : articulos) {
                fileWriter.write(articulo.numero + "," + articulo.descripcion + "," + articulo.precioAnterior + "," + articulo.precioActual + "," + articulo.marca + "," + articulo.peso + "," + articulo.dimensiones + "\n");
            }
            fileWriter.close();
            if (fileCreated) {
                System.out.println("=== El archivo se creó correctamente ===");
            } else {
                System.out.println("=== El archivo ya existe ===");
            }

        } catch (IOException e) {
            System.out.println("=== Excepción al crear el archivo " + e);
        }
    }

    public void leerArchivo(String fileName) {
        System.out.println("=== Leyendo el archivo " + fileName + " ===");
        File file = new File(fileName);
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                String[] parts = data.split(",");
                int numero = Integer.parseInt(parts[0]);
                String descripcion = parts[1];
                double precioAnterior = Double.parseDouble(parts[2]);
                double precioActual = Double.parseDouble(parts[3]);
                String marca = parts[4];
                double peso = Double.parseDouble(parts[5]);
                String dimensiones = parts[6];
                articulos.add(new Articulo(numero, descripcion, precioAnterior, precioActual, marca, peso, dimensiones));
            }
            System.out.println("=== Archivo leído correctamente ===");
        } catch (FileNotFoundException e) {
            System.out.println("=== Hubo un error al abrir el archivo " + e);
        }
    }

    public void eliminarArticulo(int numero) {
        for (int i = 0; i < articulos.size(); i++) {
            if (articulos.get(i).numero == numero) {
                articulos.remove(i);
                System.out.println("=== Artículo eliminado correctamente ===");
                return;
            }
        }
        System.out.println("=== Artículo no encontrado ===");
    }

    public void modificarArticulo(int numero, String descripcion, double precioAnterior, double precioActual, String marca, double peso, String dimensiones) {
        for (Articulo articulo : articulos) {
            if (articulo.numero == numero) {
                articulo.descripcion = descripcion;
                articulo.precioAnterior = precioAnterior;
                articulo.precioActual = precioActual;
                articulo.marca = marca;
                articulo.peso = peso;
                articulo.dimensiones = dimensiones;
                System.out.println("=== Artículo modificado correctamente ===");
                return;
            }
        }
        System.out.println("=== Artículo no encontrado ===");
    }

    public double calcularPromedioPrecios() {
        if (articulos.isEmpty()) {
            return 0;
        }
        double suma = 0;
        for (Articulo art : articulos) {
            suma += art.precioActual;
        }
        return suma / articulos.size();
    }
}
