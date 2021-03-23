package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(9, 120.0, 5);
        visitor2 = new Visitor(30, 250.0, 20);
    }


    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void isAllowedTrue(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void isAllowedFalse(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
    }


    @Test
    public void chargesTallPeopleDouble(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor2), 0.0);
    }

}
