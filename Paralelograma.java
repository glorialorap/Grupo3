class Paralelograma extends Figura{

    private double base;
    private double altura;

    public Paralelograma(String nombre, double lado, double base, double altura) {
        super("Paralelogramo", lado);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double Area() {
        return base * altura;
    }

    @Override
    public double Perimetro() {
        return 2 * (base + lado);
    }
}
