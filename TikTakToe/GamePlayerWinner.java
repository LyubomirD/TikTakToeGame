package working_projects.TikTakToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public abstract class GamePlayerWinner extends JButton implements ActionListener, GameWinner {
    private final JButton[] buttons;
    private final JButton jButton;
    private boolean playerOne = true;


    public GamePlayerWinner(JButton[] buttons, JButton jButton) {
        this.jButton = jButton;
        this.buttons = buttons;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButton) {
            restart();
        }

        for (JButton gameButton : buttons) {
            if (e.getSource() == gameButton) {
                if (playerOne) {
                    if (Objects.equals(gameButton.getText(), "")) {
                        gameButton.setText("X");
                        playerOne = false;
                        winnerOfGame();
                    }
                } else {
                    if (Objects.equals(gameButton.getText(), "")) {
                        gameButton.setText("O");
                        playerOne = true;
                        winnerOfGame();
                    }
                }
            }

        }
    }

    @Override
    public void winnerOfGame() {
        if ((Objects.equals(buttons[0].getText(), "X")) &&
                (Objects.equals(buttons[1].getText(), "X")) &&
                (Objects.equals(buttons[2].getText(), "X"))) {
            playerA(0, 1, 2);
        }
        if ((Objects.equals(buttons[3].getText(), "X")) &&
                (Objects.equals(buttons[4].getText(), "X")) &&
                (Objects.equals(buttons[5].getText(), "X"))) {
            playerA(3, 4, 5);
        }
        if ((Objects.equals(buttons[6].getText(), "X")) &&
                (Objects.equals(buttons[7].getText(), "X")) &&
                (Objects.equals(buttons[8].getText(), "X"))) {
            playerA(6, 7, 8);
        }
        if ((Objects.equals(buttons[0].getText(), "X")) &&
                (Objects.equals(buttons[3].getText(), "X")) &&
                (Objects.equals(buttons[6].getText(), "X"))) {
            playerA(0, 3, 6);
        }
        if ((Objects.equals(buttons[1].getText(), "X")) &&
                (Objects.equals(buttons[4].getText(), "X")) &&
                (Objects.equals(buttons[7].getText(), "X"))) {
            playerA(1, 4, 7);
        }
        if ((Objects.equals(buttons[2].getText(), "X")) &&
                (Objects.equals(buttons[5].getText(), "X")) &&
                (Objects.equals(buttons[8].getText(), "X"))) {
            playerA(2, 5, 8);
        }
        if ((Objects.equals(buttons[0].getText(), "X")) &&
                (Objects.equals(buttons[4].getText(), "X")) &&
                (Objects.equals(buttons[8].getText(), "X"))) {
            playerA(0, 4, 8);
        }
        if ((Objects.equals(buttons[2].getText(), "X")) &&
                (Objects.equals(buttons[4].getText(), "X")) &&
                (Objects.equals(buttons[6].getText(), "X"))) {
            playerA(2, 4, 6);
        }
        if ((Objects.equals(buttons[0].getText(), "O")) &&
                (Objects.equals(buttons[1].getText(), "O")) &&
                (Objects.equals(buttons[2].getText(), "O"))) {
            playerB(0, 1, 2);
        }
        if ((Objects.equals(buttons[3].getText(), "O")) &&
                (Objects.equals(buttons[4].getText(), "O")) &&
                (Objects.equals(buttons[5].getText(), "O"))) {
            playerB(3, 4, 5);
        }
        if ((Objects.equals(buttons[6].getText(), "O")) &&
                (Objects.equals(buttons[7].getText(), "O")) &&
                (Objects.equals(buttons[8].getText(), "O"))) {
            playerB(6, 7, 8);
        }
        if ((Objects.equals(buttons[0].getText(), "O")) &&
                (Objects.equals(buttons[3].getText(), "O")) &&
                (Objects.equals(buttons[6].getText(), "O"))) {
            playerB(0, 3, 6);
        }
        if ((Objects.equals(buttons[1].getText(), "O")) &&
                (Objects.equals(buttons[4].getText(), "O")) &&
                (Objects.equals(buttons[7].getText(), "O"))) {
            playerB(1, 4, 7);
        }
        if ((Objects.equals(buttons[2].getText(), "O")) &&
                (Objects.equals(buttons[5].getText(), "O")) &&
                (Objects.equals(buttons[8].getText(), "O"))) {
            playerB(2, 5, 8);
        }
        if ((Objects.equals(buttons[0].getText(), "O")) &&
                (Objects.equals(buttons[4].getText(), "O")) &&
                (Objects.equals(buttons[8].getText(), "O"))) {
            playerB(0, 4, 8);
        }
        if ((Objects.equals(buttons[2].getText(), "O")) &&
                (Objects.equals(buttons[4].getText(), "O")) &&
                (Objects.equals(buttons[6].getText(), "O"))) {
            playerB(2, 4, 6);
        }
    }

    @Override
    public void playerA(int a, int b, int c) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (JButton gameButton : buttons) {
            gameButton.setEnabled(false);
        }
    }

    @Override
    public void playerB(int a, int b, int c) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (JButton gameButton : buttons) {
            gameButton.setEnabled(false);
        }
    }

    @Override
    public void restart() {
        for (JButton button : buttons) {
            button.setText("");
            button.setEnabled(true);
        }
    }

}
