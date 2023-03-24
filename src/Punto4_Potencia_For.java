import java.util.Scanner;

public class Punto4_Potencia_For {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int intentos = 4;

            try {

            for (int i = 1; i < intentos; i++) {

                System.out.println("Indique el valor a potenciar");
                double num = sc.nextDouble();

                if (num > 999999999) {
                    System.out.println("El resultado potenciado es: " + Math.pow(num, 4));
                }

            }

            } catch (Exception e) {

            }
    }
}
