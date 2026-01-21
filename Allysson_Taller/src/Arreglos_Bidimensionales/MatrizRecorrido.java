
import java.util.Scanner;


/**
 * Con una matriz `f x c` (cargada por teclado):
- Mostrar la matriz en formato de tabla
- Calcular la suma de cada fila y mostrarla

**Requisitos:**
- Formato sugerido:
  - `Fila 1 -> suma = ...`
  - `Fila 2 -> suma = ...`
 * @author allys
 */
public class MatrizRecorrido {
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
                    System.out.println("Ingrese el valor ["+ i + "]["+ j +"]");
                    matriz[i][j]=tcl.nextInt();
                }
            }
            for (int i = 0; i < f; i++) {
                int sumaFila=0;
                for (int j = 0; j < c; j++) {
                    System.out.println(matriz[i][j] + "\t");
                    sumaFila += matriz[i][j];
                }
                System.out.println("----> Fila" + (i+1) + "suma = "+ sumaFila);
            }
        }
    }
}
