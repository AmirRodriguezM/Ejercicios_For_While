public class Punto1_Numero_Factorial_while {

    public static void main(String[] args) {


        int num = 10;
        int factorial = 1;
        int contador = 1;
        try {


            while (contador <= num) {

                factorial *= contador;

                contador++;
            }
            System.out.println("El número factorial es: " + factorial);
        } catch (Exception e) {
        }
    }
}


