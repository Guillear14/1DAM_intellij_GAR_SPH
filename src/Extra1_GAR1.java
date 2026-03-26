import java.util.Scanner;
public class Extra1_GAR1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] productos = new String[3];
        double[] precios = new double[3];
        double[] descuentos = new double[3];
        double totalSinDescuento = 0;
        double totalAhorro = 0;
        System.out.println("--- Sistema de Ofertas ---");
        for (int i = 0; i < 3; i++) {
            System.out.print("Introduce el nombre del producto " + (i + 1) + ": ");
            productos[i] = scanner.nextLine();
            System.out.print("Introduce el precio de " + productos[i] + " (en euros): ");
            precios[i] = scanner.nextDouble();
            scanner.nextLine();
            if (precios[i] <= 50) {
                descuentos[i] = precios[i] * 0.08; // 8% de descuento
            } else {
                descuentos[i] = precios[i] * 0.10; // 10% de descuento
            }
            totalSinDescuento += precios[i];
            totalAhorro += descuentos[i];
        }
        double totalConDescuento = totalSinDescuento - totalAhorro;
        System.out.println("\n--- Resumen de la compra ---");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%s ... %.0f euros (descuento %.0f euros)\n",
                    productos[i], precios[i], descuentos[i]);
        }
        System.out.printf("Precio a pagar sin descuento (%.0f euros)\n", totalSinDescuento);
        System.out.printf("Precio a pagar con descuento (%.0f euros) con un ahorro de %.0f euros.\n",
                totalConDescuento, totalAhorro);
        scanner.close();
    }
}