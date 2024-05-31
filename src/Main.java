import javax.swing.*;
import java.awt.*;

public class Main {

    JButton CourseBtn = new JButton("Courses");
    JButton HelpBtn = new JButton("Help");
    JButton AboutBtn = new JButton("About");
    JButton DarkMode = new JButton("Use dark mode");
    JButton StudySound = new JButton("Study Sounds");
    JButton timer = new JButton("Timer");

    JPanel jp = new JPanel(new FlowLayout()) {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            ImageIcon imageIcon = new ImageIcon("src/Resources/MainBackground.jpg");
            g.drawImage(imageIcon.getImage(), 0, 0, getWidth(), getHeight(), null);
        }
    };

    public Main() {

        jp.add(CourseBtn);
        jp.add(HelpBtn);
        jp.add(AboutBtn);
        jp.add(StudySound);
        jp.add(timer);
        jp.add(DarkMode);

        JFrame frame = new JFrame("Desk");
        frame.getContentPane().add(jp); // Add the panel to the content pane
        frame.pack(); // Pack the frame to fit its contents
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(960, 540);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        new Main();
    }
}
