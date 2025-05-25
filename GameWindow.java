import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import javax.swing.border.Border;

public class GameWindow {

    public GameWindow() {

    }

    public JFrame startGameWindow() {
        // Declaring a Frame and Label
        JFrame frame = new JFrame("Basic Program");

        JButton startButton = new JButton("Start Game");
        Border lineBorder = BorderFactory.createLineBorder(Color.BLACK, 2); 
        startButton.setBorder(lineBorder);
        startButton.setSize(100, 50);

        frame.setSize(800, 800);

        // Making the Frame visible
        frame.setVisible(true);

        frame.add(startButton);

        // Using WindowListener for closing the window
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

        return frame;
    }
}
