package burbuja; 
/**
 *
 * @author jjggs_000
 */
import java.util.*;
import javax.swing.JOptionPane;

public class Burbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          Scanner leer = new Scanner(System.in);
          int arreglo[], nElementos, aux;
          nElementos = Integer.parseInt(JOptionPane.showInputDialog
         ("Ingrese la cantidad de "+" numeros que requiera")); 
          
          arreglo = new int [nElementos];
          
          for (int i= 0; i < nElementos; i++){
              System.out.println(".  Ingrese el numero:  ");
              
          }
          for (int i = 0; i < (nElementos-1); i++){
              for (int j = 0; j < (nElementos-1); j++){
                  if (arreglo[j] > arreglo [j+1]){
                      aux = arreglo[j];
                      arreglo[j] = arreglo[j+1];
                      arreglo[j+1] = aux;
                  }
              }
          }
          System.out.print("\n Arreglo ordenado en forma ascendente");
          for (int i = 0; i < nElementos; i++){
              System.out.print(arreglo[i] + " - ");
          }
          System.out.print("\n Arreglo ordenado en forma descendnte");
          for (int i = (nElementos-1); i >= 0; i--){
              System.out.print(arreglo[i]+ " - " );
          }
          System.out.print(" ");
     }
    
    
}
