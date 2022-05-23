package Model.Cloned;

import Model.Designer;
import Model.ProtoBag;

public class Bagpack extends ProtoBag{

    public Bagpack(int id, String type, String color, String name, Designer designer) {
        super(id, type, color, name, designer);
    }
    private Bagpack(Bagpack bagpack){
        super(bagpack);
    }
    @Override
    public ProtoBag clone(){
        return new Bagpack(this);

    }
    //public Bagpack(){type= "Bagpack";}
}
