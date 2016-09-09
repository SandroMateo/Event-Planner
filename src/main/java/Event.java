class Event {

  private int mGuestNumber;
  private float mCost;
  private String mFoodType;
  private String mFoodAmount;
  private String mMealType;
  private String mDrinkType;
  private String mEntertainmentType;
  private int[] mCostArray = {10, 15, 20, 25, 30, 35};
  private String[] mFoodTypeArray = {"American", "Mexican", "Indian", "Italian", "Japanese", "French"};
  private String[] mDrinkArray = {"Soda Bar", "Juice Bar", "Soda and Juice Bar", "Assorted Local Beer", "Assorted Beer with Select Cocktails", "Full Bar"};
  private String[] mEntertainmentArray = {"Our Own Staff DJ", "A Local Struggling Comedian", "A Local Struggling Artist", "A Well Known Local Comedian", "A Well Known Local Band", "A Nationally Famous Band or Comedian"};

  public Event(int guestNumber, String foodType, String foodAmount, String mealType, String drinkType, String entertainmentType) {
    mGuestNumber = guestNumber;
    mFoodType = foodType;
    mFoodAmount = foodAmount;
    mMealType = mealType;
    mDrinkType = drinkType;
    mEntertainmentType = entertainmentType;
  }

  public int getGuestNumber() {
    return mGuestNumber;
  }

  public String getFoodType() {
    return mFoodType;
  }

  public String getFoodAmount() {
    return mFoodAmount;
  }

  public String getMealType() {
    return mMealType;
  }

  public String getDrinkType() {
    return mDrinkType;
  }

  public String getEntertainmentType() {
    return mEntertainmentType;
  }

  public float getCost() {
    return mCost;
  }
}
