package main;

import input.MyMouseListener;

import javax.swing.JFrame;

public class Main extends JFrame {

    private MyMouseListener myMouseListener;

    public Main () {
        setSize(768, 576);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(300, 150);

        GameScreen gameScreen = new GameScreen();
        add(gameScreen);
    }

    private void initInputs() {
        MyMouseListener myMouseListener = new MyMouseListener();
        addMouseListener(myMouseListener);
        addMouseMotionListener(myMouseListener);
    }

    public static void main(String[] args) {
        System.out.println("bro");
        Main main = new Main();
        main.initInputs();
    }
}