import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console console = System.console();
    boolean planEvent = true;
    String planAgain = "";
    List<Event> eventList = new ArrayList<Event>();
    double totalCost = 0;

    System.out.println("\nWelcome to your Event Planner! Here we give you many options to choose from in order to organize and plan your own event. Let's get Started!");
    while(planEvent) {
      System.out.println("\nFirst off, how many people will be attending this event? Please type a whole number greater than 0:");
      String guestStringNumber = console.readLine();
      int guestNumber = Integer.parseInt(guestStringNumber);
      System.out.println("\nGreat! Let's talk about food. What food cuisine would you like to be served? Please type one of our options: 'American', 'Mexican', 'Indian', 'Italian', 'Japanese', or 'French'.");
      String foodCuisine = console.readLine();
      System.out.println("\nSounds good. What would you like your portion sizes to be? Please type one of our options: 'Small', 'Medium', 'Large', or 'Light Snacks'.");
      String mealAmount = console.readLine();
      System.out.println("\nAnd do you have any meal preferences? Please type one of our options: 'Vegan', 'Vegeterian', or 'No Preference'.");
      String mealType = console.readLine();
      System.out.println("\nDelicious! On to drinks, what type of drink bar would you like? Please type one of our options: 'Soda Bar', 'Juice Bar', 'Soda and Juice Bar', 'Assorted Local Beer', 'Assorted Beer with Select Cocktails', or 'Full Bar'.");
      String drinkType = console.readLine();
      System.out.println("\nYou're quite the drinker! Now what type of entertainment would you like? Please type one of our options: 'Our Own Staff DJ', 'A Local Struggling Comedian', 'A Local Struggling Artist', 'A Well Known Local Comedian', 'A Well Known Local Band', or 'A Nationally Famous Band or Comedian'.");
      String entertainmentType = console.readLine();

      Event plannedEvent = new Event(guestNumber, foodCuisine, mealAmount, mealType, drinkType, entertainmentType);

      eventList.add(plannedEvent);

      while(plannedEvent.getGuestNumber() < 0) {
        System.out.println("\nI'm sorry, you can't have an event with a negative amount of people. Please enter a positive whole number.");
        guestStringNumber = console.readLine();
        guestNumber = Integer.parseInt(guestStringNumber);
        plannedEvent.setGuestNumber(guestNumber);
      }

      while(!plannedEvent.checkFoodCuisine()) {
        System.out.println("\nOops! looks like you entered something that was not one of our options. Please re-enter you preference.");
        System.out.println("Our food cuisine options are: 'American', 'Mexican', 'Indian', 'Italian', 'Japanese', or 'French'.");
        foodCuisine = console.readLine();
        plannedEvent.setFoodCuisine(foodCuisine);
      }

      while(!plannedEvent.checkMealAmount()) {
        System.out.println("\nOops! looks like you entered something that was not one of our options. Please re-enter you preference.");
        System.out.println("Our portion sizes are: 'Small', 'Medium', 'Large', or 'Light Snacks'.");
        mealAmount = console.readLine();
        plannedEvent.setMealAmount(mealAmount);
      }

      while(!plannedEvent.checkMealType() || plannedEvent.getMealType().equals("")) {
        System.out.println("\nOops! looks like you entered something that was not one of our options. Please re-enter you preference.");
        System.out.println("Our meal preferences are: 'Vegan', 'Vegeterian', or 'No Preference'.");
        mealType = console.readLine();
        plannedEvent.setMealType(mealType);
      }

      while(!plannedEvent.checkDrinkType()) {
        System.out.println("\nOops! looks like you entered something that was not one of our options. Please re-enter you preference.");
        System.out.println("Our drink bar options are: 'Soda Bar', 'Juice Bar', 'Soda and Juice Bar', 'Assorted Local Beer', 'Assorted Beer with Select Cocktails', or 'Full Bar'.");
        drinkType = console.readLine();
        plannedEvent.setDrinkType(drinkType);
      }

      while(!plannedEvent.checkEntertainmentType()) {
        System.out.println("\nOops! looks like you entered something that was not one of our options. Please re-enter you preference.");
        System.out.println("Our entertainment options are: 'Our Own Staff DJ', 'A Local Struggling Comedian', 'A Local Struggling Artist', 'A Well Known Local Comedian', 'A Well Known Local Band', or 'A Nationally Famous Band or Comedian'.");
        entertainmentType = console.readLine();
        plannedEvent.setEntertainmentType(entertainmentType);
      }

      plannedEvent.calculateCost();

      System.out.println("\nAlright! here is your order:");
      System.out.println("-----------------------------");
      for(int i = 0; i < eventList.size(); i++) {
        System.out.println("Guest Number: " + eventList.get(i).getGuestNumber());
        System.out.println("Food Cuisine: " + eventList.get(i).getFoodCuisine());
        System.out.println("Portion Size: " + eventList.get(i).getMealAmount());
        System.out.println("Meal Preference: " + eventList.get(i).getMealType());
        System.out.println("Beverages: " + eventList.get(i).getDrinkType());
        System.out.println("Entertainment: " + eventList.get(i).getEntertainmentType());
        System.out.println("Estimated Cost: $" + eventList.get(i).getCost() + "0");
        System.out.println("-----------------------------");
        totalCost += eventList.get(i).getCost();
      }
      System.out.println("Total Cost: $" + totalCost + "0");
      while(!planAgain.equalsIgnoreCase("yes") && !planAgain.equalsIgnoreCase("no")) {
        System.out.println("\nWould you like to plan another event? Type 'yes' or 'no'");
        planAgain = console.readLine();
        if(!planAgain.equalsIgnoreCase("yes")) {
          planEvent = false;
        }
      }
      planAgain = "";
    }
  }
}
