/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Piotrek
 */
public class Proces {
    
    private int length;
    private int czasWejscia;
    
    public Proces(int time){
        length = (int) Math.random()*20;
        czasWejscia = time;
    }
    
    public Proces(int time, int len){
        length = len;
        czasWejscia = time;
    }
    
    public void setLength(int val){
        length = val;
    }
    
    public void setCzasWejscia(int val){
        czasWejscia = val;
    }
    
    public int getLength(){
        return length;
    }
    
    public int getCzasWejscia(){
        return czasWejscia;
        
    }
    
    
}
