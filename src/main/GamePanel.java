package main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    public GamePanel(){
    }


    public void paintComponents(Graphics g) {
        super.paintComponent(g);
        g.fillRect(100, 100, 200, 50);
    }
}
