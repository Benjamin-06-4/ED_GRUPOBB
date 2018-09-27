package PRACTICA;
import static PRACTICA.ClaseMetodo.QuickSort;
import static PRACTICA.ClaseMetodo.Shell;
import static PRACTICA.ClaseMetodo.Burbuja;
import static PRACTICA.ClaseMetodo.InsercionDirecta;
import java.io.*;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 * @author Benjamin Angel Granados Moore
 */

public class mainClaseMetodo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidad, numero,opcion;
        String imprimir;
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad: "));
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Elige una opción: \n[1]Burbuja \n[2]Shell \n[3]Inserción Directa \n[4]QuickSort"));
        
        int [] arreglo = new int [cantidad];
        

        for (int i=0;i<arreglo.length;i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero"));
            arreglo[i]=numero;
        }
         
        
        switch (opcion){
            case 1:
                imprimir = "";
                Burbuja(arreglo);
                for(int i=0;i<arreglo.length;i++){
                imprimir +=arreglo[i] + " -- " + "\t";
                JOptionPane.showMessageDialog(null, imprimir);    
                //System.out.print("[" + arreglo[i]+"]->");
                }
                break;
                
            case 2:
                imprimir = "";
                Shell(arreglo);
                for(int i=0;i<arreglo.length;i++){
                imprimir += "[" + arreglo[i]+ "]->" + "\t";
                JOptionPane.showMessageDialog(null, imprimir); 
                //System.out.print("[" + arreglo[i]+"]->");
                }
                break;
            case 3:
                imprimir = "";
                InsercionDirecta(arreglo);
                for(int i=0;i<arreglo.length;i++){
                imprimir += "[" + arreglo[i]+ "]->" + "\t";
                JOptionPane.showMessageDialog(null, imprimir);
                }
                //System.out.print("[" + arreglo[i]+"]->");
                break;
            case 4:
                imprimir = "";
                int[] numeros = new int[cantidad];
                Random rnd = new Random();
                for (int i = 0; i < numeros.length; i++) {
                    numeros[i] = rnd.nextInt(cantidad);
                    imprimir += "[" + numeros[i]+ "]->" + "\t";
                    //JOptionPane.showMessageDialog(null, imprimir)
                    //System.out.print(numeros[i] + " ");
                    JOptionPane.showMessageDialog(null, "Vector desordenado " + imprimir + " ");
                }
                //edadesordenadas = oClsOrdernamiento.burbuja(edades);
                QuickSortClass.quickSort(numeros, 0, numeros.length - 1);
                for (int i = 0; i < numeros.length; i++) {
                    JOptionPane.showMessageDialog(null, "\nVector Ordenado " + i + " ");
                }
                break;
        }
        
    }  

    private static class QuickSortClass {

        private static void quickSort(int[] numeros, int i, int i0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public QuickSortClass() {
        }
    }
}
