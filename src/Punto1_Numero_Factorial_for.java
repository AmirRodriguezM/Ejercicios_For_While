public class Punto1_Numero_Factorial_for {
    public static void main(String[] args) {
        int res=1;
        int factorial=1;

        try {
            for (int i = 1; i <= 10; i++) {

                factorial*=res*i;

            }
            System.out.println("El número factorial es: "+factorial);
        }catch (Exception e){

    }
    }
}
