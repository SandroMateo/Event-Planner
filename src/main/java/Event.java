class Event {

  private double mGuestNumber;
  private float mCost;
  private String mFoodCuisine;
  private String mMealAmount;
  private String mMealType;
  private String mDrinkType;
  private String mEntertainmentType;
  private double[] mCostArray = {10, 15, 20, 25, 30, 35};
  private double[] mMealCostArray = {1, 1.5, 2, 0.75};
  private String[] mFoodCuisineArray = {"American", "Mexican", "Indian", "Italian", "Japanese", "French"};
  private String[] mMealAmountArray = {"Small", "Medium", "Large", "Light Snacks"};
  private String[] mMealTypeArray = {"Vegan", "Vegeterian", "No Preference", ""};
  private String[] mDrinkArray = {"Soda Bar", "Juice Bar", "Soda and Juice Bar", "Assorted Local Beer", "Assorted Beer with Select Cocktails", "Full Bar"};
  private String[] mEntertainmentArray = {"Our Own Staff DJ", "A Local Struggling Comedian", "A Local Struggling Artist", "A Well Known Local Comedian", "A Well Known Local Band", "A Nationally Famous Band or Comedian"};

  public Event(double guestNumber, String foodCuisine, String mealAmount, String mealType, String drinkType, String entertainmentType) {
    mGuestNumber = guestNumber;
    mFoodCuisine = foodCuisine;
    mMealAmount = mealAmount;
    mMealType = mealType;
    mDrinkType = drinkType;
    mEntertainmentType = entertainmentType;
  }

  public double getGuestNumber() {
    return mGuestNumber;
  }

  public String getFoodCuisine() {
    return mFoodCuisine;
  }

  public String getMealAmount() {
    return mMealAmount;
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

  public double getCost() {
    return mCost;
  }

  public void setFoodCuisine(String foodCuisine) {
    mFoodCuisine = foodCuisine;
  }

  public void setMealAmount(String mealAmount) {
    mMealAmount = mealAmount;
  }

  public void setMealType(String mealType) {
    mMealType = mealType;
  }

  public void setDrinkType(String drinkType) {
    mDrinkType = drinkType;
  }

  public void setEntertainmentType(String entertainmentType) {
    mEntertainmentType = entertainmentType;
  }

  public boolean checkFoodCuisine() {
    for(int i = 0; i < mFoodCuisineArray.length; i++) {
      if(mFoodCuisine.equalsIgnoreCase(mFoodCuisineArray[i])) {
        return true;
      }
    }
    return false;
  }

  public boolean checkMealAmount() {
    for(int i = 0; i < mMealAmountArray.length; i++) {
      if(mMealAmount.equalsIgnoreCase(mMealAmountArray[i])) {
        return true;
      }
    }
    return false;
  }

  public boolean checkMealType() {
    for(int i = 0; i < mMealTypeArray.length; i++) {
      if(mMealType.equalsIgnoreCase(mMealTypeArray[i])) {
        return true;
      }
    }
    return false;
  }

  public boolean checkDrinkType() {
    for(int i = 0; i < mDrinkArray.length; i++) {
      if(mDrinkType.equalsIgnoreCase(mDrinkArray[i])) {
        return true;
      }
    }
    return false;
  }

  public boolean checkEntertainmentType() {
    for(int i = 0; i < mEntertainmentArray.length; i++) {
      if(mEntertainmentType.equalsIgnoreCase(mEntertainmentArray[i])) {
        return true;
      }
    }
    return false;
  }

  public void calculateCost() {
    for (int i = 0; i < mCostArray.length; i++) {
      if(mFoodCuisine.equalsIgnoreCase(mFoodCuisineArray[i])) {
        mCost += mCostArray[i];
      }
      if(mDrinkType.equalsIgnoreCase(mDrinkArray[i])) {
        mCost += mCostArray[i];
      }
      if(mEntertainmentType.equalsIgnoreCase(mEntertainmentArray[i])) {
        mCost += mCostArray[i];
      }
    }
    for(int j = 0; j < mMealCostArray.length; j++) {
      if(mMealAmount.equalsIgnoreCase(mMealAmountArray[j])) {
        mCost *= mMealCostArray[j];
      }
      if(mMealType.equalsIgnoreCase(mMealTypeArray[j])) {
        mCost *= mMealCostArray[j];
      }
    }
    mCost *= mGuestNumber;
  }
}
