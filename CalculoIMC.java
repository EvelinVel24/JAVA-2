import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar el peso en kilogramos
        System.out.print("Ingrese su peso en kg: ");
        double peso = scanner.nextDouble();

        // Solicitar la altura en metros
        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        // Mostrar el mensaje de cálculo
        System.out.println("Calculando su IMC...");

        // Calcular el IMC
        double imc = peso / (altura * altura);

        // Mostrar el resultado
        System.out.println("Su índice de masa muscular es: " + imc);

        // Cerrar el scanner
        scanner.close();
    }
}

