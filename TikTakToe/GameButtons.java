package working_projects.TikTakToe;

import javax.swing.*;
import java.awt.*;

public class GameButtons extends GamePlayerWinner {
    private final JButton[] buttons;
    private final JButton jButton;
    private final Font font;
    private final MainPanel panel;
    private final GameDimensions dimensions;

    public GameButtons(JButton[] buttons, JButton jButton, Font font, MainPanel panel, GameDimensions dimensions) {
        super(buttons, jButton);
        this.buttons = buttons;
        this.jButton = jButton;
        this.font = font;
        this.panel = panel;
        this.dimensions = dimensions;

        makeNineButtons();
        restartButton();
    }

    private void makeNineButtons() {
        for (int i = 0; i < buttons.length; i++) {
            panel.getGamePanel().add(buttons[i] = new JButton());
            buttons[i].setFont(font);
            buttons[i].addActionListener(this);
        }
    }

    private void restartButton() {
        panel.getMainPanel().add(jButton);
        jButton.setLocation(dimensions.getWidth() / 2 - 50, dimensions.getHeight() - 50);
        jButton.setSize(100, 20);
        jButton.setText("Restart Game");
        jButton.addActionListener(this);
    }

}