package UDD_5_y_6;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Victus
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            //Se realiza la instanciacion del objeto 
        Matriz_adyasencia elementos = new Matriz_adyasencia(5);        
        
    // es un argumento (0,1)
    
    elementos.agregar(0, 1);
    elementos.agregar(0, 2);
    elementos.agregar(0, 3);
    elementos.agregar(0, 4);
    
    elementos.agregar(1, 4);
    elementos.agregar(1, 1);
    elementos.agregar(1, 3);
    
    elementos.agregar(2, 4);
    elementos.agregar(2, 1);
    elementos.agregar(2, 3);
    
    elementos.agregar(3, 3);
    elementos.agregar(3, 2);
    
    elementos.agregar(4, 4);
    elementos.agregar(4, 3);
    elementos.agregar(4, 2);
    elementos.agregar(4, 1);
    
    elementos.imprimir();
    }
    
}
