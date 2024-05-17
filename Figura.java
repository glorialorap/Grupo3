abstract class Figura{
    
    protected String nombre;
    protected double lado;
    
    public Figura(String nombre, double lado) {
        this.nombre = nombre;
        this.lado = lado;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }

    public abstract double Area();
    public abstract double Perimetro();

    @Override
    public String toString() {
        return nombre + " [Area=" + Area() + ", Perimetro=" + Perimetro() + "]";
    }
}