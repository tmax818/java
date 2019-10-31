/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassNotes;

/**
 *
 * @author tmax818
 */
public class Main {
    
    public static void main(String[] args){
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        
        p1.setName("Todd");
        p1.setPoints(256);
        p1.addAPoint();
        
        System.out.println("Player 1 name: " + p1.getName());
        System.out.println("Player 1 points: " + p1.getPoints());
        
        //or
        System.out.println("Player 1 toString method : " + p1.toString());
        System.out.println("Player 1 class: " + p1.getClass());
        System.out.println("Player 1 hash: " + p1.hashCode());
    }
    
}
