import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WelcomePage extends JFrame implements ActionListener
{  
    private JPanel contentPane;
    JButton bAppend, bBack, bprint; 
    JPanel newPanel2;  
    JLabel bagNameLabel, colorLabel, typeLabel;
    JComboBox<String> typeBox; 
    final JTextField  textField1, textField2;  
    //constructor  
    WelcomePage()  
    {  

        Designer user = Designer.getInstance(); 
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);  
        setTitle("Welcome");  
        setSize(400, 200);  
        
        bagNameLabel = new JLabel();  
        bagNameLabel.setText("Bag name");  
        textField1 = new JTextField(15); 
   
        colorLabel = new JLabel();  
        colorLabel.setText("Color");
        textField2 = new JTextField(15);

        String[] s1 = { "HandBag", "Bagpack" };
        typeLabel = new JLabel();  
        typeLabel.setText("Type");
        typeBox = new JComboBox<String>(s1);


        bAppend = new JButton("Add Bag"); 

        contentPane = new JPanel();  
        contentPane.add(bagNameLabel);     
        contentPane.add(textField1);     
        contentPane.add(colorLabel);     
        contentPane.add(textField2); 
        contentPane.add(typeLabel);
        contentPane.add(typeBox);
        contentPane.add(bAppend);
        contentPane.add(bBack);
        contentPane.add(bprint);        

        add(contentPane);  
           
        bAppend.addActionListener(this);  
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
    
    
  
}  