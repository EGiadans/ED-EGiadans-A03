/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.egiadans.a03;

/**
 *
 * @author Eduardo
 */
public class Binaria extends Busquedas{
//Algoritmo de busqueda binaria
    @Override
    public int fetch(int p) { //Recibe como parametro el numero deseado
        int inicio, fin, centro; //Se definen variables de inicio, final y centro 
        int valorCentro; //Variable del valor del centro
        inicio = 0; //inicializa
        fin = vector.length - 1; //declarar valor de var Fin como tamaño del arreglo menos 1
        
        while (inicio<=fin){ //Mientras que inicio sea menor que fin se hara la busqueda
            centro = (inicio+fin)/2; //Se calcula la posicion del centro
            valorCentro = vector[centro]; //Se posiciona en en el vector          
            if (valorCentro == p){ //Si en este centro se encuentra el valor
                return centro; //regresa posicion del centro 
            } else {
                if (p < valorCentro) { //Si el numero es menor que el valor del centro
                    fin = centro - 1; //Ahora el fin sera el valor del centro menos 1
                } else {
                    inicio = centro + 1; //De otro modo el inicio sera el valor del centro mas 1
                }
            }
        }
        return -1;
    }
    
    
    /**
     *
     * @param v
     */
    @Override
    public void seleccion(int[] v) {
        int menor, auxiliar;
        
        for (int i=0; i<v.length;i++){
             menor = i;
             for (int j = i+1;j<v.length;j++) {
                 if ( v[j] < v[menor] ) {
                     menor = j;
                 }
             }
             auxiliar = v[i];
             v[i] = v[menor];
             v[menor] = auxiliar;
        }
    }
    
    @Override
    public void insercion(int[] v) {
        int temp;
        int j;
        for (int i = 1; i<v.length; i++) {
            temp = v[i];
            j = i -1;
            
            while ( j>=0 && v[j]>temp  ) {
                v[j+1] = v[j];
                j--;
            }
            v[j+1] = temp;
        }
    }
    
    public void burbuja(){
        int temp;
        for (int i = 1; i<vector.length; i++){
            for (int j = 0; j<vector.length-1; j++){
                if (vector[j] > vector[j+1]) {
                    temp = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = temp;
                    //intercambio(vector[j], vector[j+1]);
                }
            }
        }
    }
    
    public void intercambio(int p1, int p2){ //Revisar
        int temp;
        temp = p1;
        p1 = p2;
        p2 = temp;
        
    }
    
    public void quickSort(int inicio, int fin){
        int i,j,pivote;
        i=inicio;
        j=fin;
        pivote = vector[(inicio+fin)/2];
        do { 
            while (vector[i] < pivote){
                i++;
            }
            while (vector[j] > pivote) {
                j--;
            }
            if (i <= j) {
                intercambio(i,j);
            }
                
        } while (i<=j); 
        if (inicio < j){
            quickSort(inicio,j);
        }
        if (i < fin) {
            quickSort(i,fin);                   
        }
    }
    
    public void merge(int inicio, int mitad, int fin) {
        
        int n1 = mitad - inicio + 1;
        int n2 = fin - mitad;
 
        //Arreglos auxiliares
        int L[] = new int [n1];
        int R[] = new int [n2];
 
        for (int i=0; i<n1; ++i) {      //Transferir contenido a arreglos auxiliares
            L[i] = vector[inicio + i];
        }
        for (int j=0; j<n2; ++j) {
            R[j] = vector[mitad + 1 + j];
        }
        
        int i = 0, j = 0;
 
        int k = inicio;
        
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                vector[k] = L[i];
                i++;
            } else {
                vector[k] = R[j];
                j++;
            }
            k++;
        }
 
        while (i < n1) {
            vector[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            vector[k] = R[j];
            j++;
            k++;
        }
    }
    
    public void mergeSort(int inicio, int fin) {
        if (inicio < fin) {
            int mitad = (inicio+fin)/2;
 
            mergeSort(inicio, mitad);
            mergeSort(mitad + 1, fin);
 
            merge(inicio, mitad, fin);
        }
    }
    
}
