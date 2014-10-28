

package lab1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emanion
 */
public class Team {
    
    String teamColor;
    private List <TeamColorChangeSubscriber> subscribers;

    public Team(String color) {
        subscribers = new ArrayList<>();
        this.teamColor = color;
    }

    public Team() {
        subscribers = new ArrayList<>();
    }

       
    public String getTeamColor() {
        return teamColor;
    }

    public void setTeamColor(String color) {
        this.teamColor = color;
        notifySubscribers();
    }
    
    public void addSubscriber(TeamColorChangeSubscriber subscriber){
        subscribers.add(subscriber);
    }
    
    public void notifySubscribers(){
        for (TeamColorChangeSubscriber subscriber: subscribers){
            subscriber.processColorChange(getTeamColor());
        }
        
        
    }
    
    
}
