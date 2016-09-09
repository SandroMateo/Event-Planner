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
  public void Event_setFoodCuisine_American() {
    Event testEvent = new Event(2, "food", "amount", "meal", "drink", "entertain");
    testEvent.setFoodCuisine("American");
    assertEquals("American", testEvent.getFoodCuisine());
  }

  @Test
  public void Event_setMealAmount_small() {
    Event testEvent = new Event(2, "food", "amount", "meal", "drink", "entertain");
    testEvent.setMealAmount("small");
    assertEquals("small", testEvent.getMealAmount());
  }

  @Test
  public void Event_setMealType_vegan() {
    Event testEvent = new Event(2, "food", "amount", "meal", "drink", "entertain");
    testEvent.setMealType("vegan");
    assertEquals("vegan", testEvent.getMealType());
  }

  @Test
  public void Event_setDrinkType_Soda_Bar() {
    Event testEvent = new Event(2, "food", "amount", "meal", "drink", "entertain");
    testEvent.setDrinkType("Soda Bar");
    assertEquals("Soda Bar", testEvent.getDrinkType());
  }

  @Test
  public void Event_setEntertainmentType_Our_Own_Staff_DJ() {
    Event testEvent = new Event(2, "food", "amount", "meal", "drink", "entertain");
    testEvent.setEntertainmentType("Our Own Staff DJ");
    assertEquals("Our Own Staff DJ", testEvent.getEntertainmentType());
  }

  @Test
  public void Event_checkFoodCuisine_true() {
    Event testEvent = new Event(2, "American", "Small", "No preference", "Soda Bar", "Our Own Staff DJ");
    assertEquals(true, testEvent.checkFoodCuisine());
  }

  @Test
  public void Event_checkMealAmount_true() {
    Event testEvent = new Event(2, "American", "Small", "No preference", "Soda Bar", "Our Own Staff DJ");
    assertEquals(true, testEvent.checkMealAmount());
  }

  @Test
  public void Event_checkMealType_true() {
    Event testEvent = new Event(2, "American", "Small", "No preference", "Soda Bar", "Our Own Staff DJ");
    assertEquals(true, testEvent.checkMealType());
  }

  @Test
  public void Event_checkDrinkType_true() {
    Event testEvent = new Event(2, "American", "Small", "No preference", "Soda Bar", "Our Own Staff DJ");
    assertEquals(true, testEvent.checkDrinkType());
  }

  @Test
  public void Event_checkEntertainmentType_true() {
    Event testEvent = new Event(2, "American", "Small", "No preference", "Soda Bar", "Our Own Staff DJ");
    assertEquals(true, testEvent.checkEntertainmentType());
  }

  @Test
  public void Event_calculateCost_120() {
    Event testEvent = new Event(2, "American", "Small", "No preference", "Soda Bar", "Our Own Staff DJ");
    testEvent.calculateCost();
    assertEquals(120, testEvent.getCost(), 1);
  }
}
