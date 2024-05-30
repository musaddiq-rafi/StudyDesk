import javax.swing.*;
import java.awt.*;

public class Main {

    JButton CourseBtn= new JButton("Courses");
    JButton HelpBtn = new JButton("Help");
    JButton AboutBtn= new JButton("About");

    JPanel jp= new JPanel(new FlowLayout());
    public Main(){
        jp.add(CourseBtn);
        jp.add(HelpBtn);
        jp.add(AboutBtn);

        JFrame frame= new JFrame("Desk");
        frame.getContentPane().add(jp);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(960,540);


    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        new Main();
    }
}