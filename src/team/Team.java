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

import java.util.ArrayList;


/**
 *
 * @author Carmen_Lucia3
 */
public class Team {

    String name;
    Player player; 
    ArrayList<Player> barcelona ;
    int maxSize=16;
    int i=0;
    int totalGoals=0;
    
    public Team (String name){
        this.name = name;
        this.barcelona= new ArrayList<Player>();
    }
    
    public String getName() {
        return this.name;
    }
     
    public void setName (String n){
        this.name = n;
    }
    
    public String getPlayerName(){
        return player.getName();
    }
    
    public int getGoalsByPlayer(){
        return player.getGoals();
    }
    
    public void printPlayers() {
        for (Player barcelonas : barcelona) {
            System.out.println( barcelonas );
        }
    }
    
    public void setMaxSize(int n){
        maxSize = n;
    }
    
    public int size(){
        return this.i;
    }
    
    public void addPlayer (Player player){
        if ( this.i < maxSize){
            this.barcelona.add(player);
            this.i++;
            this.totalGoals = this.totalGoals + player.getGoals();
        }
    }
    
    public int goals(){
        return this.totalGoals;
    }
    
    public static void main(String[] args) {
        Team barcelona = new Team("FC Barcelona");
        System.out.println("Team: " + barcelona.getName());
        barcelona.setMaxSize(5);

        Player brian = new Player("Brian");
        System.out.println("Player: " + brian);

        Player pekka = new Player("Pekka", 39);
        System.out.println("Player: " + pekka);
        
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1)); 
        
        barcelona.printPlayers();

        System.out.println("Number of players: " + barcelona.size());
        
        System.out.println( "Total goals: " + barcelona.goals());
        
    }
 
}