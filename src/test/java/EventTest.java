import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void Event_instantiatesCorrectly() {
    Event testEvent = new Event(2, "food", "drink", "entertain");
    assertEquals(true, testEvent instanceof Event);
  }

  @Test
  public void Event_getGuestNumber_2() {
    Event testEvent = new Event(2, "food", "drink", "entertain");
    assertEquals(2, testEvent.getGuestNumber());
  }

  @Test
  public void Event_getFoodType_food() {
    Event testEvent = new Event(2, "food", "drink", "entertain");
    assertEquals("food", testEvent.getFoodType());
  }

  @Test
  public void Event_getDrinkType_drink() {
    Event testEvent = new Event(2, "food", "drink", "entertain");
    assertEquals("drink", testEvent.getDrinkType());
  }

  @Test
  public void Event_getEntertainmentType_entertain() {
    Event testEvent = new Event(2, "food", "drink", "entertain");
    assertEquals("entertain", testEvent.getEntertainmentType());
  }

  @Test
  public void Event_getCost_0() {
    Event testEvent = new Event(2, "food", "drink", "entertain");
    assertEquals(0, testEvent.getCost());
  }
}
