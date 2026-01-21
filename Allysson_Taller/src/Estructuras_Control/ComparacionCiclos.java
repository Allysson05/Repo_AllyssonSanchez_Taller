
import java.util.Scanner;


/**Ingrese un entero `N` (>=1). Calcule la suma 1+2+...+N usando:
- while
- do-while
- for

Muestre los tres resultados y verifique que coinciden.

**Requisitos:**
- Validación de N (>=1).
- Mostrar:
  - `Suma con while: ...`
  - `Suma con do-while: ...`
  - `Suma con for: ...`
- Si no coinciden (no debería ocurrir), mostrar `Revisar implementación`
 *
 * @author allys
 */
public class ComparacionCiclos {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero:");
        num=tcl.nextInt();
        if(num >=1){
        int sumaWhile=0;
        int i=1;
            while(i<=num){
                sumaWhile += i;
                i++;
            }
            int sumaDoWhile=0;
            int j=1;
            do{
                sumaDoWhile += j;
                j++;
            }while(j<=num);
            int sumaFor=0;
            for (int k = 1; k <= num; k++) {
                sumaFor +=k;
            }
            System.out.println("LA SUMA CON WHILE ES: "+sumaWhile);
            System.out.println("LA SUMA CON DO WHILE ES:"+sumaDoWhile);
            System.out.println("LA SUMA CON FOR ES:"+sumaFor);
            if(sumaWhile==sumaDoWhile && sumaDoWhile==sumaFor){
                System.out.println("LOS RESULTADOS COINCIDEN");
            }else{
                System.out.println("REVISAR IMPLEMENTACION");
            }
        }
    }
}
