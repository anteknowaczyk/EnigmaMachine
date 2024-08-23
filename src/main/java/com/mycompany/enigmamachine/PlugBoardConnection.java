
package com.mycompany.enigmamachine;

/**
 * A single connection in Plugboard.
 * @author Antoni Jan Nowaczyk
 */
public class PlugBoardConnection {
    private int leftLetter;
    private int rightLetter;
    
    public PlugBoardConnection(int l, int r) {
        this.leftLetter = l;
        this.rightLetter = r;
    }
    
    public boolean isConnected(int letter) {
        return letter == leftLetter || letter == rightLetter;
    }
    
    public int swap(int i) {
        if (i == leftLetter) {
            return rightLetter;
        } else if (i == rightLetter) {
            return leftLetter;
        } else {
            return i;
        }
    }
}
