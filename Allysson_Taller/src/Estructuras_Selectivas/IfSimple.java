import java.util.Scanner;


/*Problema: Solicite al usuario su edad (entero).
Si la edad es mayor o igual a 18 , muestre: Acceso permitido.
Si no, no muestre nada adicional.
*/
public class IfSimple {
    public static void main(String[] args) {
       Scanner tcl = new Scanner(System.in); 
         int edad;
         System.out.println("Ingrese la edad: ");
         edad=tcl.nextInt();

        // PROCESO (IF SIMPLE)
        if (edad >= 18) {
            System.out.println("ACCESO PERMITIDO25");
            // TODO: mostrar mensaje de confirmación
        }
}
