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

    @Override
    public int fetch(int p) {
        int inicio, fin, centro;
        int valorCentro;
        inicio = 0;
        fin = vector.length - 1;
        
        while (inicio<fin){
            centro = (inicio+fin)/2;
            valorCentro = vector[centro];         
            if (valorCentro == p){
                return valorCentro;
            } else {
                if (p < valorCentro) {
                    fin = centro - 1;
                } else {
                    inicio = centro + 1;
                }
            }
        }
        return -1;
    }
    
}
