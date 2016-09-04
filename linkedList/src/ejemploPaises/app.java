package ejemploPaises;

import java.util.*;

public class app {

    public static void main(String[] args) {

        //agrega la lista de capitales a los paises
        
        LinkedList<String> paises = new LinkedList();

        paises.add("España");
        paises.add("Colombia");
        paises.add("Mexico");
        paises.add("Peru");

        LinkedList<String> capitales = new LinkedList();

        capitales.add("Madrid");
        capitales.add("Bogota");
        capitales.add("D.F");
        capitales.add("Lima");
        
        //System.out.println(paises);
        //System.out.println(capitales);
        
        //crear el iterador para las listas
        
        ListIterator<String> itpaises = paises.listIterator();
        ListIterator<String> itcapitales = capitales.listIterator();
        
        
        while(itcapitales.hasNext()){
            
            if(itpaises.hasNext()){
                
                itpaises.next();
                
            }
            
            itpaises.add(itcapitales.next());
            
        }
        
        System.out.println(paises);
        
        //eliminar los elementos pares de la nueva lista creada
        
        //colocar el iterador nuevamente al principio de la lista
        
        itcapitales = capitales.listIterator();
        
        while(itcapitales.hasNext()){
            
            itcapitales.next();
            
            if(itcapitales.hasNext()){
                
                itcapitales.next();
                itcapitales.remove();
            }
            
        }
        
        System.out.println(capitales);
        
        paises.removeAll(capitales);
        
        System.out.println(paises);
        
        
        
        
    }

}
