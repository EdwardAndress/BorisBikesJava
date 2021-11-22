package BoorishBikesJava;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class BikeTest {
  @Test public void isBoorishWhenBroken() {
    Bike bike = new Bike();
    String boorishness = bike.damage();

    assertEquals("Oi, what have you done, you plebian?", boorishness);
  }

  @Test public void isBikeBoorishlyBroken() {
    Bike bike = new Bike();
    bike.damage();

    assertTrue(bike.isBroken());
  }

  @Test public void isBikeRudelyRepaired() {
    Bike bike = new Bike();
    bike.damage();
    bike.repair();

    assertFalse(bike.isBroken());
  }
}
