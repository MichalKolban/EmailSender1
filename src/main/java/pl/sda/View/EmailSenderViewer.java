package pl.sda.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmailSenderViewer extends JFrame {
    private JPanel mainPanel;
    private JButton pushITButton;
    private JTextField nameValue;

    public EmailSenderViewer(){
        initView();
        pushITButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FinalView finalView = new FinalView(nameValue.getText());
                setVisible(false);
            }
        });
    }

    private void initView(){
        setTitle("Email Sender");
        add(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500,500);
    }
}
