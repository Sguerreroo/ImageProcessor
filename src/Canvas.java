import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class Canvas extends JPanel {
    
    private BufferedImage currentImage;
    private String path;
    @Override
    public void paintComponent(Graphics g) {        
        g.drawImage(currentImage, 0, 0, this.getWidth(), this.getHeight(), this);        
    }
    
    void setBufferImage(BufferedImage bI) {
        this.currentImage = bI;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
    
}
