
package com.mycompany.enigmamachine;


/**
 * An abstract rotor in Enigma.
 * @author Antoni Jan Nowaczyk
 */
public class Rotor extends Encrypton {
    //The wired conncections between letters inside the rotor.
    private final Spaghetti spaghetti;
    
    //The current offset.
    private int offset;
    
    //The rim position;
    private final int rim;
    
    //The next rotor in Enigma.
    private final Rotor next;
    
    public Rotor(Spaghetti spa, int off, int rim, Rotor rot) {
        this.spaghetti = spa;
        this.offset = off;
        this.rim = rim;
        this.next = rot;
    }
    
    @Override
    public int output(int input) {
        rotate();
        if (offset == rim + 1) {
            rotateConnected();
        }
        return (spaghetti.get(input + offset));
    }
    
    public void rotate() {
        offset = (offset + 1) % 26;
    }
    
    private void rotateConnected() {
        next.rotate();
    }
}
