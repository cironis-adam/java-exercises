/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letsgoout;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author adamc
 */
public class Digit {
    
    private int digit;
    
    public Digit(int number) {
        
        digit = number;
        
    }
    
    /***
     * Return true if the number x is event
     * @param x int
     * @return boolean
     */
    private boolean isEven(int x) {
    
        return x % 2 == 0;
        
    }
    
    /***
     * Return a sum of the even numbers included in the number
     * @return int
     */
    public int sumDigits() {
    
        int[] digitArray = String
                .valueOf(digit)
                .chars()
                .map(Character::getNumericValue)
                .toArray();
        
        List<Integer> digitList = Arrays
                .stream(digitArray)
                .boxed()
                .collect(Collectors.toList());
        
        int result = digitList.stream()
                .filter(p -> isEven((int) p))
                .mapToInt(Integer::intValue)
                .sum();
        
        return result;
        
    }
    
}
