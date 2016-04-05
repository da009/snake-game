 import java.awt.Color;
/**
 * Write a description of class Segment here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Segment
{
    // posición en x
    private int x;
    // posición en y
    private int y;
    // final del segmento en x
    private int xFinal;
    // final del segmento en y
    private int yFinal;
    // dirección del segmento
    private int direccion;
    // color del segmento
    private Color color;
    // longitud del segmento
    public static final int LONGITUD_SEGMENTO = 10;

    /**
     * Constructor for objects of class Segment
     */
    public Segment(int x, int y, int direccion, Color color)
    {
        this.x = x;
        this.y = x;
        this.direccion = direccion;
        this.xFinal = xFinal;
        this.yFinal = yFinal;
    }
    
    public int getPosicionFinalX()
    {
      int posicionFinalX = x;
      // 0
      if(direccion == 0)
      {
        posicionFinalX = x + LONGITUD_SEGMENTO;
      }
      // 180
      else if(direccion == 1)
      {
        posicionFinalX = x - LONGITUD_SEGMENTO;
      }
      return posicionFinalX;
    }
    
    /*
     * Devuelve la coordenada del eje Y donde acaba el segmento
     */
    public int getPosicionFinalY()
    {
      int posicionFinalY = y;
      // 90
      if (direccion == 2)
      {
        posicionFinalY = y + LONGITUD_SEGMENTO;
      }
      // -90
      else if(direccion == 3)
      {
        posicionFinalY = y - LONGITUD_SEGMENTO;
      }
      return posicionFinalY;
    }

    /**
     * dibuja un segmento
     */
    public void dibujar(Canvas canvas)
    {
        canvas.setForegroundColor(color);
        canvas.drawLine(x, y, getPosicionFinalX() ,getPosicionFinalY());
    }
    
    /**
     * borra un segmento
     */
    public void borrar(Canvas canvas)
    {
        canvas.setForegroundColor(canvas.getBackgroundColor());
        canvas.drawLine(x, y, getPosicionFinalX() ,getPosicionFinalY());
    }
    
    /*
     * Devuelve la coordenada del eje X donde empieza el segmento
     */
    public int getPosicionInicialX()
    {
        return x;
    }
    
    /*
     * Devuelve la coordenada del eje Y donde empieza el segmento
     */
    public int getPosicionInicialY()
    {
        return y;
    }    
    
    /*
     * Devuelve la direccion que tiene el segmento
     */
    public int getDireccion()
    {
        return direccion;
    }
    
    /*
     * Devuelve true si el segmento colisiona con el segmento pasado como
     * parametro; false en otro caso
     */
    public boolean colisiona(Segment segmento)
    {
        return (x == segmento.getPosicionFinalX() && y == segmento.getPosicionFinalY());
    }
}
