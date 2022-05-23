package View;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Model.Designer;  
 
  
public class LoginPage extends JFrame implements ActionListener{
    JButton b1;  
    JPanel newPanel;  
    JLabel userLabel, compLabel;  
    final JTextField  textField1, textField2;  
      
    public LoginPage(){
         userLabel = new JLabel();  
         userLabel.setText("Username");  
         textField1 = new JTextField(15); 
   
         compLabel = new JLabel();  
         compLabel.setText("Company");
         textField2 = new JTextField(15);
           
         b1 = new JButton("SUBMIT"); 
           
         newPanel = new JPanel(new GridLayout(3, 1));  
         newPanel.add(userLabel);     
         newPanel.add(textField1);     
         newPanel.add(compLabel);     
         newPanel.add(textField2);    
         newPanel.add(b1);            

         add(newPanel, BorderLayout.CENTER);  
           
         b1.addActionListener(this);  
         setTitle("LOGIN FORM");
   }
   public void actionPerformed(ActionEvent ae)   
    {  
        String userValue = textField1.getText();        
        String compValue = textField2.getText();         
        JButton btnNewButton = new JButton("Login");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 26));
        btnNewButton.setBounds(545, 392, 162, 73);

        if (userValue != "" && compValue != "") { 
              
            Designer user = Designer.getInstance(userValue, compValue); 
            WelcomePage page = new WelcomePage();  
            //JLabel wel_label = new JLabel("Welcome: "+user.username+" of "+user.company); 
            page.setTitle("Welcome");  
            page.setSize(400, 200);   
            //page.getContentPane().add(wel_label); 
            page.setVisible(true);  
            
            JOptionPane.showMessageDialog(btnNewButton, "Welcome: "+user.username+" of "+user.company);
            
            
        }  
        else{  
            System.out.println("Please enter valid username and company");  
        }  
    }  
    
    
}
