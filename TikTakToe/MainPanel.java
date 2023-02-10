package working_projects.TikTakToe;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    private final JPanel mainPanel;
    private final JPanel gamePanel;
    private final GridLayout gridLayout;
    private final GameDimensions dimensions;

    public MainPanel(JPanel mainPanel, JPanel panel, GridLayout gridLayout, GameDimensions dimensions) {
        this.mainPanel = mainPanel;
        this.gamePanel = panel;
        this.gridLayout = gridLayout;
        this.dimensions = dimensions;
    }

    public JPanel getMainPanel() {
        setMainPanel();
        return mainPanel;
    }

    public JPanel getGamePanel() {
        setGamePanel();
        return gamePanel;
    }

    private void setMainPanel() {
        mainPanel.setBounds(0, 0, dimensions.getWidth(), dimensions.getHeight());
        mainPanel.setBackground(Color.BLACK);
        mainPanel.add(getGamePanel());
        mainPanel.setLayout(null);
    }

    private void setGamePanel() {
        gamePanel.setBounds(0, 0, dimensions.getWidth(), dimensions.getHeight() - 50);
        gamePanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        gamePanel.setBackground(Color.BLACK);
        gamePanel.setLayout(gridLayout);
    }

}