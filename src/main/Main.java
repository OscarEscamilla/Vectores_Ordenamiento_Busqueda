/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author LAB-1
 */
public class Main {

    
    private int[] numeros;
        
    
        
        
    public void pedirDatos(){
        int cant = 1;
        Scanner teclado = new Scanner(System.in);
        //System.out.println("cuantos numeros desea guardar");
        //cant = teclado.nextInt();
        numeros = new int[10];
        for(int i = 0;i < 10; i++){//pide los 10 numeros
        System.out.println("ingrese el numero " + cant);
        numeros[i] = teclado.nextInt();
        cant += 1;
       }
    }
    /**
     * imprime todos los datos almacenados en el arreglo
     */
    public void imprimirDatos(){
        for(int i = 0; i < numeros.length; i++){
           System.out.print(numeros[i]+",");
       }
        System.out.println("");
    }
    /**
     * ordena todos los datos de el arreglo de menor a mayor
     */
    public void ordenarBurbuja(){
        int aux;
        for (int i = 0; i < numeros.length; i++) {
            for (int f = 0; f < numeros.length-1; f++) {
                if (numeros[f] > numeros[f+1]) {
                    aux = numeros[f];
                    numeros[f] = numeros[f+1];
                    numeros[f+1] = aux;
                } 
        }
        }
    }
    
    public void buscarDato(){
        int busqueda;
        boolean aviso = true;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el numero que desea buscar");
        busqueda = teclado.nextInt();
        
        for (int i = 0; i < numeros.length -1; i++) {
            if(numeros[i] == busqueda){
                System.out.println("numero encontrado " + numeros[i]+ "possicion " + (i+1));
                aviso = false;
                break;
            }
        }
        if (aviso == true){
            System.out.println("numero no encontrado");
        }
    }
    public static void main(String[] args) {
        Main main = new Main();//objeto para acceder a la clase main y traer los metodos
        
        main.pedirDatos();
        main.ordenarBurbuja();
        main.imprimirDatos();
        main.buscarDato();
       
       
       
       
    }
    
}
