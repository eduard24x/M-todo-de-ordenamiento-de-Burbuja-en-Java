
package metodoburbuja.eduardo;

/**
 *
 * @author Eduardo
 */
public class MetodoBurbuja {
    public void ordenarBurbuja(int[] array) {//Método que recibe como parámetro a un arreglo
        int aux;//Variable de tipo entero
        boolean cambios = false;//Variable de tipo booleana

        while (true) {//Ciclo infinito
            cambios=false;
            for (int i = 1; i < array.length; i++) {//Ciclo for para recorrer el arreglo
                if(array[i]<array[i-1]){
                    aux=array[i];//Guarda en aux el valor que está en la posición i
                    array[i]=array[i-1];//Cambio de la posición con la que se está comparando
                    array[i-1]=aux;//Almacenar aux en la posición (i-1)
                    cambios=true;
                }
            }
            if(cambios==false){//Si no se realizó ningun cambio(nuestro arreglo ya está ordenado)
                break;
            }
        }
    }
}

