package src.main;

import javax.swing.JPanel;


import java.awt.Color;
import java.awt.Dimension;


public class GamePanel extends JPanel implements Runnable {

    final int originalTileSize = 16;
    final int scale = 2;
    final int tileSize = originalTileSize * scale; //32x32 tile
    final int maxScreenCol = 18;
    final int maxScreenRow = 25;
    Thread gameThread;
    //final int screenWidth = tileSize * maxScreenCol; //768
    //final int screenHeight = tileSize*maxScreenRow; //576

    public GamePanel(){
        this.setPreferredSize(new Dimension(800, 600));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }

    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run(){
        
    }
}