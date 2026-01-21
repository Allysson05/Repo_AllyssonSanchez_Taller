
import java.util.Scanner;

/**
 *Problema: Defina una contraseña correcta (por ejemplo: "utpl").
Pida al ingresar usuario una contraseña hasta que sea correcta.
 * @author allys
 */
public class While {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
         String contraseña=" ";
         int intentos=0;
        while(!contraseña.equalsIgnoreCase("UTPL")){
            System.out.print("Ingrese una contraseña:");
            contraseña=tcl.next();
            intentos++;
        }
        System.out.println("ACCESO PERMITIDO EN "  +intentos+  "INTENTOS");
    }
}
