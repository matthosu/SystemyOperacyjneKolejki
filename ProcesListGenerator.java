/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 *
 * @author Piotrek
 */

import java.util.LinkedList;

public class ProcesListGenerator {
    
    public LinkedList<Proces> randGenerate(int arrayLength){
        LinkedList<Proces> list = new LinkedList();
        int safeClock = 0;
        for(int i=0; i < arrayLength; i++){            	// Dodawanie procesów losowej długości i czasie wejścia
            list.add(new Proces( (int) (Math.random() * safeClock) ));
            safeClock += list.getLast().getLength() + 1;
        }
        return sort(list);
    }
    
    public LinkedList<Proces> hyperbolaGenerate(int arrayLength){
        LinkedList<Proces> list = new LinkedList();
        int safeClock = 0;
        int len;
        for(int num =0; num < arrayLength;){          	// Dodawanie procesów malejącej długości i losowym czasie wejścia
            len = 29/++num;
            list.add(new Proces((int)(Math.random() * safeClock), len + 1 ));
            safeClock += list.getLast().getLength() + 1;
        }
        return sort(list);
    }
    
    public LinkedList<Proces> sqrtGenerate(int arrayLength){
        LinkedList<Proces> list = new LinkedList();
        int safeClock = 0;
        int len;
        for(int i=0; i < arrayLength;){               	// Dodawanie procesów rosnącej długości i losowym czasie wejścia
            len = (int) Math.sqrt(++i);
            list.add(new Proces((int)(Math.random() * safeClock), len + 1 ));
            safeClock += list.getLast().getLength() + 1;
        }
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
