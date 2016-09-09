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
}
