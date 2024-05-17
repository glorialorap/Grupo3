import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Pentagono pentagono = new Pentagono(null, 12, 8.2);
        Hexagono hexagono = new Hexagono(18);
        Paralelograma paralelograma = new Paralelograma(null, 4.5, 6, 7.5);
        Rombo rombo = new Rombo(null, 10, 4.2, 6.8);

        List<Figura> figuras = new ArrayList<>();
        figuras.add(pentagono);
        figuras.add(hexagono);
        figuras.add(paralelograma);
        figuras.add(rombo);

        while (true) {
            System.out.println("\n--- Menú de Operaciones ---");
            System.out.println("1. Filtrar Figuras por Area");
            System.out.println("2. Calcular Area Total");
            System.out.println("3. Calcular Promedio de Perimetros");
            System.out.println("4. Mostrar Figura con Maximo y Minimo Perimetro y Area");
            System.out.println("5. Calcular Promedio de Perimetros de Pentagono y Hexagono");
            System.out.println("6. Salir");

            int opcion;

            switch (opcion) {
                case 1:
                    filtrarPorArea(figuras);
                    break;
                case 2:
                    calcularAreaTotal(figuras);
                    break;
                case 3:
                    calcularPromedioPerimetros(figuras);
                    break;
                case 4:
                    calcularMaxyMin(figuras);
                    break;
                case 5:
                    calcularPromedioPentagonoHexagono(figuras);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion invalida. Intentelo de nuevo.");
            }
            
        }
    }
    
    private static void calcularAreaTotal(List<Figura> figuras) {
        double areaTotal = figuras.stream()
            .mapToDouble(Figura::Area)
            .sum();
        System.out.println("Area total de todas las figuras: " + areaTotal);
    }

    private static void calcularPromedioPerimetros(List<Figura> figuras) {
        double promedioPerimetros = figuras.stream()
            .mapToDouble(Figura::Perimetro)
            .average()
            .orElse(0);
        System.out.println("Promedio de los perimetros de todas las figuras: " + promedioPerimetros);
    }
}
    

