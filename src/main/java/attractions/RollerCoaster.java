package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    private Double defaultPrice;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
        this.defaultPrice = 8.40;
    }


    public boolean isAllowedTo(Visitor visitor){
        if(visitor.getAge() >= 12 && visitor.getHeight() >= 145.00){
            return true;
        }
        return false;
    }

    public Double defaultPrice(){
        return this.defaultPrice;
    }

    public Double priceFor(Visitor visitor){
        if(visitor.getHeight() > 200.0){
            return defaultPrice * 2;
        }
        return defaultPrice;
    }


}
