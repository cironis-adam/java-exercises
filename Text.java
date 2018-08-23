/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letsgoout;

import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.counting;


/**
 *
 * @author adamc
 */
public class Text {
    
    private String text;
    
    public Text(String input) {
    
        text = input;
        
    }
    
    /***
     * Order words by their occarence in text
     */
    public void orderWordsByOccurences() {

        String safeText = text.replace(".", "");
        Arrays.stream(safeText.split("\\s+"))
                .collect(Collectors.groupingBy(Function.<String>identity(), 
                        HashMap::new, counting()))
                .entrySet()
                .stream()
                .sorted(((word1, word2) -> ((Long)word2.getValue()).compareTo(
                        ((Long)word1.getValue()))))
                .forEach(System.out::println);

    }

}
