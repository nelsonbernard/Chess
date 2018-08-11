import javax.swing.*;
import java.awt.image.ImageObserver;

public class Game extends JFrame {



    public static void main(String[] args) {
        int WIDTH = 1000;
        int HEIGHT = 1000;

        Board board = new Board(WIDTH, HEIGHT);

        JFrame jframe = new JFrame();
        jframe.setSize(WIDTH,HEIGHT);
        jframe.setResizable(false);
        jframe.setLocationRelativeTo(null);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.add(board);
        jframe.setVisible(true);
    }
}
