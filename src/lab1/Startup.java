/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

/**
 *
 * @author emanion
 */
public class Startup {
    public static void main(String[] args) {
        
        Team tigers = new Team();
        
        Player playerOne = new Player();
        
        tigers.addSubscriber(playerOne);
        
        tigers.setTeamColor("Blue");
        
        
        
    }
    
}
