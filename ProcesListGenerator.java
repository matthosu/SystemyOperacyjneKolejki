/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Piotrek
 */

import java.util.LinkedList;

public class ProcesListGenerator {
    
    public LinkedList<Proces> randGenerate(int arrayLength){
        LinkedList<Proces> list = new LinkedList();
        int safeClock = 0;
        for(int i=0; i < arrayLength; i++){                         // Dodawanie procesów losowej długości i casie wejścia
            list.add(new Proces( (int) (Math.random() * safeClock) ));
            safeClock += list.getLast().getLength() + 1;
        }sort(list);
        return sort(list);
    }
    
    public LinkedList<Proces> fatFirstGenerate(int arrayLength, int fattest){
        LinkedList<Proces> list = new LinkedList();
        int safeClock = 0;
        int len;
        int num = 1;
        for(int i=0; i < arrayLength; i++){                         // Dodawanie procesów malejącej długości i losowym casie wejścia
            len = fattest/num;
            list.add(new Proces((int)(Math.random() * safeClock), len + 1 ));
            safeClock += list.getLast().getLength() + 1;
        }sort(list);
        return sort(list);
    }
    
    private LinkedList<Proces> sort(LinkedList<Proces> list){
        
        LinkedList<Proces> tempList = new LinkedList();
        tempList.add(list.remove(0));
        int i;
        
        for(Proces proc : list){
            for(i = 0; proc.getCzasWejscia() <= tempList.get(i).getCzasWejscia(); i++);
            tempList.add(i, proc);  
        }
        System.out.println("Elementów w liście: " + tempList.size());
        return tempList;
    }
    
}
