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

    @Override
    public int fetch(int n) {
        for(int i=0;i<vector.length;i++){
            {
                if (n == vector[i]){
                   return i;
                }
            }
        } return -1;
    }
    
}
