import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();
    boolean planEvent = true;
    String planAgain = "";

    System.out.println("Welcome to your Event Planner! Here we give you many options to choose from in order to organize and plan your own event. Let's get Started!");
    while(planEvent) {
      System.out.println("First off, how many people will be attending this event?");
      String guestStringNumber = console.readLine();
      int guestNumber = Integer.parseInt(guestStringNumber);
      System.out.println("Great! Let's talk about food. What food cuisine would you like to be served? Please type one of our options: 'American', 'Mexican', 'Indian', 'Italian', 'Japanese', or 'French'.");
      String foodCuisine = console.readLine();
      System.out.println("Sounds good. What would you like your portion sizes to be? Please type one of our options: 'Small', 'Medium', 'Large', or 'Light Snacks'.");
      String mealAmount = console.readLine();
      System.out.println("And do you have any meal preferences? Please type one of our options: 'Vegan', 'Vegeterian', or 'No Preference'.");
      String mealType = console.readLine();
      System.out.println("Delicious! On to drinks, what type of drink bar would you like? Please type one of our options: 'Soda Bar', 'Juice Bar', 'Soda and Juice Bar', 'Assorted Local Beer', 'Assorted Beer with Select Cocktails', or 'Full Bar'.");
      String drinkType = console.readLine();
      System.out.println("You're quite the drinker! Now what type of entertainment would you like? Please type one of our options: 'Our Own Staff DJ', 'A Local Struggling Comedian', 'A Local Struggling Artist', 'A Well Known Local Comedian', 'A Well Known Local Band', or 'A Nationally Famous Band or Comedian'.");
      String entertainmentType = console.readLine();

      Event plannedEvent = new Event(guestNumber, foodCuisine, mealAmount, mealType, drinkType, entertainmentType);

      while(plannedEvent.getGuestNumber() < 0) {
        System.out.println("I'm sorry, you can't have an event with a negative amount of people. Please enter a positive whole number");
        guestStringNumber = console.readLine();
        guestNumber = Integer.parseInt(guestStringNumber);
        plannedEvent.setGuestNumber(guestNumber);
      }

      while(!plannedEvent.checkFoodCuisine()) {
        System.out.println("Oops! looks like you entered something that was not one of our options. Please re-enter you preference.");
        System.out.println("Our food cuisine options are: 'American', 'Mexican', 'Indian', 'Italian', 'Japanese', or 'French'.");
        foodCuisine = console.readLine();
        plannedEvent.setFoodCuisine(foodCuisine);
      }

      while(!plannedEvent.checkMealAmount()) {
        System.out.println("Oops! looks like you entered something that was not one of our options. Please re-enter you preference.");
        System.out.println("Our portion sizes are: 'Small', 'Medium', 'Large', or 'Light Snacks'.");
        mealAmount = console.readLine();
        plannedEvent.setMealAmount(mealAmount);
      }

      while(!plannedEvent.checkMealType()) {
        System.out.println("Oops! looks like you entered something that was not one of our options. Please re-enter you preference.");
        System.out.println("Our meal preferences are: 'Vegan', 'Vegeterian', or 'No Preference'.");
        mealType = console.readLine();
        plannedEvent.setMealType(mealType);
      }

      while(!plannedEvent.checkDrinkType()) {
        System.out.println("Oops! looks like you entered something that was not one of our options. Please re-enter you preference.");
        System.out.println("Our drink bar options are: 'Soda Bar', 'Juice Bar', 'Soda and Juice Bar', 'Assorted Local Beer', 'Assorted Beer with Select Cocktails', or 'Full Bar'.");
        drinkType = console.readLine();
        plannedEvent.setDrinkType(drinkType);
      }

      while(!plannedEvent.checkEntertainmentType()) {
        System.out.println("Oops! looks like you entered something that was not one of our options. Please re-enter you preference.");
        System.out.println("Our entertainment options are: 'Our Own Staff DJ', 'A Local Struggling Comedian', 'A Local Struggling Artist', 'A Well Known Local Comedian', 'A Well Known Local Band', or 'A Nationally Famous Band or Comedian'.");
        entertainmentType = console.readLine();
        plannedEvent.setEntertainmentType(entertainmentType);
      }

      plannedEvent.calculateCost();

      System.out.println("Alright! here is your order:");
      System.out.println("-----------------------------");
      System.out.println("Guest Number: " + plannedEvent.getGuestNumber());
      System.out.println("Food Cuisine: " + plannedEvent.getFoodCuisine());
      System.out.println("Portion Size: " + plannedEvent.getMealAmount());
      System.out.println("Meal Preference: " + plannedEvent.getMealType());
      System.out.println("Beverages: " + plannedEvent.getDrinkType());
      System.out.println("Entertainment: " + plannedEvent.getEntertainmentType());
      System.out.println("Estimated Cost: $" + plannedEvent.getCost() + "0");
      System.out.println("-----------------------------");
      while(!planAgain.equalsIgnoreCase("yes") && !planAgain.equalsIgnoreCase("no")) {
        System.out.println("Would you like to plan another event? Type 'yes' or 'no'");
        planAgain = console.readLine();
        if(!planAgain.equalsIgnoreCase("yes")) {
          planEvent = false;
        }
      }
      planAgain = "";
    }
  }
}
