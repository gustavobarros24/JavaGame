package src.main;

import javax.swing.JPanel;
import java.awt.Dimension;

public class GamePanel extends JPanel {

    public GamePanel() {
        this.setPreferredSize(new Dimension(800, 600));
        final int originalTileSize = 16;
    }

    // Add other game-related methods here
}