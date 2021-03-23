package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements IReviewed, ITicketed {

        private Double defaultPrice;

    public Dodgems(String name, int rating) {
        super(name, rating);
        this.defaultPrice = 4.50;
    }

    public Double defaultPrice(){
        return this.defaultPrice;
    }

    public Double priceFor(Visitor visitor){
        if(visitor.getAge() < 12){
            return defaultPrice / 2;
        }
        return defaultPrice;
    }
}
