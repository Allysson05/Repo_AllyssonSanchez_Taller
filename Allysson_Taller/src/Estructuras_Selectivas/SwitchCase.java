import java.util.Scanner;

/** Construya un menú:
 *1. Sumar  
 *2. Restar  
 *3. Multiplicar  
 *4. Dividir  
 *
 * @author allys
 */
public class SwitchCase {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int operaciones;
        double num1,num2,resultado;
        System.out.println("Ingrses un numero del 1 al 4:");
        operaciones=tcl.nextInt();
        System.out.println("Ingrses el primer numero:");
        num1=tcl.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        num2=tcl.nextDouble();
        switch (operaciones){
            case 1:
                resultado=num1+num2;
                System.out.println("resultado es igual a :"+resultado);
                break;
            case 2:
                resultado=num1-num2;
                System.out.println("Resultado es igual a: "+resultado);
                break;
            case 3:
                resultado=num1*num2;
                System.out.println("Resultado es igual a:"+resultado);
                break;
            case 4:
                if(num2 == 0){
                    System.out.println("NO SE PUEDE DIVIDIR");
                }else{
                    resultado=num1/num2;
                    System.out.println("Resultado es igual a:"+resultado);
                }
                break;    
            default:
                System.out.println("MOSTAR: OPCIÓN INVALIDA");
        }
    }
}
