package UDD_5_y_6;

  public class Matriz_adyasencia {
    private int n;
    private int [][] matriz;
    // Se crea constructor

public Matriz_adyasencia(int n) {
    this.n = n;
    matriz = new int [this.n][this.n];
    //Se inicializa la matriz en cero
        
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            matriz[i][j] = 0;
                
            }
        }
    }
//Se crea el método agregar
public void agregar(int i, int j){
        matriz[i][j]+=1;        
   }
//Se agrega método para remover elemento
public void remover(int i, int j){
    if (matriz[i][j]>0) {
        matriz[i][j]-=1;
    }
}
    //Se crea método imprimir
    public void imprimir(){
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print("[" + matriz[i][j]+ "] ");
            }
        System.out.println();
        }
    }
}
