import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List<Figura> figuras = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Menú de Operaciones ---");
            System.out.println("1. Agregar Figura");
            System.out.println("2. Filtrar Figuras por Área");
            System.out.println("3. Calcular Área Total");
            System.out.println("4. Calcular Promedio de Perímetros");
            System.out.println("5. Mostrar Figura con Máximo y Mínimo Perímetro y Área");
            System.out.println("6. Calcular Promedio de Perímetros de Pentágono y Hexágono");
            System.out.println("7. Salir");

            int opcion=sc.nextInt();

            switch (opcion) {
                case 1:
                    //agregarFigura(figuras);
                    break;
                case 2:
                    //filtrarPorArea(figuras);
                    break;
                case 3:
                    //calcularAreaTotal(figuras);
                    break;
                case 4:
                    //calcularPromedioPerimetros(figuras);
                    break;
                case 5:
                    //calcularMaxyMin(figuras);
                    break;
                case 6:
                    //calcularPromedioPentagonoHexagono(figuras);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
            }
            
        }
    }
}
    

