package Model;

import Model.Cloned.Bagpack;
import Model.Cloned.HandBag;

//https://javadevcentral.com/prototype-design-pattern
//https://www.tutorialspoint.com/design_pattern/prototype_pattern.htm
public class ProtoBag implements Cloneable{
    private int  id;
    public String type;
    public String color;
    public String name;
    public Designer designer;

    protected ProtoBag(int id, String type, String color, String name, Designer designer){
        this.id = id;
        this.type = type;
        this.color = color;
        this.name = name;
        this.designer = designer;
    }

    public ProtoBag(HandBag handBag) {
    }
    public ProtoBag(Bagpack bagpack) {
    }
    public Designer getDesigner() {
        return designer;
    }
    public int getId() {
        return id;
    }
    public String getType() {
        return type;
    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Object clone() {
        Object clone = null;
        
        try {
           clone = super.clone();
           
        } catch (CloneNotSupportedException e) {
           e.printStackTrace();
        }
        
        return clone;
     }
     //https://www.tutorialspoint.com/design_pattern/prototype_pattern.htm
}
