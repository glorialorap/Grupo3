import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        int opcion=0;
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

            System.out.print("\nIngrese una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    filtrarPorArea(figuras, sc);
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

    private static void filtrarPorArea(List<Figura> figuras, Scanner sc){
        //filtra el area que el usuario desea ver
            System.out.println("\nCual area desea ver? \n[1]Hexagono [2]Paralelogramo [3]Pentagono [4]Rombo");
            int areaFigura=sc.nextInt();
            
            switch (areaFigura) {
                case 1:
                    List<Figura> figurasHexagono = figuras.stream().
                    filter(f->f instanceof Hexagono).
                    collect(Collectors.toList());
                    figurasHexagono.forEach(System.out::println);
                    break;
                case 2:
                    List<Figura> figurasParalelogramo = figuras.stream().
                    filter(f->f instanceof Paralelograma).
                    collect(Collectors.toList());
                    figurasParalelogramo.forEach(System.out::println);
                    break;
                case 3:
                    List<Figura> figurasPentagono = figuras.stream().
                    filter(f->f instanceof Pentagono).
                    collect(Collectors.toList());
                    figurasPentagono.forEach(System.out::println);
                    break;
                case 4:
                    List<Figura> figurasRombo = figuras.stream().
                    filter(f->f instanceof Rombo).
                    collect(Collectors.toList());
                    figurasRombo.forEach(System.out::println);
                    break;
                default:
                System.out.println("Ingresa una opción valida");
                    break;
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

    private static void calcularPromedioPentagonoHexagono(List<Figura> figuras) {
        // Filtrar figuras para obtener solo pentágonos y hexágonos
        List<Figura> pentagonosYHexagonos = figuras.stream()
            .filter(figura -> figura instanceof Pentagono || figura instanceof Hexagono)
            .collect(Collectors.toList());

        // Calcular el promedio de perímetros de los pentágonos y hexágonos
        double promedioPerimetros = pentagonosYHexagonos.stream()
            .mapToDouble(Figura::Perimetro)
            .average()
            .orElse(0);

        // Mostrar resultado
        System.out.println("Promedio de perimetros de pentágonos y hexágonos: " + promedioPerimetros);
        }
    

        private static void calcularMaxyMin(List<Figura> figuras) {
            // Encontrar la figura con el máximo perímetro y área
            Figura figuraMaxPerimetro = figuras.stream()
                    .max(Comparator.comparing(Figura::Perimetro))
                    .orElse(null);                   
        
            Figura figuraMaxArea = figuras.stream()
                    .max(Comparator.comparing(Figura::Area))
                    .orElse(null);
        
            // Encontrar la figura con el mínimo perímetro y área
            Figura figuraMinPerimetro = figuras.stream()
                    .min(Comparator.comparing(Figura::Perimetro))
                    .orElse(null);
        
            Figura figuraMinArea = figuras.stream()
                    .min(Comparator.comparing(Figura::Area))
                    .orElse(null);
        
            // Mostrar resultados
            System.out.println("Figura con máximo perímetro: " + figuraMaxPerimetro);
            System.out.println("Figura con máximo área: " + figuraMaxArea);
            System.out.println("Figura con mínimo perímetro: " + figuraMinPerimetro);
            System.out.println("Figura con mínimo área: " + figuraMinArea);
        }
}
    

