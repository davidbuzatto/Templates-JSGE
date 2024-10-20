package jsgevscode;

import br.com.davidbuzatto.jsge.core.Engine;
import br.com.davidbuzatto.jsge.geom.Rectangle;

/**
 * JSGE basic game template.
 * 
 * @author Prof. Dr. David Buzatto
 */
public class Main extends Engine {
    
    public Main() {
        
        super (
            800,             // width
            450,             // height
            "Window Title",  // title
            60,              // target FPS
            true,            // antialiasing
            false,           // resizable
            false,           // full screen
            false,           // undecorated
            false            // always on top
        );
        
    }
    
    /**
     * Creates the game world.
     * 
     * This method runs just one time during engine initialization.
     */
    @Override
    public void create() {
    }

    /**
     * Reads user input and update game world.
     * 
     * Input methods should be used here.
     * You MUST NOT use any of the engine drawing methods here.
     */
    @Override
    public void update() {
    }
    
    /**
     * Draws the game world.
     * 
     * All drawing related operations MUST be performed here.
     */
    @Override
    public void draw() {
        
        clearBackground( WHITE );
        setFontSize( 40 );
        setFontStyle( FONT_BOLD );

        String text = "Basic game template";
        Rectangle r = measureTextBounds( text );
        
        double x = getScreenWidth() / 2 - r.width / 2;
        double y = getScreenHeight() / 2 - r.height / 2;
        fillRectangle( x - 10, y, r.width + 20, r.height, BLACK );
        drawText( text, x, y + 10, WHITE );

        drawFPS( 20, 20 );
    
    }
    
    public static void main( String[] args ) {
        new Main();
    }
    
}
