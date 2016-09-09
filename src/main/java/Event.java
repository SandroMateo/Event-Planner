class Event {

  private int mGuestNumber;
  private String mFoodType;
  private String mDrinkType;
  private String mEntertainmentType;
  private int mCost;

  public Event(int guestNumber, String foodType, String drinkType, String entertainmentType) {
    mGuestNumber = guestNumber;
    mFoodType = foodType;
    mDrinkType = drinkType;
    mEntertainmentType = entertainmentType;
  }

  public int getGuestNumber() {
    return mGuestNumber;
  }

  public String getFoodType() {
    return mFoodType;
  }

  public String getDrinkType() {
    return mDrinkType;
  }

  public String getEntertainmentType() {
    return mEntertainmentType;
  }

  public int getCost() {
    return mCost;
  }
}
