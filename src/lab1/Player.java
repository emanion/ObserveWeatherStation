

package lab1;

/**
 *
 * @author emanion
 */
public class Player implements TeamColorChangeSubscriber {
    
    public void processColorChange(String color){
        
        System.out.println( "I am changing my Jersey to a different color: " + color);
    }
    
}
