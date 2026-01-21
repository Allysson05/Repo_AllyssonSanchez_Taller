
import java.util.Scanner;


/** Solicite filas `f` (1..10) y columnas `c` (1..10). Cree una matriz `f x c` de enteros y llénela por teclado.

**Requisitos:**
- Validar rangos.
- Al finalizar, mostrar `Matriz cargada`.

 *
 * @author allys
 */
public class MatrizCarga {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int f,c;
        System.out.println("Ingrese el numero de filas: ");
        f=tcl.nextInt();
        System.out.println("Ingrese el numero de columnas: ");
        c=tcl.nextInt();
        if(f >= 1 && f <= 10 && c >= 1 && c <= 10){
            int [][] matriz=new int [f][c];
            for (int i = 0; i < f; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.println("Ingrese valores ["+ i + "]["+ j + "]");
                    matriz[i][j]=tcl.nextInt();
                }
            }
            System.out.println("MATRIZ CARGADA");
        }
    }
}
