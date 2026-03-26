import java.util.Scanner;

public class Extra2_GAR2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de horas trabajadas a la semana: ");
        int horasTrabajadas = scanner.nextInt();
        int horasNormales;
        double salarioNormal;
        double salarioTotal;
        int horasExtras = 0;
        double salarioExtra = 0;
        if (horasTrabajadas <= 40) {
            horasNormales = horasTrabajadas;
            salarioNormal = horasNormales * 16;
        } else {
            horasNormales = 40;
            horasExtras = horasTrabajadas - 40;
            salarioNormal = horasNormales * 16;
            salarioExtra = horasExtras * 20;
        }
        salarioTotal = salarioNormal + salarioExtra;
        System.out.println("\n--- Desglose Salarial ---");
        System.out.println("Salario por horas normales (" + horasNormales + " horas a 16 euros/h): " + salarioNormal + " euros");

        if (horasExtras > 0) {
            System.out.println("Salario por horas extra (" + horasExtras + " horas a 20 euros/h): " + salarioExtra + " euros");
        } else {
            System.out.println("Salario por horas extra: 0 euros");
        }
        System.out.println("-------------------------");
        System.out.println("Salario total semanal: " + salarioTotal + " euros");
        scanner.close();
    }
}