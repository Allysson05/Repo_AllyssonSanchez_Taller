
import java.util.Scanner;


/**
 * Solicite una nota (0–100). Use métodos para:
- Leer y validar la nota
- Determinar estado: `Aprobado` (>=70) o `Reprobado`

**Requisitos:**
- Métodos sugeridos:
  - `leerNotaValida(Scanner sc)` → retorna int válido
  - `obtenerEstado(int nota)` → retorna String
- `main` solo orquesta y muestra.

 * @author allys
 */
public class PasoParametros {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
         int nota = leerNotaValida(tcl);
        String estado = obtenerEstado(nota);

        System.out.println("La Nota es : " + nota);
        System.out.println("El Estado es: " + estado);
    }
    public static int leerNotaValida(Scanner sc) {
        int nota;

        do {
            System.out.print("Ingrese una nota (0 - 100): ");
            nota = sc.nextInt();

            if (nota < 0 || nota > 100) {
                System.out.println("Nota inválida");
            }

        } while (nota < 0 || nota > 100);

        return nota;
    }
    public static String obtenerEstado(int nota) {
        if (nota >= 70) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }
}
