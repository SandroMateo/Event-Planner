import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void Event_instantiatesCorrectly() {
    Event testEvent = new Event(2, "food", "amount", "meal", "drink", "entertain");
    assertEquals(true, testEvent instanceof Event);
  }

  @Test
  public void Event_getGuestNumber_2() {
    Event testEvent = new Event(2, "food", "amount", "meal", "drink", "entertain");
    assertEquals(2, testEvent.getGuestNumber(), 1);
  }

  @Test
  public void Event_getFoodCuisine_food() {
    Event testEvent = new Event(2, "food", "amount", "meal", "drink", "entertain");
    assertEquals("food", testEvent.getFoodCuisine());
  }

  @Test
  public void Event_getMealAmount_small() {
    Event testEvent = new Event(2, "food", "amount", "meal", "drink", "entertain");
    assertEquals("amount", testEvent.getMealAmount());
  }

  @Test
  public void Event_getMealType_food() {
    Event testEvent = new Event(2, "food", "amount", "meal", "drink", "entertain");
    assertEquals("meal", testEvent.getMealType());
  }

  @Test
  public void Event_getDrinkType_drink() {
    Event testEvent = new Event(2, "food", "amount", "meal", "drink", "entertain");
    assertEquals("drink", testEvent.getDrinkType());
  }

  @Test
  public void Event_getEntertainmentType_entertain() {
    Event testEvent = new Event(2, "food", "amount", "meal", "drink", "entertain");
    assertEquals("entertain", testEvent.getEntertainmentType());
  }

  @Test
  public void Event_getCost_0() {
    Event testEvent = new Event(2, "food", "amount", "meal", "drink", "entertain");
    assertEquals(0, testEvent.getCost(), 1);
  }

  @Test
  public void Event_calculateCost_120() {
    Event testEvent = new Event(2, "American", "Small", "No preference", "Soda Bar", "Our Own Staff DJ");
    testEvent.calculateCost();
    assertEquals(120, testEvent.getCost(), 1);
  }
}
