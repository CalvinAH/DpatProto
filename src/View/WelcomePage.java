package View;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Model.Designer;
import Model.ProtoBag;
import Model.Cloned.Bagpack;
import Model.Cloned.HandBag;
//https://www.javaguides.net/2019/07/login-application-using-java-swing-jdbc-mysql-example-tutorial.html
public class WelcomePage extends JFrame 
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
        bBack = new JButton("Go back"); 
        //bprint= new JButton("Print proto"); 

        contentPane = new JPanel();  
        contentPane.add(bagNameLabel);     
        contentPane.add(textField1);     
        contentPane.add(colorLabel);     
        contentPane.add(textField2); 
        contentPane.add(typeLabel);
        contentPane.add(typeBox);
        contentPane.add(bAppend);
        contentPane.add(bBack);
        //contentPane.add(bprint);        

        add(contentPane);  
           
        JButton btnNewButton = new JButton("OK");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 26));
        btnNewButton.setBounds(545, 392, 162, 73);
        
        bBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = JOptionPane.showConfirmDialog(bBack, "Are you sure?");
                if (a == JOptionPane.YES_OPTION) {
                    dispose();
                    LoginPage obj = new LoginPage();
                    obj.setTitle("Login");
                    obj.setVisible(true);
                    Designer.resetDesigner();
                }
                dispose();
                LoginPage obj = new LoginPage();

                obj.setTitle("Login");
                obj.setVisible(true);
            }
            
        });

        bAppend.addActionListener(new ActionListener(){    
            public void actionPerformed(ActionEvent e) {
                String bagNameValue = textField1.getText();
                String colorValue = textField2.getText();
                String typeValue = typeBox.getSelectedItem().toString();
                int id=1;
                if (typeValue == "HandBag"){
                    //HandBag(id, typeValue, colorValue, bagNameValue, user);
                    HandBag handBag = new HandBag(id, typeValue, colorValue, bagNameValue, user);
                    id = id+1;
                    JOptionPane.showMessageDialog(btnNewButton, handBag.name+" of "+handBag.type+" featuring "+handBag.color+" by "+handBag.designer.username +" of "+handBag.designer.company);
                    //System.out.println(handBag.name+" of "+handBag.type+" featuring "+handBag.color+" by "+handBag.designer.username +" of "+handBag.designer.company);
                }
                if (typeValue == "Bagpack"){
                    Bagpack bagpack = new Bagpack(id, typeValue, colorValue, bagNameValue, user);
                    id= id+1;
                    JOptionPane.showMessageDialog(btnNewButton, bagpack.name+" of "+bagpack.type+" featuring "+bagpack.color+" by "+bagpack.designer.username +" of "+bagpack.designer.company);
                    //System.out.println(bagpack.name+" of "+bagpack.type+" featuring "+bagpack.color+" by "+bagpack.designer.username +" of "+bagpack.designer.company);
                }
            }
        });

        // bprint.addActionListener(new ActionListener(){    
        //     public void actionPerformed(ActionEvent e) {
        //         JOptionPane.showMessageDialog(btnNewButton, HandBag.class);
        //     }
        // });
        
    }
   
    
    
  
}  