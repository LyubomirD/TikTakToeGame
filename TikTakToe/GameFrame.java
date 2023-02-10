package working_projects.TikTakToe;

import javax.swing.*;

public class GameFrame extends JFrame {
    private final JFrame frame;
    private final GameDimensions dimensions;

    public GameFrame(JFrame frame, MainPanel gamePanel, GameDimensions dimensions){
        this.frame = frame;
        this.dimensions = dimensions;

        settingFrame();
        frame.add(gamePanel.getMainPanel());
    }

    private void settingFrame() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Tik-Tak-Toe");
        frame.pack();
        frame.setSize(dimensions.getWidth(), dimensions.getHeight());
        frame.setResizable(false);
        frame.setAlwaysOnTop(true);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


}
