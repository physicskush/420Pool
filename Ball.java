package ca.qc.bdeb.info204.pool;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.JComponent;



/**
 *
 * @author 1536460 William Brouillard-Benoit
 */
public class Ball extends JComponent{
    
    private int positionX;
    private int positionY;
    private double velociteX;
    private double velociteY;
    private double velociteMax = 10 ; // à revérifier
    private int ballNumber;
   
    private boolean cache ;
   
    ArrayList<Image> listeImageBall = new ArrayList(); 
    /*
        faire une méthode pour ajouter chaque image de balle dans la liste.
    ex : .add(Toolkit.getDefaultToolkit().getImage("images/vaisseau1top.gif"));
    plus créer un fichier pour stocker toutes les images du jeu. 
    */
  
    //ArrayList<Ball> listeBall = new ArrayList();  à mettre dans le ''monde'' 
    
    public Ball(int ballNumber, int positionX,int positionY){
        
        setPositionX(positionX);
        setPositionY(positionY);
        setVelociteX(0);
        setVelociteY(0);
        setCache(false);
        
        this.ballNumber = ballNumber;
        
    }

    public void setCache(boolean cache) {
        this.cache = cache;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public void setVelociteX(int velociteX) {
        this.velociteX = velociteX;
    }
    /*
        formule pour la vélocite voir  : https://github.com/devChuk/HackCODEDAY_NY
    */
    
    
    public void setVelociteY(int velociteY) {
        this.velociteY = velociteY;
    }

    public void setVelociteMax(int velociteMax) {
        this.velociteMax = velociteMax;
    }

    public void setBallNumber(int ballNumber) {
        this.ballNumber = ballNumber;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public double getVelociteX() {
        return velociteX;
    }

    public double getVelociteY() {
        return velociteY;
    }

    
}

