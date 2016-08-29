package linkedlist;

import java.util.LinkedList;
import java.util.List;

public class linkedList {

    public static void main(String[] args) {

        
        List lista = new LinkedList();
        //LinkedList lista2 = new LinkedList();
        
        lista.add("andres");
        lista.add(2);
        lista.add(3);
        
        //System.out.println(lista.size());//tamaño cantidad de la lista
        System.out.println(lista.get(0));//contenido primer indece
        System.out.println(lista.get(1));//contenido segundo indece
        
    }
    
}
