import java.util.Scanner;

public class Extra2_SPH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horasTrabajadas, sueldoObrero, horasExtra, sueldoExtra, horasNoExtra, sueldoNoExtra;

        System.out.println("Vamos a calcular tu salario:");
        System.out.println("Introduce las horas que has trabajado esta semana:");
        horasTrabajadas = sc.nextInt();
        if (horasTrabajadas < 40){
            sueldoObrero = horasTrabajadas * 16;
            System.out.println("Su salario semanal es de: " +sueldoObrero);
        } else {
            horasExtra = horasTrabajadas - 40;
            horasNoExtra = horasTrabajadas - horasExtra;
            sueldoExtra = horasExtra * 20;
            sueldoNoExtra = horasNoExtra * 16;
            sueldoObrero = sueldoNoExtra + sueldoExtra;

            System.out.println("Su salario semanal es de: " +sueldoObrero);
            System.out.println(sueldoExtra + " es la parte de las horas extra");
            System.out.println(sueldoNoExtra + " corresponde a las horas normales");

        }
    }
}
