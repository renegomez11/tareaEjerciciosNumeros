/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author Labderecho05
 */


public class Numeros {

     
    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int numero1=0;
        int mayor=0;
        int menor=0;
        int medio=0;
        int numero2=0;
        int numero3=0;
        int numero4=0;
        int suma=0;
    
        
       do
       {
           //peticion de consola a usuario
        System.out.print("Ingrese primer numero: ");
        numero1 = reader.nextInt();
        System.out.print("Ingrese segundo numero: ");
        numero2 = reader.nextInt();
        System.out.print("Ingrese tercer numero: ");
        numero3 = reader.nextInt();
        System.out.print("Ingrese cuarto numero: ");
        numero4 = reader.nextInt();
        
      
         
        //comprobacion de orden de numeros
        if(numero1>numero2)
        { 
            mayor = numero1;
            menor = numero2;
        }
        else {
            mayor = numero2;
            menor = numero1;
        }
        if(numero3>mayor)
        {
            medio=mayor;
            mayor=numero3;
            menor=menor;
        }
        else if (numero3<mayor)
        {
            mayor=mayor;
            if(numero3>menor){
                medio=numero3;
            }
            else
            {
                medio=menor;
                menor=numero3;
            }
        }
        suma=mayor+medio+menor;
        if(suma<20)
        {
       System.out.print("Mayor es: " + mayor + " " );
       System.out.print("Medio es: " + medio + " ");
       System.out.println("Menor es: " + menor + " ");
       
       System.out.print("Ingrese primer numero: ");
        numero1 = reader.nextInt();
        System.out.print("Ingrese segundo numero: ");
        numero2 = reader.nextInt();
        System.out.print("Ingrese tercer numero: ");
        numero3 = reader.nextInt();
        System.out.print("Ingrese cuarto numero: ");
        numero3 = reader.nextInt();
       
        }
        else
        {
       System.out.print("Mayor es: " + mayor + " " );
       System.out.print("Medio es: " + medio + " ");
       System.out.print("Menor es: " + menor + " "); 
        }
        }while (numero1<0 && numero2<0 && numero3<0  );
    }
       
        // TODO code application logic here
   }
    

