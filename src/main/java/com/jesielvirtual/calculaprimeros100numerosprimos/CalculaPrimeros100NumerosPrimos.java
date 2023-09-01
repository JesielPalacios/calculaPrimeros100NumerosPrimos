/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.jesielvirtual.calculaprimeros100numerosprimos;

/**
 *
 * @author jesielpalacios
 */
public class CalculaPrimeros100NumerosPrimos {

    public static void main(String[] args) {
        Integer contador = 0;
        Integer index = 1;
        
        do {
            
            if (calcularNumeroPrimo ( index, contador)) {
                contador = contador + 1;
            }
            
            index = index + 1;
            
        } while (contador < 100);
    }
    
    private static Boolean calcularNumeroPrimo (Integer numero, Integer contador) {
        Boolean esPrimo = true;
        
        for (int i = 2; i < numero; i++) {
            
            if (numero % i == 0) {
                esPrimo = false;
            }
        }
        
        if (esPrimo) {
            System.out.println(contador + " - " + numero);
        }
        
        return esPrimo;
    }
}
