import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class Canvas extends JPanel {
    
    private BufferedImage currentImage;
    
    @Override
    public void paintComponent(Graphics g) {        
        g.drawImage(currentImage, 0, 0, this.getWidth(), this.getHeight(), this);        
    }
    
    void setBufferImage(BufferedImage bI) {
        this.currentImage = bI;
    }
}
