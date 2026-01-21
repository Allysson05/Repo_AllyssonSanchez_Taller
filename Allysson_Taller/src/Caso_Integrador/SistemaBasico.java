
import java.util.Scanner;


/**
 * Desarrollar un sistema en consola que permita:
1. Registrar N estudiantes (1..30): nombre y nota (0..100)
2. Mostrar listado (nombre – nota)
3. Calcular y mostrar:
   - Promedio del curso
   - Mayor nota y estudiante
   - Menor nota y estudiante
4. Permitir buscar por nombre (coincidencia exacta) y mostrar su nota
 * @author allys
 */
public class SistemaBasico {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int nEstudiantes, num;
        System.out.print("Ingrese el numero de estudiantes: ");
        nEstudiantes = tcl.nextInt();
        String nombres [] = new String [nEstudiantes];
        double notaE [] = new double [nEstudiantes];               
        do {            
            System.out.println("   MENU   ");
            System.out.println("1: Registrar estudiantes");
            System.out.println("2: Registrar notas");
            System.out.println("3: Mostrar listado completo");
            System.out.println("4: Ver estadísticas (Promedio, Nota mayor y Nota menor)");
            System.out.println("5: Buscar estudiante por su nombre");
            System.out.println("0: Salir");
            System.out.print("Ingrese un opcion: ");
            num = tcl.nextInt();
            tcl.nextLine();
            switch (num) {
                case 1:
                    leerE(nombres, tcl);               
                    break;
                case 2:
                    leernotasN(notaE,nombres, tcl);
                    break;
                case 3:
                    mostrarN(nombres, notaE);
                    break;
                case 4:
                    mayor_menor(notaE, nombres);
                    System.out.println("El promedio del cuerso es: ");
                    System.out.printf("%.2f\n",prom(notaE));
                    break;
                case 5:
                    buscarNombre(nombres, notaE, tcl);
                    break;
                case 0:
                    System.out.println("Saliendo del menu");
                    break;    
                default:
                    System.out.println("Numero invalido");
            }
        } while (num != 0);
    }
    public static void leerE (String arreglo [], Scanner tcl){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese el nombre del estudiante: ");
            arreglo [i] = tcl.nextLine();
        }
    }
    public static void leernotasN (double arreglo [], String arreglo2 [] ,Scanner tcl){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese la nota  del estudiante: "+arreglo2 [i]);
            arreglo [i] = tcl.nextDouble();
        }
    }
    public static void mostrarN (String arreglo [],double arreglo2 []){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo [i]+" = "+arreglo2 [i]);      
        }
    }
    public static double prom (double arreglo []){
        double suma =0, promedio = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo [i];
        }
        promedio = suma / arreglo.length;
        return promedio;
    }
    public static void mayor_menor (double arreglo [], String arreglo2 []){
        double mayor = arreglo [0], menor = arreglo [0];
        String nombreMenor = arreglo2 [0], nombreMayor = arreglo2 [0];
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo [i] > mayor){
                mayor = arreglo [i];
                nombreMayor = arreglo2 [i];
            }
            if (arreglo [i] < menor){
                menor = arreglo [i];
                nombreMenor = arreglo2 [i];
            }
        }
        System.out.println("La nota mayor es de "+nombreMayor+"con una nota de: "+mayor);
        System.out.println("La nota mayor es de "+nombreMenor+"con una nota de: "+menor);
    }        
    public static void buscarNombre (String arreglo [], double arreglo2 [], Scanner tcl){
        String nombre;
        boolean estado = false;
        System.out.println("Ingrese el nombre: ");
            nombre = tcl.nextLine();
        for (int i = 0; i < arreglo.length; i++) {            
            if (nombre.equalsIgnoreCase(arreglo[i])){
                System.out.println(arreglo [i]+ " = "+arreglo2 [i]);
                estado = true;
                break;
            }
        }
            if (estado == false)
                System.out.println("Estudiante no encontrado");

    }
}
