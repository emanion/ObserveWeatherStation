
package lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author emanion
 */
public class ListPractice {
    
    public static void main(String[] args) {
        
        //good way to instantiate
        List myList = new ArrayList();
        List myList2 = new Vector();
        
        // bad way to instantiate
        //bad   bad   bad  bad
        //ArrayList anotherList = new ArrayList();
        
        //cannot store a primitive,  only objects!!!!!
        myList.add("Hello");
        myList.add(5);
        
        //the following line GETS AN ERROR!!!!  Comes out as object!!!!!
        //the following line GETS AN ERROR!!!!  Comes out as object!!!!!
        //the following line GETS AN ERROR!!!!  Comes out as object!!!!!
        //the following line GETS AN ERROR!!!!  Comes out as object!!!!!
        //the following line GETS AN ERROR!!!!  Comes out as object!!!!!
        //String s2 = myList.get(0);
        String s2 = myList.get(0).toString();
        
        //now....  single data type lists....
        List<String> myListString = new ArrayList<>();
        
        
        
        
        
    }
    
}
