import java.util.Random;
import java.util.Scanner;

/**
 *Ingrese una nota final (0–100).  
 *Si la nota es **>= 70**, muestre `Aprobado`; caso contrario, `Reprobado`
 * @author allys
 */
public class IfDoble {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int nota;
        System.out.println("Dame la nota del 0 al 100: ");
        nota=tcl.nextInt();
        if (nota >= 70){
            System.out.println("ESTADO : APROBADO");
        }    else{
            System.out.println("ESTADO: REPROBADO");
        }    
    }
}
