package A5.code;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GameWindow extends JFrame {

    private final BoardLogic logic;
    private final JButton[][] buttons;
    private final JLabel statusLabel;

    public GameWindow() {
        this.logic = new BoardLogic();
        this.buttons = new JButton[3][3];

        setTitle("Tic-Tac-Toe - Assignment 5");
        setSize(400, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        // Top Banner: Displays whose turn it is or who won
        statusLabel = new JLabel(logic.getCurrentPlayer().getTurnBanner(), SwingConstants.CENTER);
        statusLabel.setFont(new Font("SansSerif", Font.BOLD, 18));    
        add(statusLabel, BorderLayout.NORTH);

        // Center Grid: 3x3 clickable buttons
        JPanel gridPanel = new JPanel(new GridLayout(3, 3));
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                final int row = r;
                final int col = c;

                JButton btn = new JButton("");
                btn.setFont(new Font("SansSerif", Font.BOLD, 48));
                btn.setFocusPainted(false);
                btn.setBackground(Color.WHITE);
                btn.addActionListener(e -> handleMove(row, col));

                buttons[r][c] = btn;
                gridPanel.add(btn);
            }
        }
        add(gridPanel, BorderLayout.CENTER);

        // Bottom Button: Resets the board for a new match
        JButton resetButton = new JButton("Restart Game");
        resetButton.setFont(new Font("SansSerif", Font.BOLD, 15));
        resetButton.addActionListener(e -> resetGame());
        add(resetButton, BorderLayout.SOUTH);
    }

    private void handleMove(int row, int col) {
        if (!logic.makeMove(row, col)) {
            return;
        }

        char sym = logic.getCurrentPlayer().getSymbol();
        buttons[row][col].setText(String.valueOf(sym));
        buttons[row][col].setForeground(sym == 'X' ? new Color(220, 20, 60) : new Color(30, 144, 255));

        if (logic.checkWin()) {
            statusLabel.setText(logic.getCurrentPlayer().getName() + " Wins!");
            setBoardEnabled(false);
        } else if (logic.isDraw()) {
            statusLabel.setText("It's a Draw!");
            setBoardEnabled(false);
        } else {
            logic.switchTurn();
            statusLabel.setText(logic.getCurrentPlayer().getTurnBanner());
        }
    }

    private void setBoardEnabled(boolean enabled) {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                buttons[r][c].setEnabled(enabled);
            }
        }
    }

    private void resetGame() {
        logic.resetBoard();
        statusLabel.setText(logic.getCurrentPlayer().getTurnBanner());
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                buttons[r][c].setText("");
                buttons[r][c].setEnabled(true);
            }
        }
    }
}