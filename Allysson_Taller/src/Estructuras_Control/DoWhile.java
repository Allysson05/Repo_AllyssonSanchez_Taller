
import java.util.Scanner;


/** Mostrar un menú:
 *1. Saludar  
 *2. Mostrar fecha (solo texto: `Funcionalidad no implementada`)  
 *0. Salir  
 *El menú debe repetirse hasta que el usuario elija 0.
 *
 * @author allys
 */
public class DoWhile {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int numero;
        do{
        System.out.println("Ingrese un numero del 0 al 2:");
            numero=tcl.nextInt();
            switch (numero) {
                case 1:
                    System.out.println("SALUDAR");
                    break;
                case 2:
                    System.out.println("FUNCIÓN NO IMPLEMENTADA");
                    break;
                case 0:
                    System.out.println("SALIR");
                    break;
                default :
                    System.out.println("ERROR");
            }
        }while(numero != 0);
    }
}
