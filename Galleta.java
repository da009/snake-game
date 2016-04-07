
/**
 * Write a description of class Galleta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Galleta
{
    // instance variables - replace the example below with your own
    private int xPos;
    private int yPos;
    private int diametro;

    /**
     * Constructor for objects of class Galleta
     */
    public Galleta(int xPos, int yPos, int diametro)
    {
        this.xPos = xPos;
        this.yPos = yPos;
        this.diametro = diametro;
    }
    
    public int getXPos()
    {
        return xPos;
    }
    
    public int getYPos()
    {
        return yPos;
    }
    
    public int getDiametro()
    {
        return diametro;
    }
}
