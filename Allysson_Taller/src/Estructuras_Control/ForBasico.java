
import java.util.Scanner;


/**Solicite un número entero `n` y muestre su tabla del 1 al 12.

**Requisitos:**
- Usar **for**.
- Validar que `n` sea positivo.

**Salida esperada (formato sugerido):**
`n x i = resultado`
 *
 * @author allys
 */
public class ForBasico {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int numero;
        System.out.println("Deme un numero:");
        numero=tcl.nextInt();
        if(numero >0){
            for (int i = 1; i < 13; i++) {
                System.out.println(numero + "x" + i + "=" + (numero*i));
            }
        }else{
            System.out.println("EL NUMERO DEBE SER POSITIVO");
        }
    }
}
