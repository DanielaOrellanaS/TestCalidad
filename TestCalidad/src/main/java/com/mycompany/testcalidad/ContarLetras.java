/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testcalidad;

/**
 *
 * @author orell
 */
public class ContarLetras {

    static int contarLetras(String cadena, char letra){
        int contPos = 0, contVeces = 0, longCadena = 0; 
        longCadena = cadena.length(); 
        if(longCadena > 0){
            do{
                if (cadena.charAt(contPos) == letra) contVeces++;
                contPos++;
            } while(contPos < longCadena);
        }
        return contVeces; 
    }
}
