/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team;

import java.util.ArrayList;


/**
 *
 * @author Carmen_Lucia3
 */
public class Team {

    String name;
    Player player; 
    ArrayList<Player> barcelona ;
    int maxSize;
    int i;
    int j;
    int totalGoals;
    
    public Team (String name){
        this.name = name;
        this.barcelona= new ArrayList<Player>();
    }
    public String getName() {
        return name;
    }
     
    public void setName (String n){
        name = n;
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
        i=0;
        for (Player barcelonas : barcelona) {
            i++;
        }
        System.out.println("i" + i);
        return i;
    }
    
    public void addPlayer (Player player){
        if ( i <= maxSize){
            this.barcelona.add(player);
        }
    }
    
    public int goals(){
        for (Player barcelonas : barcelona) {
            totalGoals= player.getGoals() + totalGoals;
        }
        return totalGoals;
    }
    
    public static void main(String[] args) {
        Team barcelona = new Team("FC Barcelona");

        Player brian = new Player("Brian");
        Player pekka = new Player("Pekka", 39);
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above

        System.out.println("Total goals: " + barcelona.goals());
    }
 
}
    
