package BoorishBikesJava;

public class Bike {

  public Boolean broken;

  public Bike() {
    this.broken = false;
  }

  public String damage() {
    this.broken = true;
    return "Oi, what have you done, you plebian?";
  }

  public Boolean isBroken() {
    return this.broken;
  }

  public void repair() {
    this.broken = false;
  }
}
