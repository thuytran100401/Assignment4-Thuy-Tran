
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
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ListManipulator {
    /**
     * To sort the list in order of ascending or descending
     * 
     * @param myList    the list need to sort
     * @param ascending order of the list is ascending or descending
     * @return the list in order of ascending or descending
     */
    public ArrayList<Integer> sort(ArrayList<Integer> myList, Boolean ascending) {
        ArrayList<Integer> list = (ArrayList<Integer>) myList.clone();
        if (ascending) {
            Collections.sort(list);
        } else {
            Collections.sort(list, Collections.reverseOrder());
        }
        return list;
    }

    /**
     * This method use to swap the smallest and largest number in the list
     * 
     * @param myList the list content the numbers to swap
     * @return the list with the swap between smallest and largest number
     */
    public ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myList) {
        ArrayList<Integer> list = (ArrayList<Integer>) myList.clone();
        int smallestIndex = 0;
        int largestIndex = 0;
        for (int i = 0; i <= list.size(); i++) {
            if (list.get(i) < list.get(largestIndex)) {
                largestIndex = i;
            }
            if (list.get(i) > list.get(smallestIndex)) {
                smallestIndex = i;
            }
        }
        int temp1 = list.get(largestIndex);
        int temp2 = list.get(smallestIndex);
        list.set(largestIndex, temp2);
        list.set(smallestIndex, temp1);
        return list;
    }

    /**
     * Create a table for the values and the number they occurs
     * in the ordered of the number occurs from small to large
     * 
     * @param myList the list need to create table
     */
    public void table(ArrayList<Integer> myList) {
        HashMap<Integer, Integer> a = new HashMap<>();
        for (int i = 0; i < myList.size(); i++) {
            if (!a.containsKey(myList.get(i))) {
                a.put(myList.get(i), 1);
            } else {
                a.put(myList.get(i), a.get(myList.get(i)) + 1);
            }
        }
        Map<Object, Object> b = a.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        System.out.println("Values \t|\tNumber Occurs");
        for (Object key : b.keySet()) {
            System.out.println(key + "\t|\t" + a.get(key));
        }
    }

}