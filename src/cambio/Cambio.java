/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambio;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Cambio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        metodo m = new metodo();
        String parte ;
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = s.nextInt();
        parte = Integer.toString(num);
        System.out.println(m.cantidadConLetra(parte));
    }
    
}
