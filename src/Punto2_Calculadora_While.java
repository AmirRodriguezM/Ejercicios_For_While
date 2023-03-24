import java.util.Scanner;

public class Punto2_Calculadora_While {
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        int sum = 0;
        int resta = 0;
        int multi = 0;
        double div = 0;
        double mod = 0;
        int Contador=1;

        try {

        System.out.println("Indique el operador que desea realizar entre los 3 números");
        String op = tc.nextLine();

        System.out.println("Indique el primer número para operar");
        int numUno = tc.nextInt();

        System.out.println("Indique el segundo número para operar");
        int numDos = tc.nextInt();

        System.out.println("Indique el tercer número para operar");
        int numTres = tc.nextInt();
        System.out.println("Ingrese el número de veces que desea la operación");
        int intentos = tc.nextInt();

        while (Contador<=intentos) {

            if (op.equals("+")) {
                sum = 0;
                sum = numUno + numDos + numTres;
                System.out.println("La suma es: " + sum);
            } else if (op.equals("-")) {
                resta = 0;
                if (numUno > 0) {
                    resta += numUno;
                } else {
                    resta -= numUno * (-1);
                }

                if (numDos > 0) {
                    resta += numDos;
                } else {
                    resta -= numDos * (-1);
                }

                if (numTres > 0) {
                    resta += numTres;
                } else {
                    resta -= numTres * (-1);
                }

                System.out.println("La resta es: " + resta);

            } else if (op.equals("*")) {

                multi = numUno * numDos * numTres;
                System.out.println("La multiplicación es: " + multi);
            } else if (op.equals("/")) {

                div = numUno / numDos / numTres;
                System.out.println("La división es: " + div);
            } else if (op.endsWith("%")) {

                mod = (numUno * numDos) % numTres;
                System.out.println("El módulo es: "+mod);
            }
            Contador++;
        }
        } catch (Exception e) {
    }
}
}
