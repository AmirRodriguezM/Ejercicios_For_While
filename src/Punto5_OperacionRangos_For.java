import java.util.Scanner;

public class Punto5_OperacionRangos_For {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        double num = 0;
        int intentos = 6;
        double res=0;

        try {

        for (int i = 1; i <= intentos; i++) {
            System.out.println("Ingrese el valor a operar");
            num=tc.nextDouble();
            if (num >= 15.12 && num <= 19.31) {

                res=((num*100)/2)+100;
                System.out.println("El resultado de la operación es: "+res);

            }
        }

    } catch (Exception e) {
}
    }
}