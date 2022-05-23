import java.util.Scanner;

import Model.Designer;
import View.LoginPage;

public class Client {
    public static void main(String[] args){
        try{
            //protoIntro();
            LoginPage form = new LoginPage();  
            form.setSize(300,100);  
            form.setVisible(true); 
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    static void protoIntro(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = input.nextLine();
        System.out.print("company: ");
        String company = input.nextLine();
        Designer.getInstance(username, company);
        mainMenu();
        input.close();
    }
    static void mainMenu(){
        System.out.println("I am " + "awesome.");
    }
}
