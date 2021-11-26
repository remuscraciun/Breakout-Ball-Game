package breakoutBall;

import javax.swing.*;

public class MyFrame extends JFrame {

    MyFrame(String title) {

        this.setTitle(title);
        this.add(new MyPanel());
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
}
