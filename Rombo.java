class Rombo extends Figura{
    
    private double diagonalMenor;
    private double diagonalMayor;

    public Rombo(String nombre, double lado, double diagonalMenor, double diagonalMayor) {
        super("Rombo", lado);
        this.diagonalMenor = diagonalMenor;
        this.diagonalMayor = diagonalMayor;
    }

    @Override
    public double Area() {
        return (diagonalMenor * diagonalMayor) / 2;
    }

    @Override
    public double Perimetro() {
        return 4 * lado;
    }

}
