/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s09ejercicio01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S09ejercicio01 {
        
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Persona persona01 = new Persona();
//        Persona persona02 = new Persona();
//        Persona persona03 = new Persona();
//        Persona persona04 = new Persona();
//        
//        ArrayList<Alumnos> listaPersonas = new ArrayList<Persona>();
//        listaPersonas.add(persona01);
//        listaPersonas.add(persona02);
//        listaPersonas.add(persona03);
//        listaPersonas.add(persona04);
//        
//        listaPersonas.remove(0);
//        listaPersonas.remove(3);
//        
//        Persona buscarPersona = listaPersonas.get(2);
//        
//        int tamañoLista = listaPersonas.size();
//        // 04
//        
//        boolean isEmpty = listaPersonas.isEmpty();
//        
//        listaPersonas.clear();
//        
//                
        ArrayList<Integer> list = new ArrayList<Integer>();        
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);        
        System.out.println("El promedio es " + calcularPromedio(list));
    }

    public static int suma(ArrayList<Integer> list) {
        int suma = 0;
        for (int i = 0; i < list.size(); i++) {
            suma = suma + list.get(i);            
        }
        return suma;
    }
    
    public static double calcularPromedio(ArrayList<Integer> list) {                
        double suma = (double)(suma(list));
        double promedio = suma / (list.size());
        return promedio;        
    }


    
    
    
    
    

    
    
}
