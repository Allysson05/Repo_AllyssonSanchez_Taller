
import java.util.Scanner;


/** Con un arreglo de `N` enteros (cargado por teclado), calcular:
- Mayor
- Menor
- Promedio (double)

**Requisitos:**
- Validar N (1..50).
- Mostrar resultados con 2 decimales en el promedio.
 *
 * @author allys
 */
public class ArregloProcesamiento {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n;
        System.out.println("Ingrese el valor de n: ");
        n=tcl.nextInt();
        if(n >= 1 && n <= 50){
            int [] enteros= new int [n];
            for (int i = 0; i < n; i++) {
            System.out.println("Ingrese los valores de " + (i+1));
            enteros[i]=tcl.nextInt();
            }
        int mayor=enteros[0];
        int menor=enteros[0];
        int suma=0;
                for (int  i= 0; i < n; i++) {
                    suma += enteros[i];
                    if(enteros[i] > mayor){
                        mayor=enteros[i];
                    }
                    if(enteros[i]< menor){
                        menor=enteros[i];
                    }
                }
            double promedio =(double)suma/n;
            System.out.println("EL NUMERO MAYOR ES:" +mayor);
            System.out.println("EL NUMERO MENOR ES:" +menor);
            System.out.printf("EL PROMEDIO ES: %.2f" +promedio);
        }
        
       }
    }
