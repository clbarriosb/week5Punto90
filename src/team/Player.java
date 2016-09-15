/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team;

/**
 *
 * @author Estudiante
 */
public class Player {
    
    String name;
    int goals;
   
    
    public String getName(){
        return this.name;
    }
    
    public int getGoals(){
        return this.goals;
    }
    
       
    public Player (String name){
        this.name= name;
    }
    
    public Player (String name, int goals){
        this.name=name;
        this.goals=goals;
    }
     
    public String toString(){
        return this.name + ", goals " + this.goals;

    }    
}
