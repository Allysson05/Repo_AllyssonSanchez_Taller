
import java.util.Scanner;


/**
 * Implementar un menú con opciones que llamen a métodos **void**:
1. Mostrar saludo
2. Mostrar tabla de un número (1..12)
0. Salir

**Requisitos:**
- Crear métodos:
  - `mostrarSaludo()`
  - `mostrarTabla(int n)`
- `main` controla el menú y llama a métodos.
 * @author allys
 */
public class MetodosSinRetorno {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int opcion;
        do{
            switch (opcion) {
                case 1:
                    System.out.println("mostrarSaludo()");
                    break;
                case 2:
                    System.out.println("Ingrese un numero del 1 al 12: ");
                    int num=tcl.nextInt();
                    if(num >= 1 && num <= 12){
                        System.out.println("mostrar tabla(num)");
                    }
                    break; 
                case 0:
                    System.out.println("SALIR");
                    break;
                default:
                    System.out.println("Error");
            }
        }while(opcion != 0);
    }
    public static void mostrarTabla(int num){
        System.out.println("La tabla es "+num);
        for (int i = 1; i < 12; i++) {
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
    
    
}
