package edu.uniandes.ecos.PSP0.app;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Hello world!
 * Ayuda tomada de: http://tpec05.blogspot.com/2013/11/programando-madia-variaza-y-desviacion_18.html
 */
public class App {

    public static void main(String[] args) {
        LinkedList col1;
        col1 = new LinkedList();

        /**
         * Captura de datos
         */
        try {
            
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de los numeros \n a realizar los calculos, 9999,0 para finalizar. por favor use ,");
        double Valor = 0;
        int i = 1;
        while (Valor != 9999.0) {
            System.out.print("Ingrese el valor " + i + ":");
            Valor = entrada.nextDouble();
            if(Valor!= 9999.0)
                col1.add(Valor);
            i++;
        }
        entrada.close();//se cierra el flujo entrada
        
           Psp0 c = new Psp0(col1);
        System.out.println("Media " + c.getMedia());
        System.out.println("Desviacion " + c.getDesviacion());
        } catch (Exception e) {
            System.out.println("Saque la mano, por favor vuelva a ejecutar, recuerde usar coma (,)");
            System.out.println(e.getMessage());
        }
        /**
         * Realizacion de calculos
         */
     
        System.out.println("Hello World!");
        System.out.println("Sebastian Cardona Correa");

    }
}
