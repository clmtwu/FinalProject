import javax.swing.*;
import java.awt.event.*; //importing awt for customization
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Dimension;
import javax.swing.border.EmptyBorder;

public class LearningMode {
    JFrame LMFrame = new JFrame();

    JButton LMConfirm = new JButton ("Okay, I got it!");
    JButton LMRepeat = new JButton ("Please repeat one more time!");

    JLabel LMPrompt = new JLabel ("Here is the alphabet in order, with sound!", SwingConstants.CENTER);

    final static int alphabetsize = 26;
    final static int titlefont = 25;
    final static int bodyfont = 15;

	ArrayList<Integer> parent = new ArrayList<Integer>(alphabetsize);
	ArrayList<JButton> alphabet = new ArrayList<JButton>(alphabetsize);

	FlowLayout FrameLayout = new FlowLayout(FlowLayout.CENTER);
    FlowLayout LMFrameLayout = new FlowLayout(FlowLayout.CENTER); 

    Dimension JButtonSize = new Dimension (200, 100);
    Dimension LongJButtonSize = new Dimension (250, 100);
    Dimension MainPicture = new Dimension (300, 300);

    EmptyBorder TitleBorder = new EmptyBorder (50, 300, 50, 300);
    EmptyBorder RegularTextBorder = new EmptyBorder (15, 200, 15, 200);

    public void setup() {
        LMFrame.setSize(1000, 1000); 
        LMFrame.setTitle("Learning Mode - Alphabet Game");
        LMFrame.setLayout(LMFrameLayout);
        LMFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // default action when closed is to stop
        LMConfirm.setForeground(Color.GREEN);
        LMRepeat.setForeground(Color.RED);
        LMConfirm.setPreferredSize(JButtonSize);
        LMRepeat.setPreferredSize(LongJButtonSize);
        LMConfirm.setBorder(RegularTextBorder);
        LMPrompt.setBorder(TitleBorder);
    }

    public LearningMode() {
        setup();
        LMFrame.setVisible(true);
		LMFrame.add(LMPrompt);
        LMFrame.add(LMConfirm);
        LMFrame.add(LMRepeat);
        LMConfirm.addActionListener((java.awt.event.ActionListener) new ActionListener() { //creating action listener for submit button
            public void actionPerformed(ActionEvent e){ //method of execution
                LMFrame.setVisible(false); //you can't see me!
                LMFrame.dispose(); //Destroy the JFrame object
                new Frame();
            }
        });
        LMRepeat.addActionListener((java.awt.event.ActionListener) new ActionListener() { //creating action listener for submit button
            public void actionPerformed(ActionEvent e){ //method of execution
                new LearningMode();
            }
        });
    }

    

    public void actionPerformed(ActionEvent e) {
        for (char i = 65; i <= 90; i++) {
			String temp = Character.toString(i);
			alphabet.add(new JButton(temp));
		}
    }
}
