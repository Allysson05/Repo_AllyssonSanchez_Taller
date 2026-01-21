
import java.util.Scanner;


/**
 * Solicite 2 números y calcule:
- suma
- resta
- producto
- mayor (retornar el mayor)

**Requisitos:**
- Implementar métodos con retorno:
  - `sumar(double a, double b)`
  - `restar(double a, double b)`
  - `multiplicar(double a, double b)`
  - `mayor(double a, double b)`
 * @author allys
 */
public class MetodoConRetorno {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double a,b;
        double suma,resta,producto,mayor;
        System.out.println("Ingrese el valor de a: ");
        a=tcl.nextInt();
        System.out.println("Ingrese el valor de b:");
        b=tcl.nextInt();
        suma=(a+b);
        resta=(a-b);
        producto=(a*b);
        System.out.println("LA SUMA ES : " +suma);
        System.out.println("LA RESTA ES : " +resta);
        System.out.println("EL PRODUCTO ES : " +producto);
        
    }
    public static double sumar(double a, double b){
        return a + b;
    }
    public static double restar(double a, double b){
        return a - b;
    }
    public static double producto(double a, double b){
        return a * b;
    }
    public static double mayor(double a, double b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }
}
