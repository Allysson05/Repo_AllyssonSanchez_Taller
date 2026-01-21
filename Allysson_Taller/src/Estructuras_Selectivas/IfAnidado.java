
import java.util.Scanner;


/** Ingrese un puntaje (0–100) y clasifique:
 *- 90–100: `Excelente`
 *- 70–89: `Bueno`
 *- 0–69: `En proceso`
 *
 * @author allys
 */
public class IfAnidado {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int puntaje;
        System.out.println("Ingrese una cantidad del 0 al 100: ");
        puntaje=tcl.nextInt();
        if(puntaje >= 90 && puntaje <=100){
            System.out.println("EXCELENTE");
        }else if (puntaje >=70 && puntaje <= 89) {
            System.out.println("BUENO");
        }else{
            System.out.println("EN PROCESO");
        }
    }
}
