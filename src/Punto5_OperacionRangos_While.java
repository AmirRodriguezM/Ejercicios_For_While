import java.util.Scanner;

public class Punto5_OperacionRangos_While {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        double num = 0;
        int intentos = 6;
        double res = 0;
        int contador = 1;
        try {
        while (contador <= intentos) {

            System.out.println("Ingrese el valor a operar");
            num = tc.nextDouble();
            if (num >= 15.12 && num <= 19.31) {

                res = ((num * 100) / 2) + 100;
                System.out.println("El resultado de la operación es: " + res);

            }
            contador ++;
        }
        }catch (Exception e){

        }
    }
}
