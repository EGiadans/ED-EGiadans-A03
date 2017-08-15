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
        Scanner tec = new Scanner (System.in); 
        System.out.println("Introduzca el numero de elementos del arreglo ");
        int x = tec.nextInt();
        Secuencial os = new Secuencial();
        os.setV(os.randomV(x));
        os.showV();
        System.out.println("Introduzca el numero cuya posicion desea conocer: ");
        int nD = tec.nextInt();
        int p = os.fetch(nD);
        os.showF(p);
 
    }
    
}
