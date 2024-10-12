package main;

import javax.swing.JFrame;

public class Main extends JFrame {
    public Main () {
        setSize(768, 576);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(300, 150);

        GameScreen gameScreen = new GameScreen();
        add(gameScreen);
    }

        public static void main(String[] args) {
        System.out.println("bro");
        Main main = new Main();
        }
}