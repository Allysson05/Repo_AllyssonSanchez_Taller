
import java.util.Scanner;


/** Con un arreglo de `N` enteros (cargado por teclado):
- Mostrar todos los valores
- Contar cuántos son **pares** y cuántos **impares**

**Requisitos:**
- Mostrar al final: `Pares: X`, `Impares: Y`.
 *
 * @author allys
 */
public class ArregloRecorrido {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n;
        System.out.println("Ingrese el valor de n:");
        n=tcl.nextInt();
        int[] numeros= new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese los numeros de " + (i+1));
            numeros[i]=tcl.nextInt();
        }
        int pares=0;
        int impares=0;
        for (int i = 0; i < n; i++) {
            System.out.println(numeros[i]);
            if (numeros[i]%2 ==0){
                pares ++;
            }else{
                impares++;
            }
        }
        System.out.println("NUMEROS PARES = " +pares);
        System.out.println("NUMEROS IMPARES = " +impares);
    }
}
