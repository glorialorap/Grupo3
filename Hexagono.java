class Hexagono extends Figura{

    public Hexagono(double lado) {
        super("Hexágono", lado);
    }

    @Override
    public double Area() {
        return (3 * Math.sqrt(3) * Math.pow(lado, 2)) / 2;
    }

    @Override
    public double Perimetro() {
        return 6 * lado;
    }
}
