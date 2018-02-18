package pl.sda.View;

import javax.swing.*;

public class FinalView extends JFrame{

    private JPanel mainPanel2;
    private JLabel nameLabel;


    public FinalView(String name){
        nameLabel.setText(name);
        finitoView();
    }

    private void finitoView(){
        setTitle("Siemanko");
        add(mainPanel2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(300,300);
    }
}
