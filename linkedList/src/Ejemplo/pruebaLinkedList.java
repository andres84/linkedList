package Ejemplo;

import java.util.*;

public class pruebaLinkedList {
 
    
    public static void main(String[] args) {
        
        LinkedList<String> personas = new LinkedList();
        
        personas.add("andres");
        personas.add("sara");
        personas.add("isabella");
        personas.add("liliana");
        
        System.out.println(personas.size());//tamaño de la lista enlazada
        
        //agregando iterador para que agregre un elemento en la lista
        
        
        ListIterator<String> iterador = personas.listIterator();
        
        
        
        iterador.add("lucas");//se agrega en la primera posicion
        
        iterador.next();
        
        iterador.add("esteban");
        
        //ciclo for que recorre y muestra por pantalla la lista
        for(String per : personas){
            
            System.out.println(per);
            
        }
    }
    
    
    
}
