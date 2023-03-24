import java.util.Scanner;

public class Punto6_NumeroValidado_While {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        try {
            double almacen[] = new double[5];
            System.out.println("Digite cuatro numeros");
            int i =0;
            while(i < almacen.length) {
                almacen[i] = entrada.nextDouble();
                if(almacen[i] < 74 || almacen[i] > 189 || almacen[i] % 2 != 0) {
                    entrada.close();
                    throw new Exception("Numero no valido");
                }else if(almacen[i] % 5 == 0) {
                    System.out.println("Numero valido");
                }
                i++;
            }

        }catch(Exception e) {

            if(e.getMessage() != null) {
                System.out.println(e.getMessage());
            }else {
                System.out.println("Digito no valido");
            }

        }

    }
}
