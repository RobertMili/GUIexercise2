import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setTitle("Check");
        window.setSize(new Dimension(600,300));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);


        JPanel inputPanel = new JPanel();
        inputPanel.setSize(new Dimension(600,100));

        JPanel outputPanel = new JPanel();
        outputPanel.setSize(new Dimension(600,100));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setSize(new Dimension(600,50));
        JButton checkButton = new JButton("Check if even");
        JButton quitButton = new JButton("Quit");
        checkButton.setPreferredSize(new Dimension(100,50));
        quitButton.setPreferredSize(new Dimension(100,50));

        JTextField text = new JTextField("0");
        text.setPreferredSize(new Dimension(100,50));
        Font font1 = new Font(" ", Font.BOLD, 20);
        text.setFont(font1);
        outputPanel.add(text,BorderLayout.NORTH);

        JLabel labaleDefautlText = new JLabel("This is an evene number");
        labaleDefautlText.setPreferredSize(new Dimension(100,50));
        outputPanel.add(labaleDefautlText, BorderLayout.EAST);


        buttonPanel.add(checkButton,BorderLayout.CENTER);
        buttonPanel.add(quitButton,BorderLayout.EAST);

        window.add(inputPanel, BorderLayout.NORTH);
        window.add(outputPanel,BorderLayout.CENTER);
        window.add(buttonPanel,BorderLayout.SOUTH);

        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            labaleDefautlText.setText("Result: " + checkIfIsEventNumber(Integer.valueOf(text.getText())));
            }
        });

        window.setVisible(true);
    }
    public static boolean checkIfIsEventNumber(int num1){
       return (num1%2 == 0);
    }
}