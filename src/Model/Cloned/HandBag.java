package Model.Cloned;

import Model.Designer;
import Model.ProtoBag;

public class HandBag extends ProtoBag{

    public HandBag(int id, String type, String color, String name, Designer designer) {
        super(id, type, color, name, designer);
    }
    private HandBag(HandBag handBag){
        super(handBag);
    }
    @Override
    public ProtoBag clone(){
        return new HandBag(this);

    }
    //public HandBag(){type = "HandBag";}
}
