
import java.util.LinkedList;
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Piotrek
 */
public class Procesor {
    
    private int clock = 0;
    private int cycle;
    
    public Procesor(int kwant){
        clock = 0;
        cycle = kwant;
    }
    
    public int przetworz(Proces proc){
        
        clock++;                                                                // Czas na wczytanie procesu
        clock += cycle -1;                                                      // Przesnięcie na koniec cyklu
        int lengthLeft = proc.getLength() - cycle;
        return lengthLeft;
    }   
    
    public void setClock(int val){
        clock = val;
    }
    
    public void setKwantCzasu(int kwant){
        cycle = kwant;
    }
    
    public int getClock(){
        return clock;
    }
    
}
