
package com.mycompany.enigmamachine;

import java.util.ArrayList;

/**
 * A plugboard of connections in Enigma.
 * @author Antoni Jan Nowaczyk
 */
public class PlugBoard extends Encrypton {
    private final ArrayList<PlugBoardConnection> connections;
    
    public PlugBoard() {
        this.connections = new ArrayList<>();
    }
    
    public void addConnection(int l, int r) {
        boolean possible = true;
        
        for (PlugBoardConnection c : connections) {
            if (c.isConnected(r) || c.isConnected(l)) {
                possible = false;
            }
        }
        
        if (possible) {
            connections.add(new PlugBoardConnection(l, r));
        }
    }
    
    public int output(int input) {
       for (PlugBoardConnection c : connections) {
           if (c.isConnected(input)) {
               return c.swap(input);
           }
       } 
       return input;
    }
}
