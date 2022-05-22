
public class Designer {
    private static Designer designer_instance = null;
    public String username;
    public String company;

    private Designer(String username, String company){
        this.username = username;
        this.company = company;
    }

    public static Designer getInstance(String username,String company){

        if(designer_instance == null){
            designer_instance = new Designer(username, company);
        };
        return designer_instance;
        
    }

    public static Designer resetDesigner(){
        if(designer_instance != null){
            designer_instance = null;
        };
        return designer_instance;
    }

    public static Designer getInstance() {
        return designer_instance;
    }
}
