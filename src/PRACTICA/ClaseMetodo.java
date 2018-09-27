package PRACTICA;

/**
 * @author Benjamin Angel Granados Moore
 */

public class ClaseMetodo {
    
    int i,j,temporal,pasadas;
    
    public ClaseMetodo(){
        
        this.i=0;
        this.j=0;
        this.temporal=0;
        
    }
    
    public static void Burbuja (int[]arreglo){
        int cont=0, aux;
        
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length-1; j++) {
                if (arreglo[j]>arreglo[j+1]){
                    aux=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                }
                cont++;                
            }            
        }
        System.out.println("Terminó en " + cont + "pasadas");

}
    public static void Shell (int[]arreglo){
        int salto=0,temp=0,i=0,j;
        boolean cambio;
        for(salto=arreglo.length/2;salto!=0;salto/=2){
            cambio=true;
            while(cambio){
                cambio=false;
                for(i=salto;i<arreglo.length;i++){
                    if(arreglo[i-salto]>arreglo[i]){
                        temp=arreglo[i];
                        arreglo[i]=arreglo[i-salto];
                        arreglo[i-salto]=temp;
                        cambio=true;
                    }
                }
            }
        }

    }
    
    public static void InsercionDirecta(int arreglo[]){
    int p, j;
    int aux;
    for (p = 1; p < arreglo.length; p++){ // desde el segundo elemento hasta
              aux = arreglo[p]; // el final, guardamos el elemento y
              j = p - 1; // empezamos a comprobar con el anterior
              while ((j >= 0) && (aux < arreglo[j])){ // mientras queden posiciones y el
                // valor de aux sea menor que los
                arreglo[j + 1] = arreglo[j];       // de la izquierda, se desplaza a
                j--;                   // la derecha
              }
              arreglo[j + 1] = aux; // colocamos aux en su sitio
    }
}
    
    public static void QuickSort(int[] vector, int izquierda, int derecha) {
        int pivote = vector[izquierda];
        int i = izquierda;
        int j = derecha;
        int auxIntercambio;
        while (i < j) {
            while (vector[i] <= pivote && i < j) {
                i++;
            }
            while (vector[j] > pivote) {
                j--;
            }
            if (i < j) {
                auxIntercambio = vector[i];
                vector[i] = vector[j];
                vector[j] = auxIntercambio;
            }
        }
        vector[izquierda] = vector[j];
        vector[j] = pivote;
        if (izquierda < j - 1) {
            QuickSort(vector, izquierda, j - 1);
        }
        if (j + 1 < derecha) {
            QuickSort(vector, j + 1, derecha);
        }
    }
}