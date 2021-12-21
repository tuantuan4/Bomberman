package Game;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

    private JPanel contentPane;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Menu frame = new Menu();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Menu() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 814, 575);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JButton playButton = new JButton("New button");
        playButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                main m = new main();
                dispose();
            }
        });
        playButton.setIcon(new ImageIcon("F:\\Code Java\\TestGame\\res\\play_button.png"));
        playButton.setBounds(248, 352, 261, 76);
        contentPane.add(playButton);
        
        JLabel background = new JLabel("");
        background.setIcon(new ImageIcon("F:\\Code Java\\TestGame\\res\\background.jpg"));
        background.setBounds(-351, 0, 1151, 603);
        contentPane.add(background);
    }
}
