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
    
    // Variables
    
    private int subSetArray[] = new int[100];
    private int num;
    
    private LinkedList subSetList = new LinkedList();
    
    
    
    
    // Getter and Setters
    
    public void setSubSetArrray(int[] subSetArray){
        this.subSetArray = subSetArray;
    }
    
    public int[] returnSubSetArray(){
        return subSetArray;
    }
    
    public void setNum(int num){
        this.num = num;
    }
    
    
    
    // FUNCTIONS
    
    public void checkSum (int[] checkSumArray, int subSetNum){
        
        int sum = IntStream.of(checkSumArray).sum();
        
        // Print Array if it equals subSetNum
        if (sum == subSetNum){
            printArray(checkSumArray);
        }
    }
    
    
    // Prints the Array
    public void printArray(int[] theArray){
        System.out.println(Arrays.toString(theArray));
    }
    
    public void sortArray(){
        Arrays.sort(subSetArray);
    }
    
    
    
    
    
}
