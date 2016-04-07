import java.util.Random;

/**
 * Write a description of class SnakeGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeGame
{
    // instance variables - replace the example below with your own
    private Canvas lienzo;
    private Snake serpi;
    private Galleta galleta;
    public static final int ALTO_LIENZO = 600;
    public static final int ANCHO_LIENZO = 600;
    public static final int DIAMETRO_GALLETA = 6;
    public static final int maxGalletas = 50;

    /**
     * Constructor for objects of class SnakeGame
     */
    public SnakeGame()
    {
        lienzo = new Canvas("Lienzo", ALTO_LIENZO, ANCHO_LIENZO);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void drawSnake()
    {
      serpi = new Snake(ALTO_LIENZO, ANCHO_LIENZO);
      lienzo.erase();
      serpi.dibujar(lienzo);
    }
    
    /** 
     * Inicia el movimiento de la serpiente
     */
    public void animateSnake()
    {
        drawSnake();
        boolean mover = true;
        while (mover)
        {
            lienzo.wait(100);
            serpi.borrar(lienzo);
            mover = serpi.mover(lienzo);
            serpi.dibujar(lienzo);
        }
        lienzo.drawString("Game Over", (ALTO_LIENZO/2)-25, (ANCHO_LIENZO/2));
    }
    
    /**
     * dibuja galletas aleatorias
     */
    public void startGame()
    {
        Random rnd = new Random();
        int cont = 0;
        int galletas = rnd.nextInt(maxGalletas);
        while (cont < galletas)
        {
            galleta = new Galleta(rnd.nextInt(ALTO_LIENZO), rnd.nextInt(ANCHO_LIENZO), DIAMETRO_GALLETA);
            lienzo.fillCircle(galleta.getXPos(), galleta.getYPos(), DIAMETRO_GALLETA);
            cont++;
        }
        
        if (serpi.getXPosPrimerSegmento() == galleta.getXPos() ||
            serpi.getYPosPrimerSegmento() == galleta.getYPos())
        {
            lienzo.eraseCircle(galleta.getXPos(), galleta.getYPos(), DIAMETRO_GALLETA);
        }
    }
}
