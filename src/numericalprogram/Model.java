/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package numericalprogram;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.LinkedList;


/**
 *
 * @author nicholaspeterson
 */

public class Model {
    
    // Variables //
    
    private int subSetArray[] = new int[100];
    private int num;
    
    private LinkedList subSetList = new LinkedList();
    
    
    
    
    // Getter and Setters //
    
    public void setSubSetArrray(int[] subSetArray){
        this.subSetArray = subSetArray;
    }
    
    public int[] returnSubSetArray(){
        return subSetArray;
    }
    
    public void setNum(int num){
        this.num = num;
    }
    
    
    
    
    // FUNCTIONS //
    
    // Increments array. Example
    // [0, 0, 9, 9, 9] will now be [0, 1, 0, 0, 0]
    public void incrementArray(){
        
        // writing code in seperate java project
        // then writing Junit test cases to verify quality
        // then copying code over to this method
        
    }
    
    // Fills the array with zeros
    public void fillArrayWithZeros(){
        Arrays.fill(subSetArray, 0);
    }
    
    // checks the sum of the array with num that user inputted
    public boolean checkSum (int[] checkSumArray){
        
        int sum = IntStream.of(checkSumArray).sum();
        
        // Print Array if it equals subSetNum
        if (sum == num){
            // printArray(checkSumArray);
            return true;
        }
        else
            return false;
    }
    
    // Prints the Array
    public void printArray(int[] theArray){
        System.out.println(Arrays.toString(theArray));
    }
    
    // Sorts the Array
    public void sortArray(){
        Arrays.sort(subSetArray);
    }
    
    
    
    
    
    
    
}
