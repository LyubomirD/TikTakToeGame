package working_projects.TikTakToe;

import javax.swing.*;
import java.awt.*;

public class MainTikTakToe implements Runnable {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new MainTikTakToe());
    }

    @Override
    public void run() {
        GameDimensions gameDimensions = new GameDimensions(415, 500);
        GridLayout gridLayout = new GridLayout(3, 3, 10, 10);
        MainPanel panel = new MainPanel(new JPanel(), new JPanel(), gridLayout, gameDimensions);
        GameFrame frame = new GameFrame(new JFrame(), panel, gameDimensions);
        GameButtons buttons = new GameButtons(new JButton[9], new JButton(),
                new Font("MV Boli", Font.BOLD, 60), panel, gameDimensions);
    }

}

