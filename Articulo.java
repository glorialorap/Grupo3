import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Articulo {
    int numero;
    String descripcion;
    double precioAnterior;
    double precioActual;
    String marca;  
    double peso;  
    String dimensiones;  
    
    public Articulo(int numero, String descripcion, double precioAnterior, double precioActual) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.precioAnterior = precioAnterior;
        this.precioActual = precioActual;
        this.marca = marca;
        this.peso = peso;
        this.dimensiones = dimensiones;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getPrecioAnterior() {
        return precioAnterior;
    }
    public void setPrecioAnterior(double precioAnterior) {
        this.precioAnterior = precioAnterior;
    }
    public double getPrecioActual() {
        return precioActual;
    }
    public void setPrecioActual(double precioActual) {
        this.precioActual = precioActual;
    }
        public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getDimensiones() {
        return dimensiones;
    }
    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }
    @Override
    public String toString() {
        return "Articulos [numero=" + numero + ", descripcion=" + descripcion + ", precioAnterior=" + precioAnterior
                + ", precioActual=" + precioActual + "]";
    }
    
}
