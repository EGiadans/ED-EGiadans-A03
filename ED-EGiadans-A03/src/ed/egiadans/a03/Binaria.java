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
        
        while (inicio<fin){ //Mientras que inicio sea menor que fin se hara la busqueda
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
    
}
