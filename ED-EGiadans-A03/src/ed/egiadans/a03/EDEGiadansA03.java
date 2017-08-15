/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.egiadans.a03;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class EDEGiadansA03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se pide al usuario el numero de elementos que tendra el arreglo
        Scanner tec = new Scanner (System.in); 
        System.out.println("Introduzca el numero de elementos del arreglo ");
        int x = tec.nextInt();
        //Se instancia un objeto de la clase Secuencial para una busqueda secuencial
        Secuencial os = new Secuencial();
        //Se crea el arreglo
        os.setV(os.randomV(x));
        //Se muestran los valores del arreglo 
        os.showV();
        //Se pide el numero a buscar
        System.out.println("Introduzca el numero cuya posicion desea conocer: ");
        int nD = tec.nextInt();
        //Se busca el numero deseado
        int p = os.fetch(nD);
        //Se muestra posicion de ese numero
        os.showF(p);
 
    }
    
}
