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
public class Secuencial extends Busquedas{
//Algoritmo de busqueda secuencial 
    @Override
    public int fetch(int n) { //Recibe como parametro el numero a buscar
        for(int i=0;i<vector.length;i++){ 
            {
                if (n == vector[i]){ //Si el numero es la posicion actual del arreglo
                   return i;    //regresa esa posicion
                }
            }
        } return -1; //En este caso no se encontro
    }
    
}
