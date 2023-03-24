import java.util.Scanner;

public class Punto6_NumeroValidado_For {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        try {
            double almacen[] = new double[5];
            System.out.println("Digite cuatro numeros");
            for(int i =0; i <= almacen.length; i++) {
                almacen[i] = entrada.nextDouble();
                if(almacen[i] < 74 || almacen[i] > 189 || almacen[i] % 2 != 0) {
                    entrada.close();
                    throw new Exception("Numero no valido");
                }
                if(almacen[i] % 5 == 0) {
                    System.out.println("Numero valido");
                }
            }
        }catch
        (Exception e) {

            if(e.getMessage() != null) {
                System.out.println(e.getMessage());
            }else {
                System.out.println("Digito no valido");
            }

        }

    }

}
