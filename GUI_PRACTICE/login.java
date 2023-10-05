package GUI_PRACTICE;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class login implements ActionListener {
    
    public login(){
         //* Add Object */
        JFrame jframe = new JFrame("LOGIN FORM");
        JTextField jFieldusername = new JTextField();
        JPasswordField jfieldpassword = new JPasswordField();
        JLabel JLabelusername = new JLabel("Username");
        JLabel JLabelpassword = new JLabel("Password");
        JButton loginButton = new JButton("LOGIN");
        JButton cancelButton = new JButton("CANCEL");

        //* for design */
        JLabelusername.setForeground(Color.BLUE);
        JLabelpassword.setForeground(Color.BLUE);

        jframe.setLayout(new GridLayout(3, 2));

        //* To call the object */
        jframe.getContentPane().add(JLabelusername);
        jframe.getContentPane().add(jFieldusername);

        jframe.getContentPane().add(JLabelpassword);
        jframe.getContentPane().add(jfieldpassword);

        jframe.getContentPane().add(loginButton);
        jframe.getContentPane().add(cancelButton);

        //* For Event listener */
        cancelButton.addActionListener(e -> {
          System.exit(0);
          });
         loginButton.addActionListener(e -> {
          JOptionPane.showInputDialog(this, "Patient information saved successfully!");
        });


        //? code for Jframe
        jframe.setBounds(300, 300, 400, 100);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}
