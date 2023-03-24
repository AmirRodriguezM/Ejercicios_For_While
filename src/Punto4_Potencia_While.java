import java.util.Scanner;

public class Punto4_Potencia_While {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int intentos = 4;
            int contador =1;

            try {

            while (contador<=intentos) {

                System.out.println("Indique el valor a potenciar");
                double num = sc.nextDouble();

                if (num > 999999999) {
                    System.out.println("El resultado potenciado es: " + Math.pow(num, 4));
                }
            contador++;
            }

            } catch (Exception e) {
        }
    }
}