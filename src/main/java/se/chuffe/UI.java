package se.chuffe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by Chuffe' on 2017-02-13.
 */
public class UI {
    private JPanel buttonpanel;
    private JFrame frame;
    private JTextArea textArea;
    private JLabel label;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    public void create(ActionListener listener) {
        buttonpanel = new JPanel();
        button1 = new JButton("FIGHT");
        button2 = new JButton("MAGIC");
        button3 = new JButton("DEFEND");
        button4 = new JButton("RUN");
        button1.addActionListener(listener);
        button2.addActionListener(listener);
        button3.addActionListener(listener);
        button4.addActionListener(listener);
        button1.setActionCommand("FIGHT");
        button2.setActionCommand("MAGIC");
        button3.setActionCommand("DEFEND");
        button4.setActionCommand("RUN");
        buttonpanel.add(button1);
        buttonpanel.add(button2);
        buttonpanel.add(button3);
        buttonpanel.add(button4);
        frame = new JFrame("Chuffe");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        textArea = new JTextArea(40, 70);
        textArea.setEditable(false);
        label = new JLabel("100 HP");
        frame.getContentPane().add(label, BorderLayout.PAGE_START);
        frame.getContentPane().add(textArea, BorderLayout.CENTER);
        frame.getContentPane().add(buttonpanel, BorderLayout.PAGE_END);
        frame.pack();
        frame.setVisible(true);
    }

    public void addMessage(String message){
        textArea.append(message);
        textArea.append("\n");

    }
}
