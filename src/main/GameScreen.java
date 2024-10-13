package main;

import tile.TileManager;
import javax.swing.*;
import java.awt.*;

public class GameScreen extends JPanel {
    TileManager tileM = new TileManager(this);

    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        tileM.draw(g2d);
        g2d.dispose();
    }
}
