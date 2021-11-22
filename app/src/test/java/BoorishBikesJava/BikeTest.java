package BoorishBikesJava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BikeTest {
  @Test public void isBoorishWhenBroken() {
    Bike bike = new Bike();
    String boorishness = bike.damage();
    assertEquals("Oi, what have you done, you plebian?", boorishness);
  }
}
