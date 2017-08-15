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
    protected int[] vector; //Se establece el atributo heredable de la clase
    
    abstract public int fetch(int p); //Metodo abstracto para la propia busqueda
    
    public void setV( int[]v ){ //Setter para el vector
        this.vector = v;
    }
    
    public int[] randomV(int n) { //Creacion del vector con numeros Random
        Random rnd = new Random();
        int[] v = new int[n];
        for (int i=0;i<v.length;i++){
            v[i]=rnd.nextInt();
        }
        return v;
    }
    
    public int[] getV(){ //Getter para el vector
        return vector;
    }
    
    public void showV(){ //Mostrar valor de cada posicion del arreglo 
        for(int i=0;i<vector.length;i++){
            System.out.println("El valor en la posicion "+i+" es : "+vector[i]);
        }
    }
    
    public void showF(int p ){ //Muestra la posicion del numero deseado, recibiendo como parametro el numero
        System.out.println("La posicion del numero deseado es: "+p);
    }
}
