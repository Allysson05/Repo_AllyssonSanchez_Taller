
import java.util.Scanner;


/** Solicite `N` (1..50). Cree un arreglo de `N` enteros y cargue valores por teclado.

**Requisitos:**
- Validar N en rango.
- Al finalizar, mostrar `Carga completada`.

 *
 * @author allys
 */
public class ArregloCarga {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n;
        System.out.println("Ingrese el valor de n del (1 al 50):");
        n=tcl.nextInt();
        if(n >=1 && n <=50){
            int[] numeros=new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Ingrese el valor de " + (i+1) + " : " );
                numeros[i]=tcl.nextInt();
            }
            System.out.println("CARGA COMPLETADA");
        }else{
            System.out.println("ESTA FUERA DEL RANGO");
        }
    }
}
