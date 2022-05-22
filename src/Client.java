public class Client {
    public static void main(String[] args){
        try{
            LoginPage form = new LoginPage();  
            form.setSize(300,100);  
            form.setVisible(true); 
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
