/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team;


/**
 *
 * @author Carmen_Lucia3
 */
public class Player {

    static void printPlayers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    String name;
    int goals;
   
    
    public String getName(){
        return name;
    }
    
    public int getGoals(){
        return goals;
    }
    
       
    public Player (String name){
        this.name= name;
    }
    
    public Player (String name, int goals){
        this.name=name;
        this.goals=goals;
    }
     
    public String toString(){
        return name + ", goals " + goals;

    }    
}
