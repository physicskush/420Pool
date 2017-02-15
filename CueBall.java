/*

*/
package ca.qc.bdeb.info204.pool;

/**
 *
 * @author 1536460 William Brouillard-Benoit
 */
public class CueBall extends Ball {
    
    private final int velociteMax =10;
    private int direction;
    
    public CueBall(int ballNumber, int positionX, int positionY) {
        super(0, positionX, positionY);
    }
    
    public void tirer(double velociteX, double velociteY){
        // calcul pour tirer la blanche ... 
       
    }
    
    public void direction(int direction){
        // direction de la blanche lorsque tirer
    }
    
}

