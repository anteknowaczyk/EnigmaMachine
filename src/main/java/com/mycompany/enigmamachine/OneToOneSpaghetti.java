
package com.mycompany.enigmamachine;

import java.util.stream.IntStream;

/**
 * A basic spaghetti.
 * @author Antoni Jan Nowaczyk
 */
public class OneToOneSpaghetti extends Spaghetti {
    int[] connections = IntStream.range(1, 27).toArray();
    
    public int get(int input) {
        return connections[input % 26];
    }
}
