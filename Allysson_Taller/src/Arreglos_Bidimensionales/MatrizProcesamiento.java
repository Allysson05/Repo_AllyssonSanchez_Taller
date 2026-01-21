
import java.util.Scanner;


/**
 * Con una matriz `f x c`:
- Calcular suma total de elementos
- Si la matriz es cuadrada (f==c), calcular suma de la diagonal principal

**Requisitos:**
- Si no es cuadrada, mostrar `Diagonal no aplica`.
 * @author allys
 */
public class MatrizProcesamiento {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int f,c;
        System.out.println("Ingrese el numero de filas: ");
        f=tcl.nextInt();
        System.out.println("Ingrese el numero de columnas: ");
        c=tcl.nextInt();
        if(f >= 1 && f <= 10 && c >= 1 && c <= 10){
            int [][]matriz=new int [f][c];
            int sumaTotal=0;
            int sumaDiagonal=0;
            for (int i = 0; i < f; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.println("Ingrese los valores de ");
                    matriz[i][j]=tcl.nextInt();
                    sumaTotal += matriz[i][j];
                    if(i==j){
                        sumaDiagonal += matriz[i][j];
                    }
                }
            }
            if (f == c){
                System.out.println("SUMA DE LA DIAGONAL PRINCIPAL");
            }else{
                System.out.println("DIAGONAL NO APLICA");
            }
        }
    }
}
