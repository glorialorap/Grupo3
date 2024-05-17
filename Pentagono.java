class Pentagono extends Figura{

    private double apotema;

    public Pentagono(String nombre, double lado, double apotema) {
        super("Pentágono", lado);
        this.apotema = apotema;
    }

    @Override
    public double Area() {
        return (5 * lado * apotema) / 2;
    }

    @Override
    public double Perimetro() {
        return 5 * lado;
    }
}
