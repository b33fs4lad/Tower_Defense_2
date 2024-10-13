package main;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
public class background extends JFrame {

    BufferedImage background;

    public background() {
        try {
            background = ImageIO.read(new File("res/path.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

