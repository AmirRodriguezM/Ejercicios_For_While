import java.util.Scanner;

public class Punto3_Cálculadora_Booleana_While {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        try {
            System.out.println("Digite la operacion que desea hacer: \n1. OR \n2. AND \n3. XOR");
            int operacion = entrada.nextInt();
            System.out.println("Digite la cantidad de veces que desea hacer la operacion");
            int cantVeces = entrada.nextInt();
            int i = 1;
            while(i <= cantVeces) {
                System.out.println("Ingrese un primer dato.");
                boolean datoUno = entrada.nextBoolean();
                System.out.println("Ingrese un segundo dato.");
                boolean datoDos = entrada.nextBoolean();

                switch(operacion) {
                    case 1:
                        or(datoUno, datoDos);
                        break;
                    case 2:
                        and(datoUno, datoDos);
                        break;
                    case 3:
                        xor(datoUno, datoDos);
                        break;
                    default:
                        System.out.println("opcion incorrecta");
                }
                i++;
            }
        }catch(Exception e) {
            System.out.println("Digito no valido");
        }
        entrada.close();
    }
    public static void or(boolean n1, boolean n2) {
        if(n1 && n2) {
            System.out.println(true);
        }else if(n1 || n2) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }

    public static void and(boolean n1, boolean n2) {
        if(n1 && n2) {
            System.out.println(true);
        }else if(n1 || n2) {
            System.out.println(false);
        }else {
            System.out.println(false);
        }
    }
    public static void xor(boolean n1, boolean n2) {
        if(n1 && n2) {
            System.out.println(false);
        }else if(n1 || n2) {
            System.out.println(false);
        }else {
            System.out.println(true);
        }
    }
}
