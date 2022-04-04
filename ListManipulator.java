
/**
 * Exercise 1: 
 * ListManipulator Class: 
 *  Define and implement a class that works with Java ArrayList<Integer> data structure.
 *  This class should have the following methods:
 *     ArrayList<Integer> sort(ArrayList<Integer> myLst, Boolean ascending)  
 *     ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst)
 *     void table(ArrayList<Integer> myLst)
 * 
 * @author Thuy Tran
 * April 3, 2022
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ListManipulator {
    /**
     * To sort the list in order of ascending or descending
     * 
     * @param ascending order of the list is ascending or descending
     * @return the list in order of ascending or descending
     */
    public ArrayList<Integer> sort(ArrayList<Integer> myList, Boolean ascending) {
        if (ascending) {
            Collections.sort(myList);
        } else {
            Collections.sort(myList, Collections.reverseOrder());
        }
        return myList;
    }

    /**
     * This method use to swap the smallest and largest number in the list
     * 
     * @param myList the list content the numbers to swap
     * @return the list with the swap between smallest and largest number
     */
    public ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myList) {
        int minElement = 0;
        int maxElement = 0;
        minElement = myList.indexOf(Collections.min(myList));
        maxElement = myList.indexOf(Collections.max(myList));
        Collections.swap(myList, minElement, maxElement);
        return myList;
    }

    /**
     * Create a table for the values and the number they occurs
     * in the ordered of the number occurs from small to large
     * 
     * @param myList the list need to create table
     */
    public void table(ArrayList<Integer> myList) {
        Map<Integer, Integer> myHm = new HashMap<Integer, Integer>();
        for (Integer key : myList) {
            Integer count = myHm.get(key);
            myHm.put(key, (count == null) ? 1 : count + 1);
        }
        for (Map.Entry<Integer, Integer> val : myHm.entrySet()) {
            System.out.println("value: " + val.getKey() + " occurs " + val.getValue() + " times");
        }
    }

}