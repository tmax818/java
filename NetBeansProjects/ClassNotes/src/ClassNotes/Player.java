package ClassNotes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tmax818
 */
public class Player {
    private String name;
    private int points;
    
    public Player(){
        name = "J. Doe";
        points = 0;
    }
    
    public Player(String newName){
//        if(!(newName.equalsIgnoreCase("BOssm4n69"))){
//            name = newName;
//        }
//        else {
//            System.out.println(newName + " is a bad name!")
//        } or
        setName(newName);
        points = 0;
    }
    
    public void setName(String newName){
        if(!(newName.equalsIgnoreCase("BOssm4n69"))){
            name = newName;
        }
        else {
            System.out.println(newName + " is a bad name!");
        }
    }
    public String getName(){
        return name;
    }
    public void setPoints(int newPoints){
        if(newPoints >= 0){
            points = newPoints;
        }
        else {
            System.out.println(newPoints + " is a bad point value!");
        }
    }
    public void addAPoint(){
        points++;
    }
    public int getPoints(){
        return points;
    }
    
    // toString() involves inheritance from the Object class
    @Override
    public String toString(){
        return "I am a player\n" + "name: " + name + "\npoints" + points + "\n";  
    }
    
    
}
