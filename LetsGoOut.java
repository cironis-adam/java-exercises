/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letsgoout;

/**
 *
 * @author adamc
 */
public class LetsGoOut {
    
    /***
     * Assignment:
        1. Make a function to count occurences of every word in a text and sort it by most frequent words.
        2. Given any number, sum up values of the even digits. (ex. sumDigits(123456) = 2+4+6
        3. Write a program to print multiplication table like this:
         1   2   3   4   5   6                                                                        
         2   4   6   8  10  12                                                                            
         3   6   9  12  15  18                                                                          
         4   8  12  16  20  24                                                                                 
         5  10  15  20  25  30                                                                         
         6  12  18  24  30  36
     */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // 1. Make a function to count occurences of every word in a text and sort it by most frequent words.
        System.out.println("===========================");
        System.out.println("1. Words and their occurences:");
        Text story = new Text(
                "Lorem Ipsum je demonstrativní výplňový text "
                + "používaný v tiskařském a knihařském průmyslu. "
                + "Lorem Ipsum je považováno za standard v této oblasti "
                + "už od začátku 16. století v Praze."
                );
        story.orderWordsByOccurences();
      
        // 2. Given any number, sum up values of the even digits
        System.out.println("===========================");
        System.out.println("2. Sum up only even digits:");
        int input = 123456;
        Digit digit = new Digit(input);   
        System.out.println("Sum of even digits in number " + input + ": " + 
                digit.sumDigits());
        
        // 3. Write a program to print multiplication table
        System.out.println("===========================");
        System.out.println("3. Write a program to print multiplication table:");
        for (int i = 1; i <= 6; i++) {
            
            for (int j = 1; j <= 6; j++) {
                if ((i * j) < 10) {
                    System.out.print(" " + i * j + " ");
                } else {
                    System.out.print(i * j + " ");
                }
            }

            System.out.println("");
            
        }
        
    }
    
}
