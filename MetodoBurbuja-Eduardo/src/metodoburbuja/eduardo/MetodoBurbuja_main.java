package metodoburbuja.eduardo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class MetodoBurbuja_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner introducido = new Scanner(System.in);

        System.out.println("\n METODO DE LA BURBUJA \n");
        
        int elementos;//Variable de tipo entero
        System.out.println("Introduzca el número de elementos del arreglo:");
        elementos = introducido.nextInt();

        int arreglo[] = new int[elementos];// Crea el arreglo y Asigna el tamaño al arreglo
        for (int i = 0; i < elementos; i++) {//Recorre al arreglo
            System.out.println("Introduzca el elemento que estará en la posición " + (i + 1) + ":");
            arreglo[i] = introducido.nextInt();
        }

        System.out.println("\n ORDENAMIENTO POR EL MÉTODO DE LA BURBUJA \n");

        String datos = "Los elementos que ha Introducido Son: \n";//Muestra el arreglo original
        for (int k = 0; k < arreglo.length; k++) {
            datos = datos + arreglo[k] + "\n";
        }
        System.out.println(datos + "");

        MetodoBurbuja ordenar = new MetodoBurbuja();//Creación del objeto ordenar
        ordenar.ordenarBurbuja(arreglo);//Llamada al método ordenarBurbuja

        String datos3 = "Los Elementos Ordenados Ascendentemente son:\n";//Recorre al arreglo ascendentemente
        for (int k = 0; k < arreglo.length; k++) {
            datos3 = datos3 + arreglo[k] + "\n";
        }

        String datos4 = "Los Elementos Ordenados Descendentemente son:\n";//Recorre al arreglo descendentemente
        for (int j = arreglo.length - 1; j >= 0; j--) {
            datos4 = datos4 + arreglo[j] + "\n";
        }

        System.out.println(datos3);
        System.out.println(datos4);

    }
}
