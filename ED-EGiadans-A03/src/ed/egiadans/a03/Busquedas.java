/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.egiadans.a03;

import java.util.Random;


/**
 *
 * @author Eduardo
 */
public abstract class Busquedas {
    protected int[] vector;
    
    abstract public int fetch(int p);
    
    public void setV( int[]v ){
        this.vector = v;
    }
    
    public int[] randomV(int n) {
        Random rnd = new Random();
        int[] v = new int[n];
        for (int i=0;i<v.length;i++){
            v[i]=rnd.nextInt();
        }
        return v;
    }
    
    public int[] getV(){
        return vector;
    }
    
    public void showV(){
        for(int i=0;i<vector.length;i++){
            System.out.println("El valor en la posicion "+i+" es : "+vector[i]);
        }
    }
    
    public void showF(int p ){
        System.out.println("La posicion del numero deseado es: "+p);
    }
}
